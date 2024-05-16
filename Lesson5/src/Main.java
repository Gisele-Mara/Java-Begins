import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        MainScreen myPanel= new MainScreen();
//
//        myPanel.setContentPane(myPanel.MainPanel);
//
//        myPanel.setTitle("My First Swing :D");
//
//        myPanel.setSize(200,200);
//
//        myPanel.setVisible(true);
//
//        myPanel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        BankScreen myBankPanel= new BankScreen();

        myBankPanel.setContentPane(myBankPanel.BankMainScreen);

        myBankPanel.setTitle("Bank Account Simulator");

        myBankPanel.setSize(300,200);

        myBankPanel.setVisible(true);

        myBankPanel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);





    }
}