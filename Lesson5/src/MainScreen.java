import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainScreen extends JFrame {
    public JPanel MainPanel;

    private JTextField textName;
    private JButton btnSend;

    public MainScreen() {
        btnSend.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
JOptionPane.showMessageDialog(null, "Hello " + textName.getText());
            }
        });
    }

    public void AccountScreen(){

        BankAccount clientAccount = new BankAccount();


    }
}
