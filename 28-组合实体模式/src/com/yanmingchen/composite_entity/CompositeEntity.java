package com.yanmingchen.composite_entity;

/**
 * @Author: YanmingChen
 * @Date: Create in 10:54 2018/6/15
 * @Description:组合实体类
 */
public class CompositeEntity {

    private CoarseGrainedObject cgo = new CoarseGrainedObject();

    public void setData(String data1, String data2){
        cgo.setData(data1, data2);
    }

    public String[] getData(){
        return cgo.getData();
    }

}
