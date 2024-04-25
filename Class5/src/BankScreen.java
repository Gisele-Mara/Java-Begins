import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BankScreen extends JFrame{
    public JPanel BankMainScreen;
    private JTextField textClientName;
    private JButton btnEnter;
    private JLabel lblBalance;
    private JTextField lblDeposit;
    private JTextField lblWithdraw;
    private JButton btnClose;
    private JButton btnDeposit;
    private JButton btnWithdraw;

    public BankScreen() {
        BankAccount clientAccount = new BankAccount();

        btnClose.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });


        btnDeposit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clientAccount.depositAmount(Float.parseFloat(lblDeposit.getText()));
//                lblBalance.setText(lblDeposit.getText());
                lblBalance.setText(Float.toString(clientAccount.getBalance()));

            }
        });
        btnWithdraw.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
             clientAccount.withdrawOption(Float.parseFloat(lblWithdraw.getText()));
             lblBalance.setText(Float.toString(clientAccount.getBalance()));

            }
        });
    }
}
