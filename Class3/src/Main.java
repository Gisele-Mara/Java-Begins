import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        int biggestNumber = -1;
        Scanner keyboard = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {


            System.out.println("Enter a number between 0 and 100: ");

            int inputNumber = keyboard.nextInt();

            while (inputNumber < 0 || inputNumber > 100){

                System.out.println("Enter a number between 0 and 100: ");
                inputNumber = keyboard.nextInt();

            }

            if(inputNumber > biggestNumber){
                biggestNumber = inputNumber;
            }
        }

        System.out.printf("The biggest number is %d ",  biggestNumber);


    }
}