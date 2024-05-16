import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
       Activities testinho = new Activities();


        Object[] chooseActivity = {"Number State", "Leap Year", "Triangle Rectangle", "Bigger than 10 or Even", "Grade", "Divisible by 3 And 5", "Lowercase vowel or Odd","Number between 20 and 30"};
        String initialSelection = "Number State";
        Object selection = JOptionPane.showInputDialog(null, "Choose an activity",
                "Activities", JOptionPane.QUESTION_MESSAGE, null, chooseActivity, initialSelection);

        System.out.println(selection);


        switch (selection.toString()){

            case "Number State":
                testinho.numberState();
                break;
            case "Leap Year":
                testinho.leapYear();
                break;
            case "Triangle Rectangle":
                testinho.triangle();
                break;
            case "Bigger than 10 or Even":
                testinho.biggerThan10OrEven();
                break;
            case "Number between 20 and 30":
                testinho.numberBetween20and30();
                break;
            case "Grade":
                testinho.grade();
                break;
            case "Lowercase vowel or Odd":
                testinho.lowercaseVowelOrOdd();
                break;
            case "Divisible by 3 And 5":
                testinho.divisibleByThreeAndFive();
                break;
        }
//        Scanner keyboard = new Scanner(System.in);

//        System.out.println("Enter your username");

//        String userName = keyboard.nextLine();  // Read user input
//
//        System.out.println("Enter your password");
//
//        String password = keyboard.nextLine();  // Read user input
//
//        System.out.printf("Username is: %s and password is:  %s \n", userName, password);  // Output user

        //        System.out.printf("A media é %.2f", soma);

//        System.out.println("Enter the first number: ");
//
//        Float numberOne = keyboard.nextFloat();
//
//        System.out.println("Enter the second number: ");
//
//        Float numberTwo = keyboard.nextFloat();
//
//        System.out.println("Enter the third number: ");
//        Float numberThree = keyboard.nextFloat();
//
//
//
//        media = (numberOne + numberTwo + numberThree)/ 3;


//        ArrayList<Float> gradeArray = new ArrayList<Float>();
//
//        Float soma = 0f;
//        Float media;
//
//        for (int i = 0; i < 3; i++) {
//            System.out.printf("Enter grade %d: ", i + 1);
//            Float numberOne = keyboard.nextFloat();
//            gradeArray.add(numberOne);
//            soma = soma + gradeArray.get(i);
//        }
//        media = soma / 3;
//
//
//        System.out.printf("Grade point average %.1f", media);


    }
}