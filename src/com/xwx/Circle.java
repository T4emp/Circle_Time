package com.xwx;

public class Circle{
    private double radius;
    private String color;

    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }
    //Generate -> Getter & Setter -> radius:double & color:String

    @Override
    public String toString(){
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
    //Generate -> toString() -> radius:double & color:String
}
