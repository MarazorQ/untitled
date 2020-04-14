package com.company;

import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;

public class RoundRectangle extends RoundRectangle2D {
    private Point point;

    private double width;
    private double height;

    private  double ArcWidth;
    private  double ArcHeight;

//    public  RoundRectangle(){
//        point= new Point();
//    }
    public RoundRectangle(double x, double y, double width, double height,double ArcWidth,double ArcHeight){
        point= new Point(x,y);
        this.width=width;
        this.height=height;
        this.ArcWidth=ArcWidth;
        this.ArcHeight=ArcHeight;


    }

    @Override
    public double getArcWidth() {
        return ArcWidth;
    }

    @Override
    public double getArcHeight() {
        return ArcHeight;
    }

    @Override
    public void setRoundRect(double x, double y, double width, double height, double ArcWidth, double ArcHeight) {
        point.setLocation(x,y);
        this.width=width;
        this.height=height;
        this.ArcHeight=ArcHeight;
        this.ArcWidth=ArcWidth;

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
    public Rectangle2D getBounds2D() {
        return null;
    }
}
