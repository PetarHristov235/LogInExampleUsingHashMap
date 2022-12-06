import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class SignInPage implements ActionListener {

    JFrame frame = new JFrame();
    JButton loginButton = new JButton("Sign In");
    JButton resetButton = new JButton("Reset");
    JTextField userIdField = new JTextField();
    JPasswordField userPasswordField = new JPasswordField();
    JLabel userIdLabel = new JLabel("User ID:");
    JLabel userPasswordLabel = new JLabel("password:");
    JLabel messageLabel = new JLabel("Create an account");
    HashMap<String, String> loginInfo;

    SignInPage(final HashMap<String, String> loginInfoOriginal) {
        loginInfo = loginInfoOriginal;

        userIdLabel.setBounds(50, 100, 75, 25);
        userPasswordLabel.setBounds(50, 150, 75, 25);

        messageLabel.setBounds(125, 250, 250, 35);
        messageLabel.setFont(new Font(null, Font.ITALIC, 20));

        userIdField.setBounds(125, 100, 200, 25);
        userPasswordField.setBounds(125, 150, 200, 25);

        loginButton.setBounds(125, 200, 100, 25);
        loginButton.setFocusable(false);
        loginButton.addActionListener(this);

        resetButton.setBounds(225, 200, 100, 25);
        resetButton.setFocusable(false);
        resetButton.addActionListener(this);

        frame.add(userIdLabel);
        frame.add(userPasswordLabel);
        frame.add(messageLabel);
        frame.add(userIdField);
        frame.add(userPasswordField);
        frame.add(loginButton);
        frame.add(resetButton);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(final ActionEvent e) {
        if (e.getSource() == resetButton) {
            userIdField.setText("");
            userPasswordField.setText("");
        }

        if (e.getSource() == loginButton) {

            final String userID = userIdField.getText();
            final String password = String.valueOf(userPasswordField.getPassword());

            if (loginInfo.containsKey(userID)) {
                messageLabel.setText("User exists.");
            } else {
                loginInfo.put(userID, password);
                new LoginPage(loginInfo);
            }
        }
    }
}

