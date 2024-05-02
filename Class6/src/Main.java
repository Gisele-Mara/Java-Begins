import javax.swing.*;

public class Main {


    public static void main(String[] args) {

        ContactManagerScreen myManager= new ContactManagerScreen();

        myManager.setContentPane(myManager.contactPanel);

        myManager.setTitle("Notebook Simulator");

        myManager.setSize(600,600);

        myManager.setVisible(true);

        myManager.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}