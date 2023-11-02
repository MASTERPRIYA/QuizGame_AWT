/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quiztime;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class Score extends JFrame implements ActionListener {
    Score(String name , int score){
        
        getContentPane(). setBackground(Color.WHITE);
        setLayout(null);
        setSize(700,750);
        setLocation(50,30);
      
        
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icons/score.png"));
        Image i2 =i1.getImage().getScaledInstance(300,200,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(50,300,400,300);
        add(image);
        
        JLabel heading = new JLabel("Thankyou  " + name +" "+ " for playing Simple Minds");
        heading.setBounds(30,20,400,100);
        heading.setFont(new Font("Tahoma", Font.ITALIC,20));
        add(heading);
        
        JLabel lblscore = new JLabel("Your score is  " + score);
        lblscore.setBounds(30,100,400,100);
        lblscore.setFont(new Font("Tahoma", Font.BOLD,20));
        add(lblscore);
        
         JButton again = new JButton("Play Again");
        again.setBounds(500,600,130,40);
        again.setBackground(Color.BLUE);
        again.setForeground(Color.WHITE);
        again.setFont(new Font("Tahoma",Font.PLAIN,15));
        again.addActionListener(this);
        add(again);
       
        
        setVisible(true);
        
      
        
    }
    public  void actionPerformed(ActionEvent ae){
        setVisible(false);
        new Login();
        
    }
    public static void main(String[] args){
        new Score("User",0);
    }
}
   