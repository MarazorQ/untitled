package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.*;


public class Main {

    public static void main(String[] args) {

    Window frame= new Window();


      //JColorChooser color= new JColorChooser();
      //color.setSize(300,300);
      //color.setLocation(300,800);

      //frame.add(color);
        JButton button = new JButton("Нарисовать");
        button.addActionListener((ActionEvent e) -> {
            PaintFigure paintFigure =new PaintFigure();

            frame.add(paintFigure,new GridBagConstraints(0,0,1,1,1,1, GridBagConstraints.NORTH, GridBagConstraints.BOTH,
                    new Insets(2,2,2,2),0,0));

        });

        frame.add(button);
        frame.setVisible(true);

    }
}
