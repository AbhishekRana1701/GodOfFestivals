// package swingExample;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.LineBorder;

public class HstDialog {
    public static void showDialog(JFrame parent) {
        // Create dialog
        JDialog dialog = new JDialog(parent, "Hst Dld", true);
        dialog.setSize(400, 250);
        dialog.setLocationRelativeTo(parent);
        dialog.setUndecorated(true);

        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                setOpaque(false);
                Graphics2D g2 = (Graphics2D) g.create();
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                g2.setColor(Color.WHITE);
                g2.fillRoundRect(0, 0, getWidth(), getHeight(), 30, 30);
                g2.dispose();
            }
        };
        panel.setLayout(null);

        // Header
        JPanel header = new JPanel(null);
        header.setBounds(0, 0, 400, 40);
        header.setBackground(new Color(0xE8EAED));

        JLabel title = new JLabel("Hst Dld");
        title.setFont(new Font("SansSerif", Font.BOLD, 14));
        title.setBounds(20, 10, 100, 20);

        JButton closeBtn = new JButton("✕");
        closeBtn.setBounds(360, 5, 30, 30);
        closeBtn.setFocusPainted(false);
        closeBtn.setBorderPainted(false);
        closeBtn.setContentAreaFilled(false);
        closeBtn.setFont(new Font("SansSerif", Font.BOLD, 14));
        closeBtn.setForeground(Color.DARK_GRAY);
        closeBtn.addActionListener(e -> dialog.dispose());

        header.add(title);
        header.add(closeBtn);

        // Dropdown
        JComboBox<String> comboBox = new JComboBox<>(new String[]{"WF Name"});
        comboBox.setBounds(100, 70, 200, 35);
        comboBox.setFont(new Font("SansSerif", Font.PLAIN, 14));
        comboBox.setBorder(new LineBorder(new Color(0xDADCE0), 1, true));

        // Save Button
        JButton saveBtn = new JButton("Save Hst");
        saveBtn.setBounds(130, 150, 140, 40);
        saveBtn.setFont(new Font("SansSerif", Font.BOLD, 14));
        saveBtn.setForeground(Color.WHITE);
        saveBtn.setBackground(new Color(0x174EA6));
        saveBtn.setFocusPainted(false);
        saveBtn.setBorderPainted(false);
        saveBtn.setOpaque(true);
        saveBtn.setBorder(new LineBorder(new Color(0x174EA6), 1, true));

        panel.add(header);
        panel.add(comboBox);
        panel.add(saveBtn);

        dialog.add(panel);
        dialog.setVisible(true);
    }
}
