package com.company;

import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;


public class Circle extends Ellipse2D {

    private double height;
    private double width;

    private Point point;

//    public Circle(){
//        point =new Point();
//
//    }
    public  Circle(double x, double y, double height, double width) {
        point = new Point(x,y);
        this.width=width;
        this.height=height;

    }
    @Override
    public double getX() {
        return point.getX();
    }

    @Override
    public double getY() {
        return point.getY();
    }

    @Override
    public double getWidth() {
        return width;
    }

    @Override
    public double getHeight() {
        return height;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public void setFrame(double x, double y, double height, double width) {
        point.setLocation(x,y);
        this.width=width;
        this.height=height;

    }


    @Override
    public Rectangle2D getBounds2D() {
        return null;
    }
}
