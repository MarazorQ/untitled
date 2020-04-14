package com.company;

import javax.swing.*;
import java.awt.*;

public class PaintFigure extends JPanel {

    private Line line ;
    private Rectangle rectangle;
    private Circle circle;
    private Rectangle rectangle1;
    private RoundRectangle rectangle2;




    public PaintFigure(){
      line = new Line(25,150,78,2);
      rectangle = new Rectangle(200,100,100,100);
      circle = new Circle(300,300,100,150);
      rectangle2 = new RoundRectangle(450,450,100,200,20,20);




    }
    public void paint (Graphics g) {
        Graphics2D gr2d=(Graphics2D) g;
        gr2d.setColor(Color.blue);
       gr2d.draw(line);
       gr2d.setColor(Color.cyan);
       gr2d.fill(rectangle);
       gr2d.setColor(Color.GREEN);
       gr2d.fill(circle);
       gr2d.setColor(Color.RED);
       gr2d.fill(rectangle2);
    }
}
