package Capgemini;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserInterfaceExample {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Greeting App");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            // Creating components
            JPanel panel = new JPanel();
            JTextField nameField = new JTextField(20);
            JButton greetButton = new JButton("Greet");
            JLabel greetingLabel = new JLabel("Greeting will appear here.");

            // Adding components to the panel
            panel.add(new JLabel("Enter your name: "));
            panel.add(nameField);
            panel.add(greetButton);
            panel.add(greetingLabel);

            // Adding action listener to the button
            greetButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String name = nameField.getText();
                    String greeting = "Hello, " + name + "!";
                    greetingLabel.setText(greeting);
                }
            });

            // Setting up the frame
            frame.getContentPane().add(panel);
            frame.setSize(400, 200);
            frame.setLocationRelativeTo(null); // Center the frame
            frame.setVisible(true);
        });
    }
}
