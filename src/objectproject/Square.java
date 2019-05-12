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
public class Square implements Shape {
    private String x_y;
    private int width;

    public Square() {
       x_y=null;
       width=1;
    }
    public Square(String x_y,int width) {
        this.x_y=x_y;
        
        this.width = width;
        
    }

    public String getX_y() {
        return x_y;
    }

    public void setX_y(String x_y) {
        this.x_y = x_y;
    }

    @Override
    public double calculateArea() {
       
        return getWidth() * getWidth();
    }

    @Override
    public double calculatePerimeter() {
      
        return 4*getWidth() ;
    }
    @Override
    public String toString() {
        return "Square=>> Koordinatlar"+getX_y()+" Kenarlar("+ getWidth() +","+getWidth()
                +")"+"  Alan="+calculateArea()+"  Cevre="+calculatePerimeter();
        
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
     * @return the x
     */
   

}

