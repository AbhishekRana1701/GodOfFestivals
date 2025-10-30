
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class TemperatureConverter extends JFrame {
    private JTextField celsiusField;
    private JButton convertButton;
    private JLabel resultLabel;
    private JButton openPopupBtn;

    public TemperatureConverter() {

        setTitle("Celsius to Fahrenheit Converter");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        JLabel celsiusLabel = new JLabel("Enter temperature in Celsius:");
        celsiusField = new JTextField(10);
        convertButton = new JButton("Convert");

        
        openPopupBtn = new JButton("Open Hst Dialog");
        openPopupBtn.setPreferredSize(new Dimension(200, 40));
        openPopupBtn.setFont(new Font("SansSerif", Font.BOLD, 14));
        openPopupBtn.setBackground(new Color(0x4285F4));
        openPopupBtn.setForeground(Color.WHITE);
        

        // Action to open the custom popup
        openPopupBtn.addActionListener(e -> {
            HstDialog.showDialog(this);  // Show the popup from another class
        });

        resultLabel = new JLabel("Fahrenheit: ");

        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                convertTemperature();
            }
        });

        add(celsiusLabel);
        add(celsiusField);
        add(convertButton);
        add(resultLabel);
        add(openPopupBtn);
    }

    private void convertTemperature() {
        try {
            double celsius = Double.parseDouble(celsiusField.getText());
            double fahrenheit = (celsius * 9/5) + 32;
            resultLabel.setText(String.format("Fahrenheit: %.2f", fahrenheit));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please enter a valid number.", "Input Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            TemperatureConverter converter = new TemperatureConverter();
            converter.setVisible(true);
        });
    }
}