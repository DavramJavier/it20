package topic_3_stack_calculator;


/**
 *
 * @author kent ryan pagongpong
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;

public class StackCalculator extends JFrame implements ActionListener {
    private Stack<Integer> stack = new Stack<>();
    private JTextArea display;

    public StackCalculator() {
        // Set up the JFrame
        setTitle("Stack Calculator");
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(10, 10));
        setResizable(false);

        // Display area for the stack (smaller size)
        display = new JTextArea(3, 20);
        display.setEditable(false);
        display.setFont(new Font("Arial", Font.PLAIN, 16));
        display.setMargin(new Insets(10, 10, 10, 10)); // Margin inside the display area
        JScrollPane scrollPane = new JScrollPane(display);
        add(scrollPane, BorderLayout.NORTH);

        
    }
}