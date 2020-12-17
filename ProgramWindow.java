import jdk.swing.interop.SwingInterOpUtils;
import java.awt.*;
import javax.swing.*;
public class ProgramWindow extends GetData {
    public static void createWindow(){
        JFrame frame = new JFrame("Czytnik kart");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel textLabel = new JLabel("Wczytaj karte",SwingConstants.CENTER);
        textLabel.setPreferredSize(new Dimension(900, 500));
        Color color = new Color(143, 143, 143);
        textLabel.setOpaque(true);
        textLabel.setBackground(color);
        frame.getContentPane().add(textLabel, BorderLayout.NORTH);
        frame.setLocationRelativeTo(null);
        frame.pack();
        frame.setVisible(true);
    }
}
