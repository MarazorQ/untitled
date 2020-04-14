package com.company;
import javax.swing.*;
import  java.awt.*;






public class Window extends JFrame {
    public Window(){
     /*   super("MyWindow");
        setSize(800,800);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
*/

       setTitle("MyWindow");
        setSize(new Dimension(800,800));
        setLocationRelativeTo(null);
        setLayout(new GridBagLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);









    }

    /*public void paint (Graphics g) {
        Graphics2D gr2d=(Graphics2D) g;
        gr2d.setBackground(Color.cyan);
        gr2d.setColor(Color.red);
        gr2d.fillRect(50,50,100,100);
        gr2d.fillOval(200,200,50,50);
        gr2d.fillRoundRect(300,300,300,100,500,500);
        gr2d.fillRect(450,450,100,50);
        gr2d.fillArc(600,600,100,100,100,100);
    }*/
}
