import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        int biggerNumber = 0;
        Scanner keyboard = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {

            System.out.println("Enter a number between 0 and 100: ");

            int inputNumber = keyboard.nextInt();

            if(inputNumber > biggerNumber){
                biggerNumber = inputNumber;
            }
        }

        System.out.printf("The biggest number is %d ",  biggerNumber);


    }
}