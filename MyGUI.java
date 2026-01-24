import java.awt.event.*;
import javax.swing.*;

class MyGUI implements ActionListener{
    JButton btn;

    MyGUI(){
        JFrame frame = new JFrame("Event Demo");

        btn = new JButton("Click Me");
        btn.addActionListener(this);

        frame.add(btn);
        frame.setSize(300,200);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e){
        System.out.println("Button Click");
    }

    public static void main(String[] args) {
        new MyGUI();
    }
}

