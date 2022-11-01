import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddNum extends JFrame implements ActionListener {

    JLabel l1, l2; // define labels
    JTextField t1,t2,t3; // define text fields
    JButton b1; //define calculate button

    public AddNum(){ // constructor
        super("First Java Program"); // app title

        l1 = new JLabel("+"); // set label text
        l2 = new JLabel("=");


        t1 = new JTextField(3); // set Textfield size (numbers to hold visible)
        t2 = new JTextField(3);
        t3 = new JTextField(3);

        b1 = new JButton("Calculate"); // button settings
        b1.setBorderPainted(false);
        b1.setBackground(new Color(255,155,0));
        b1.setFocusPainted(false);

        setLayout(new FlowLayout(FlowLayout.TRAILING, 15, 10)); // layout style
        add(t1); // adding to interface
        add(l1);
        add(t2);
        add(l2);
        add(t3);


        add(b1);
        b1.addActionListener(this); //action listener for button click

        setSize(230,120); // size of window
        setVisible(true); // visibilty of window



    }

    @Override // actionlistener
    public void actionPerformed(ActionEvent e) {
        int a = Integer.parseInt(t1.getText()); // a + b = sum
        int b = Integer.parseInt(t2.getText());
        int sum=a+b;
        t3.setText(String.valueOf(sum)); // set sum value to textfield 3
    }

    public static void main(String[] args) { // main
        new AddNum();
    }
}
