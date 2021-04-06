import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Form extends JFrame {
    private Container c;
    private JTextField tf1;
    private JLabel Label;
    private JPasswordField pf;
    private  JButton btn1;
    private  JButton btn2;
    private  JButton btn3;

    Form() {

        this.method();
    }

    public void method() {
        this.c = this.getContentPane();
        this.c.setLayout((LayoutManager)null);
        this.c.setBackground(Color.white);


        this.Label= new JLabel("E-Mail:");
        this.Label.setBounds(50, 50, 200, 50);
        this.c.add(this.Label);

        this.tf1 = new JTextField();
        this.tf1.setBounds(130, 50, 200, 50);
        this.tf1.setBackground(Color.white);
        this.c.add(this.tf1);

        this.btn1= new JButton("Clear");
        this.btn1.setBounds(350, 50, 150, 50);
        this.c.add(this.btn1);


        this.Label= new JLabel("Password:");
        this.Label.setBounds(50, 110, 200, 50);
        this.c.add(this.Label);

        this.pf = new JPasswordField();
        this.pf.setEchoChar('*');
        this.pf.setForeground(Color.black);
        this.pf.setBackground(Color.white);
        this.pf.setBounds(130, 110, 200, 50);
        this.c.add(this.pf);

        this.btn2= new JButton("Clear");
        this.btn2.setBounds(350, 110, 150, 50);
        this.c.add(this.btn2);

        this.btn3= new JButton("Submit");
        this.btn3.setBackground(Color.green);
        this.btn3.setBounds(50, 200, 450, 50);
        this.c.add(this.btn3);



        this.btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tf1.setText(null);
            }
        });
        this.btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                pf.setText(null);
            }
        });
        this.btn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog((Component)null, "You info has been submitted!", "Message", -1);
            }
        });


    }

    public static void main(String[] args) {
        Form frame = new Form();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(3);
        frame.setBounds(800, 500, 800, 600);
        frame.setTitle("Login form");

    }
}

