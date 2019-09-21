import javax.swing.*;

public class PasswordFieldExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Password Field Example");
        JPasswordField value = new JPasswordField();
        JLabel l1 = new JLabel("Password:");
        l1.setBounds(20, 100, 80, 30);
        value.setBounds(100, 100, 100, 30);
        frame.add(value);
        frame.add(l1);
        frame.setSize(300, 300);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}