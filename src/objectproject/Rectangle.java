/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectproject;

/**
 *
 * @author MİNE AYGÜN
 */
public class Rectangle implements Shape{
     
    private int width, height; //sides
    private String x_y;
    public Rectangle() {
      width=1;
      height=1;
      x_y=null;
    }
    public Rectangle(String x_y,int width, int height) {
        this.x_y= x_y;
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        
        return getWidth() * getHeight();
    }

    @Override
    public double calculatePerimeter() {
   
        return 2 * (getWidth() + getHeight());
    }
    @Override
    public String toString() {
        return "Rectangle=>> Koordinatlar"+getX_y()+" Kenarlar("+ getWidth() +","+
                getHeight()+")"+" Alan="+calculateArea()+"  Cevre="+calculatePerimeter();
        
    }

    /**
     * @return the width
     */
    public int getWidth() {
        return width;
    }

    /**
     * @param width the width to set
     */
    public void setWidth(int width) {
        this.width = width;
    }

    /**
     * @return the height
     */
    public int getHeight() {
        return height;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(int height) {
        this.height = height;
    }

    public String getX_y() {
        return x_y;
    }

    public void setX_y(String x_y) {
        this.x_y = x_y;
    }


}

