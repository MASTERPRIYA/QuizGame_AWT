package quiztime;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class Rules extends JFrame implements ActionListener {
    String name;
    JButton start,back;
    
    Rules(String name){
        // to get user name from textfield that is in login.java
        this.name=name;
        
        getContentPane(). setBackground(Color.WHITE);
        setLayout(null);
        setSize(1100,500);
        setLocation(200,200);
        
        JLabel welcome = new JLabel("Welcome " + name + " To Simple Minds");
        welcome.setBounds(100,50,500,40);
        welcome.setFont(new Font("Viner Hand ITC", Font.BOLD, 30));
        welcome.setForeground( new Color(0,191,255));
        add(welcome);
        
        
        JLabel instruction = new JLabel();
        instruction.setBounds(100,20,500,450);
        instruction.setFont(new Font("Tahoma", Font.PLAIN, 16));
        instruction.setText("<html>" +
                "1. All questions contains equal marks. <br><br>"+
                "2. There is a specific time to solve each question.<br><br>"+
                "3. If you will not able to select the answer  on time the question automatically switched to next.<br><br>"+
                "4. If your score is less than 30  that means you lost the game.<br><br>"+
        "<html>");
        add(instruction);
        
        start = new JButton("Start");
        start.setBounds(100,380,80,30);
        start.setBackground( Color.BLUE);
        start.setForeground(Color.WHITE);
        add(start);
        
        back = new JButton("Back");
        back.setBounds(400,380,80,30);
        back.setBackground( Color.BLUE);
        back.setForeground(Color.WHITE);
        add(back);

        
        setVisible(true);
    
}
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource()==start){
            setVisible(false);
            new Quiz(name);
        }else{
            setVisible(false);
            new Login();
        }
        
    }
    public static void main(String[] args){
        new Rules("User"); // when user do not write any name so default name is print user.
    }
    
}
