package quiz.application;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Score extends JFrame implements ActionListener {

    Score(String name, int score){
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        ImageIcon icon = new ImageIcon(ClassLoader.getSystemResource("icons/icon.png"));
        setIconImage(icon.getImage());

        ImageIcon i1 = new ImageIcon(ClassLoader. getSystemResource("icons/Score.png"));
        Image i2 = i1.getImage().getScaledInstance(900,580,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 150, 900, 580 );
        add(image);

        JLabel heading = new JLabel("Thank You " +name+ " for giving the test.");
        heading.setBounds(450,80,900,50);
        heading.setFont(new Font("Mongolian Baiti",Font.BOLD,40));
        add(heading);

        JLabel scored = new JLabel("Your Score is " +score);
        scored.setBounds(1100,300,900,50);
        scored.setFont(new Font("Mongolian Baiti",Font.BOLD,30));
        add(scored);

        JButton Exit = new JButton("Exit");
        Exit.setBounds(1150,400,100,40);
        Exit.setBackground(new Color(153,204,255));
        Exit.addActionListener(this);
        add(Exit);

        setTitle("Multiple Choice Questions Exam");
        setExtendedState(JFrame.MAXIMIZED_BOTH); // Set the frame to be maximized
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        setVisible(false);
    }

    public static void main(String[] args) {
        new Score("User", 0);
    }


}
