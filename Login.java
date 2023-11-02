/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quiztime;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Login extends JFrame implements ActionListener {
    
    JButton rules,exit;
    JTextField text ;
    
    Login(){
        getContentPane(). setBackground(Color.WHITE);
        setLayout(null);
        
        setSize(1200,500);
        setLocation(200,200);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login.jpeg"));
        JLabel login = new JLabel(i1);
        login.setBounds(0,0,600,500);
        add(login);
        
        JLabel heading = new JLabel("Simple Minds");
        heading.setBounds(750,60,300,45);
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 40));
        heading.setForeground(new Color(0,191,255));
        add(heading);
        
        
        JLabel name = new JLabel("Enter Your Name");
        name.setBounds(790,150,300,45);
        name.setFont(new Font("Arial", Font.BOLD, 20));
        name.setForeground(new Color(0,191,255));
        add(name);
        
        text = new JTextField();
        text.setBounds(770,250,200,30);
        text.setFont(new Font("Times New Roman",Font.PLAIN,17));
        add(text);
        
        rules = new JButton("Rules");
        rules.setBounds(700,350,80,30);
        rules.setBackground( Color.BLUE);
        rules.setForeground(Color.WHITE);
        rules.addActionListener(this);
        add(rules);
        
        exit = new JButton("Exit");
        exit.setBounds(1000,350,80,30);
        exit.setBackground(Color.blue);
        exit.setForeground(Color.WHITE);
        exit.addActionListener(this);
        add(exit);
        
//        JLabel best = new JLabel("ALL  THE  BEST");
//        best.setBounds(900,400,300,45);
//        best.setFont(new Font("Viner Hand ITC", Font.BOLD, 20));
//        best.setForeground(Color.BLUE);
//        add(best);
        
        
        setVisible(true);
        
       
        
    }
    //it is complusory to make rules and back globally declaraed because the scope is in construtor only.
     public void actionPerformed(ActionEvent ae){
         
         if(ae.getSource()==rules){
             String name = text.getText();
             setVisible(false);
             new Rules(name);
         }
         else if(ae.getSource()== exit){ 
//press exit to close the application.
         setVisible(false);
     }
            
    }
     
    public static void main(String[] args){
        new Login();
    }
    
    
}
