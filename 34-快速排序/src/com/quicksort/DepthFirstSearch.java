/*
深度优先遍历（Depth First Search）简介：

先从根节点沿着（左或者右）分支走到底，当再也没有叶子节点之后，返回上一节点，如果上一个节点还有另外一个子节点，那么遍历这个节点分支直至再也没有叶子节点，之后重复上面的过程


例如上图按照先遍历左分支再遍历右分支的深度优先遍历顺序就是：
A B D E C F G
*/
package com.quicksort;

import java.util.Stack;

/**
 * @author huchenfei
 * @version 1.0
 * @className DeepFirstSearch
 * @description 二叉树深度遍历算法
 * @date 2020/6/2 15:38
 **/
public class DepthFirstSearch {

    private static class Node {
        /**
         * 节点值
         */
        public int value;
        /**
         * 左节点
         */
        public Node left;
        /**
         * 右节点
         */
        public Node right;

        public Node(int value) {
            this.value = value;
        }

    }

    public static void main(String... args) {
        Node head = new Node(1);
        Node second = new Node(2);
        Node three = new Node(3);
        Node four = new Node(4);
        Node five = new Node(5);
        Node six = new Node(6);
        Node seven = new Node(7);

        head.right = three;
        head.left = second;
        second.right = five;
        second.left = four;
        three.right = seven;
        three.left = six;
        System.out.println("递归方式 -> 深度优先遍历结果: ");
        recursiveDfs(head);
        System.out.println();
    }

    /**
     * 递归方式实现 DFS
     *
     * @param head 二叉树
     */
    public static void recursiveDfs(Node head) {
        if (head == null) {
            return;
        }
        System.out.print(head.value);
        System.out.print(" ");
        // 遍历左节点
        recursiveDfs(head.left);
        // 遍历右节点
        recursiveDfs(head.right);
    }

   2 BFS
//使用Queue实现BFS
public void BFSWithQueue(TreeNode root) {
    Queue<TreeNode> queue = new LinkedList<>();
    if (root != null)
        queue.add(root);
    while (!queue.isEmpty()) {
        TreeNode treeNode = queue.poll();
        if (treeNode.left != null)
            queue.add(treeNode.left);
        if (treeNode.right != null)
            queue.add(treeNode.right);
    }
}
}
