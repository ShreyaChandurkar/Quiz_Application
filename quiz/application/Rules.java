package quiz.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Rules extends JFrame implements ActionListener{
        String name;
        JButton start,back;
    Rules(String name){
        this.name = name;

        ImageIcon icon = new ImageIcon(ClassLoader.getSystemResource("icons/icon.png"));
        setIconImage(icon.getImage());

        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel heading =new JLabel("Welcome " + name + "!!");
        heading.setBounds(50, 40, 900,45);
        heading.setFont(new Font("Mongolian Baiti", Font.BOLD, 40));
        heading.setForeground(new Color(153, 0,0));
        add(heading);

        JLabel rules =new JLabel("Instructions");
        rules.setBounds(20, 70, 900,500);
        rules.setFont(new Font("Arial", Font.PLAIN, 15));
        rules.setText(
                "<html>"+
                        "1. Read the instructions carefully: Understand the guidelines, time limit, and any specific rules for the exam." + "<br><br>" +
                        "2. Check your internet connection: Ensure you have a stable internet connection to avoid any interruptions during the exam." + "<br><br>" +
                        "3. Find a quiet and distraction-free environment: Minimize distractions and noise around you to maintain focus during the exam." + "<br><br>" +
                        "4. Manage your time effectively: With only 15 seconds per question, quickly read and answer each question without spending too much time." + "<br><br>" +
                        "5. Save the 50-50 lifeline: Preserve your one-time 50-50 lifeline for questions that you find particularly challenging or uncertain about the answer." + "<br><br>" +
                        "6. Activate the 50-50 lifeline strategically: When using the 50-50 lifeline, it will eliminate two incorrect answer options, leaving you with two possible choices to select from." + "<br><br>" +
                        "7. Manage your time effectively: With only 15 seconds per question and no revisiting allowed, read and answer each question quickly and confidently." + "<br><br>" +
                        "8. Submit before the deadline: Ensure you submit your answers promptly before the overall time limit expires to avoid disqualification or incomplete submissions." + "<br><br>" +
                        "9. Be calm and give your best: Maintain a calm and composed mindset throughout the exam. Don't let stress or anxiety overwhelm you. Trust in your preparation, stay focused, and give your best effort to each question. " +
                        "Approach the exam with a positive attitude and believe in your abilities. Good luck!" + "<br><br>" +

                        "<html>"
        );
        add(rules);

        back = new JButton("Back");
        back.setBounds(300,550,100,40);
        back.setBackground(new Color(153,204,255));
        back.addActionListener(this);
        add(back);

        start = new JButton("Start");
        start.setBounds(500,550,100,40);
        start.setBackground(new Color(153,204,255));
        start.addActionListener(this);
        add(start);

        setTitle("Multiple Choice Questions Exam");
        setSize(950, 650);
        setLocation(300,50);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == start){
            setVisible(false);
            new Quiz(name);
        }else{
            setVisible(false);
            new Login();
        }
    }

    public static void main(String[] args) {
        new Rules("User");
    }

}
