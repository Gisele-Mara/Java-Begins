import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercicios {

    void numberState (){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int inputNumber = keyboard.nextInt();

        if(inputNumber > 0){
            System.out.printf("The number %d is positive", inputNumber);
        }
        if(inputNumber < 0){
            System.out.printf("The number %d is negative", inputNumber);
        }
        if(inputNumber == 0){
            System.out.println("The number %d is positive");
        }
    }

    void leapYear(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int inputYear = keyboard.nextInt();

        if((inputYear % 4 == 0 && inputYear % 100 !=0 || inputYear % 400 == 0)){
            JOptionPane.showMessageDialog(null,"%d" + inputYear + "is a leap year.");

        }
        else{
            JOptionPane.showMessageDialog(null,"%d" + inputYear + "is not a leap year.");

        }
    }

    void triangle(){
        ArrayList<Integer> lengths = new ArrayList<>();

        for (int i = 0; i < 3; i++) {

            int length  = Integer.parseInt(JOptionPane.showInputDialog("Write the length of the " + (i + 1) + "º side of the triangle"));
            lengths.add(length);

        }

        if(lengths.get(0) == lengths.get(1) && lengths.get(0) == lengths.get(2)){
            JOptionPane.showMessageDialog(null,"The triangle is equilateral.");

        } else if (lengths.get(0) != lengths.get(1) && lengths.get(0) != lengths.get(2) && lengths.get(1) != lengths.get(2))  {
            JOptionPane.showMessageDialog(null,"The triangle is scalene.");

        } else{
            JOptionPane.showMessageDialog(null,"The triangle is isosceles.");

        }

    }

    boolean biggerThan10OrEven (){

        int inputNumber  = Integer.parseInt(JOptionPane.showInputDialog("Write a number"));


        if (inputNumber % 2 == 0 && inputNumber > 10) {
            JOptionPane.showMessageDialog(null,"The number is even and bigger than 10.");
            return  true;
        }

            JOptionPane.showMessageDialog(null,"The number is even and bigger than 10.");
            return  false;


    }

    void grade(){
        Float inputGrade  = Float.parseFloat(JOptionPane.showInputDialog("Write the grade"));

        Float inputFrequency  = Float.parseFloat(JOptionPane.showInputDialog("Write the frequency"));

        if(inputGrade >= 7 && inputFrequency > 75){
            JOptionPane.showMessageDialog(null,"Student approved.");
        } else {
            JOptionPane.showMessageDialog(null,"Student not approved.");

        }

    }

    void ThreeAndFive (){

        int inputNumber  = Integer.parseInt(JOptionPane.showInputDialog("Write a number"));


        if(inputNumber % 3 == 0  && (inputNumber % 5 == 0)){
            JOptionPane.showMessageDialog(null,"Ok.");

        } else{
            JOptionPane.showMessageDialog(null,"Not Ok.");
        }
    }


}
