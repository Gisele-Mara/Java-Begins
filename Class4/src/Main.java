import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {



    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
//        Pessoa p = new Pessoa();
//
        for(int i =0; i<3; i++){
            String name =
                JOptionPane.showInputDialog("Write the name of the" + (i+1) +"º person");

            int age =Integer.parseInt
                    (JOptionPane.showInputDialog("write the age of the " + (i+1) + "º person"));

            Pessoa p = new Pessoa(name,age);
        }
//
//        p.setAge(20);
//        System.out.println(p.getAge());
        }
    }
