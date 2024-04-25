import javax.swing.*;
import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    static ArrayList <Pessoa> people = new ArrayList<Pessoa>();
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
//        Pessoa p = new Pessoa();
//        JTextField nameField = new JTextField();
//        JTextField ageField = new JTextField();


//
        for(int i =0; i<3; i++){
//            Object [] fields = {
//                    "Write the name of the" + (i+1) +"º person:", nameField,
//                    "Write the age of the" + (i+1) +"º person:", ageField
//        };
//
//            JOptionPane.showConfirmDialog(null,fields, "Inputs", JOptionPane.OK_CANCEL_OPTION);
//
//
            String name =
                JOptionPane.showInputDialog("Write the name of the" + (i+1) +"º person");

            int age =Integer.parseInt
                    (JOptionPane.showInputDialog("write the age of the " + (i+1) + "º person"));

            Pessoa p = new Pessoa(name,age);
            people.add(p);
        }
        System.out.println(people);

//        p.setAge(20);
//        System.out.println(p.getAge());
        }
    }
