package com.quicksort;

import java.util.ArrayList;
import java.util.List;
//复制IP题解
public class Solution {
    public static void main(String[] args) {
        String s = "0000";
        System.out.println(solution.restoreIpAddresses(s));
    }

    // cur: 当前答案,以List<String>的形式,最后再join成String形式,例如[[255],[255],[111],[35]] -> 255.255.111.35
    // pos: 当前扫描到的s的位置
    // ans: 最终答案
    public static void backtracking(String s, int pos, List<String> cur, List<String> ans) {
        // [[255],[255],[111],[35]] List<String>长度 = 4
        if (cur.size() >= 4) {
            if (pos == s.length()) {
                ans.add(String.join(".", cur));
            }
            return;
        }
        // 分割得到ip地址的一段后,下一段只能在长度1-3范围内选择
        for (int i = 1; i <= 3; i++) {
            if (pos+i > s.length()) {
                break;
            }
            String segment = s.substring(pos, pos+i);
            // 剪枝条件：不能以0开头，不能大于255
            if (segment.startsWith("0") && segment.length() > 1 || (i == 3 && Integer.parseInt(segment) > 255)) {
                continue;
            }
            cur.add(segment);
            // 注意此处传的参数
            backtracking(s, pos+i, cur, ans);
            cur.remove(cur.size()-1);
        }
    }
    public static List<String> restoreIpAddresses(String s) {
        List<String> ans = new ArrayList<>();
        backtracking(s, 0, new ArrayList<>(), ans);
        return ans;
    }
}
