import java.awt.Color;
import java.awt.Font;

import javax.swing.*;
public class Example_of_Project extends JFrame {
    Example_of_Project(){
        setSize(1200,500);
        setLocation(50,50);
        setVisible(true);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("first.jpg"));
        JLabel image = new JLabel(i1);
        setLayout(new java.awt.BorderLayout());
        add(image);
        System.out.println(i1.getImageLoadStatus());
        JLabel text = new JLabel("HOTEL MANAGEMENT SYSTEM");
        text.setBounds(20,350,800,50);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("serif",Font.ITALIC,50));
        image.add(text);
           setVisible(true);
          while(true){
            text.setVisible(false);
            try{
                Thread.sleep(500);
            }
            catch(Exception e){e.printStackTrace();}
           text.setVisible(true);
            try{
                Thread.sleep(700);
            }
            catch(Exception e){e.printStackTrace();}

          } 

    }
    public static void main(String[] args) {
        new Example_of_Project();
    }
}
