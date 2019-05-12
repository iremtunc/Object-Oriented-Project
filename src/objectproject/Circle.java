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
public class Circle implements Shape {
    private String x_y;
    private int radius;
    private double pi = Math.PI;

    public Circle() {
       
    }   
    public Circle(String x_y,int radius) {
        this.x_y=x_y;
        
        this.radius = radius;
    }

    public String getX_y() {
        return x_y;
    }

    public void setX_y(String x_y) {
        this.x_y = x_y;
    }

    @Override
    public double calculateArea() {
       
        return getPi() * Math.pow(getRadius(), 2);
    }

    public double calculatePerimeter() {
        
        return 2 * getPi() * getRadius();
    }
    @Override
    public String toString() {
        return "Circle=>> Koordinatlar"+getX_y()+" Cemberin Yarıçapı="+ getRadius()
                +"  Alan="+calculateArea()+"  Cevre="+calculatePerimeter();
        
    }

    /**
     * @return the radius
     */
    public int getRadius() {
        return radius;
    }

    /**
     * @param radius the radius to set
     */
    public void setRadius(int radius) {
        this.radius = radius;
    }

    /**
     * @return the pi
     */
    public double getPi() {
        return pi;
    }

    /**
     * @param pi the pi to set
     */
    public void setPi(double pi) {
        this.pi = pi;
    }
}

