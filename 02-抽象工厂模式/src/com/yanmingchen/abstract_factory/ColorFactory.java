package com.yanmingchen.abstract_factory;

/**
 * @Author: YanmingChen
 * @Date: Create in 14:23 2018/6/14
 * @Description:颜色工厂类
 */
public class ColorFactory extends AbstractFactory {

   private static final String RED = "red";
   private static final String GREEN = "green";
   private static final String BLUE = "blue";
    
   @Override
   public Shape getShape(String shapeType){
      return null;
   }
   
   @Override
   public Color getColor(String color) {
      if(color == null){
         return null;
      }        
      if(RED.equalsIgnoreCase(color)){
         return new Red();
      } else if(GREEN.equalsIgnoreCase(color)){
         return new Green();
      } else if(BLUE.equalsIgnoreCase(color)){
         return new Blue();
      }
      return null;
   }
}