
import java.awt.*;
import javax.swing.*;

public class gui {

    public static void main(String[] args) {
        JButton addBtn = new JButton("+");
        JButton remBtn = new JButton("-");
        JTextField textField = new JTextField("", 3);

        JFrame frame = new JFrame();
        frame.setTitle("FlowLayout");
        frame.setSize(100, 100);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLayout(new FlowLayout());

        frame.add(addBtn);
        frame.add(remBtn);

        addBtn.addActionListener(e -> {
            if (e !=null) {
                System.out.println(e);
                frame.add(textField);
            }
        });

    }
}
