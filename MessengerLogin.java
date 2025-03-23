import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class MessengerLogin {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Messenger Login");
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        frame.setSize(1036, 803);
        frame.setLayout(new BorderLayout());

        try {
            List<Image> icons = new ArrayList<>();
            
            Image titleIcon = new ImageIcon("mini_logo.png").getImage()
                .getScaledInstance(16, 16, Image.SCALE_SMOOTH);
            
            Image taskbarIcon = new ImageIcon("messenger_logo.png").getImage();
            
            icons.add(titleIcon);
            icons.add(taskbarIcon.getScaledInstance(32, 32, Image.SCALE_SMOOTH));
            icons.add(taskbarIcon.getScaledInstance(64, 64, Image.SCALE_SMOOTH));
            
            frame.setIconImages(icons);
        } catch (Exception e) {}

        JPanel topBar = new JPanel(new BorderLayout());
        topBar.setBackground(new Color(239, 236, 239));
        topBar.setPreferredSize(new Dimension(1036, 28));

        JButton closeButton = new JButton("×");
        closeButton.setBorder(BorderFactory.createEmptyBorder());
        closeButton.setContentAreaFilled(false);
        closeButton.setForeground(Color.BLACK);
        closeButton.setEnabled(false);
        closeButton.setFocusable(false);
        closeButton.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
        topBar.add(closeButton, BorderLayout.EAST);

        frame.add(topBar, BorderLayout.NORTH);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        mainPanel.setBackground(new Color(242, 239, 242));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(50, 0, 70, 0));

        ImageIcon mainLogoIcon = new ImageIcon("messenger_logo.png");
        JLabel logo = new JLabel(new ImageIcon(mainLogoIcon.getImage()
                .getScaledInstance(57, 55, Image.SCALE_SMOOTH)));
        logo.setAlignmentX(Component.CENTER_ALIGNMENT);
        mainPanel.add(logo);

        mainPanel.add(Box.createVerticalStrut(20));
        JLabel title = new JLabel("Welcome to Messenger");
        title.setFont(new Font("Segoe UI", Font.BOLD, 24));
        title.setAlignmentX(Component.CENTER_ALIGNMENT);
        mainPanel.add(title);

        mainPanel.add(Box.createVerticalStrut(10));
        JLabel subtitle = new JLabel("The simple way to text, call and video chat right from your desktop.");
        subtitle.setFont(new Font("Arial", Font.BOLD, 14));
        subtitle.setForeground(new Color(128, 128, 128));
        subtitle.setAlignmentX(Component.CENTER_ALIGNMENT);
        mainPanel.add(subtitle);

        mainPanel.add(Box.createVerticalStrut(375));

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.Y_AXIS));
        buttonPanel.setBackground(new Color(242, 239, 242));

        JButton fbLogin = new JButton("Log in with Facebook");
        styleButton(fbLogin, new Color(12, 125, 255), Color.WHITE, "Segoe UI", Font.BOLD, 14);

        JButton emailLogin = new JButton("Log in with phone or email");
        styleButton(emailLogin, new Color(232, 230, 232), new Color(128, 128, 128), "Arial", Font.BOLD, 14);

        buttonPanel.add(fbLogin);
        buttonPanel.add(Box.createVerticalStrut(10));
        buttonPanel.add(emailLogin);

        mainPanel.add(buttonPanel);
        frame.add(mainPanel, BorderLayout.CENTER);

        frame.setVisible(true);
    }

    private static void styleButton(JButton button, Color bgColor, Color fgColor, String fontName, int fontStyle, int fontSize) {
        button.setAlignmentX(Component.CENTER_ALIGNMENT);
        button.setBackground(bgColor);
        button.setForeground(fgColor);
        button.setFont(new Font(fontName, fontStyle, fontSize));
        button.setPreferredSize(new Dimension(367, 40));
        button.setMaximumSize(new Dimension(367, 40));
        button.setOpaque(true);
        button.setBorderPainted(false);
        button.setFocusPainted(false);
    }
}