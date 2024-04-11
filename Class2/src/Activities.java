import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Activities {

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

        if(lengths.get(0).equals(lengths.get(1)) && lengths.get(0).equals(lengths.get(2))){
            JOptionPane.showMessageDialog(null,"The triangle is equilateral.");

        } else if (!lengths.get(0).equals(lengths.get(1)) && !lengths.get(0).equals(lengths.get(2)) && !lengths.get(1).equals(lengths.get(2)))  {
            JOptionPane.showMessageDialog(null,"The triangle is scalene.");

        } else{
            JOptionPane.showMessageDialog(null,"The triangle is isosceles.");

        }

    }

    void biggerThan10OrEven (){

        int inputNumber  = Integer.parseInt(JOptionPane.showInputDialog("Write a number"));


        if (inputNumber % 2 == 0 && inputNumber > 10) {
            JOptionPane.showMessageDialog(null,"The number is even and bigger than 10.");

        }

            JOptionPane.showMessageDialog(null,"The number is even and bigger than 10.");



    }

    void grade(){
        float inputGrade  = Float.parseFloat(JOptionPane.showInputDialog("Write the grade"));

        float inputFrequency  = Float.parseFloat(JOptionPane.showInputDialog("Write the frequency"));

        if(inputGrade >= 7 && inputFrequency > 75){
            JOptionPane.showMessageDialog(null,"Student approved.");
        } else {
            JOptionPane.showMessageDialog(null,"Student not approved.");

        }

    }

    void divisibleByThreeAndFive (){

        int inputNumber  = Integer.parseInt(JOptionPane.showInputDialog("Write a number"));


        if(inputNumber % 3 == 0  && (inputNumber % 5 == 0)){
            JOptionPane.showMessageDialog(null,"The number" + inputNumber + " is divisible by three and five");

        } else{
            JOptionPane.showMessageDialog(null,"The number" + inputNumber + " is NOT divisible by three and five.");
        }
    }

    void lowercaseVowelOrOdd (){

      String character = JOptionPane.showInputDialog("Write a character");

        String[] vowels = {"a", "e", "i", "o", "u"};

        if (Integer.parseInt(character) % 2 != 0){

            JOptionPane.showMessageDialog(null,"The number is odd.");
            return;

        }

        for (String vowel : vowels) {
            if (character.equals(vowel)){

                JOptionPane.showMessageDialog(null,"The character is a vowel.");
                return;
            }

        }

        JOptionPane.showMessageDialog(null,"The character is neither a vowel or an odd number.");

    }

    void numberBetween20and30 (){

        int inputNumber  = Integer.parseInt(JOptionPane.showInputDialog("Write a number"));

        if(inputNumber >= 20 && inputNumber <=30){

            JOptionPane.showMessageDialog(null,"The number is between 20 and 30.");
            return;
        }

        JOptionPane.showMessageDialog(null,"The number is NOT between 20 and 30.");

    }

}
