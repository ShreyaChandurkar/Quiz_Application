package quiz.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;

public class Login extends JFrame implements ActionListener {
    JButton rules, back;
    JTextField tfname;
    Login() {
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        ImageIcon icon = new ImageIcon(ClassLoader.getSystemResource("icons/icon.png"));
        setIconImage(icon.getImage());


        ImageIcon i1 = new ImageIcon(ClassLoader. getSystemResource("icons/Front.png"));
        Image i2 = i1.getImage().getScaledInstance(800,800,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 800, 800 );
        add(image);


        JLabel heading =new JLabel("Aspiring Minds");
        heading.setBounds(1060, 150, 300,45);
        heading.setFont(new Font("Mongolian Baiti", Font.BOLD, 40));
        heading.setForeground(new Color(255, 51,153));
        add(heading);

        JLabel name =new JLabel("Enter Your Name:");
        name.setBounds(1100, 300, 300,20);
        name.setFont(new Font("Mongolian Baiti", Font.BOLD, 25));
        add(name);

        tfname = new JTextField();
        tfname.setBounds(1080,350,250,40);
        tfname.setFont(new Font("Arial", Font.PLAIN, 20));
        add(tfname);

        rules = new JButton("Rules");
        rules.setBounds(1000,500,100,40);
        rules.setBackground(new Color(153,204,255));
        rules.addActionListener(this);
        add(rules);

        back = new JButton("Back");
        back.setBounds(1300,500,100,40);
        back.setBackground(new Color(153,204,255));
        back.addActionListener(this);
        add(back);

        setTitle("Multiple Choice Questions Exam");
        setExtendedState(JFrame.MAXIMIZED_BOTH); // Set the frame to be maximized
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == rules){
            String name = tfname.getText();
//            setVisible(false);
                new Rules(name);
        } else if (e.getSource() == back) {
            setVisible(false);
        }
    }

    public static void main(String[] args) {

        new Login();
    }


}
