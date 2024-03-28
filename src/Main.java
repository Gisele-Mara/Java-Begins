import java.util.Scanner;  // Import the Scanner class
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       int numeroInteiro = 9;
       float numeroReal = 2.22f;
       char letra = 'g';
       boolean terminou = false;
       String joke = "Here goes a joke...";
        //sout atalho para System.out.println
       System.out.println(joke);


       System.out.printf("An integer number '%d', a float number '%.1f', a char letter '%C' and a '%b' boolean enter a bar.", numeroInteiro, numeroReal, letra, terminou);


    }
}