import java.util.ArrayList;
import java.util.Scanner;

public class Salaries {

    void findTheBiggest (){

        Scanner keyboard = new Scanner(System.in);
        ArrayList<Float> oldSalaries = new ArrayList<Float>();
        ArrayList<Float> newSalaries = new ArrayList<Float>();
        System.out.println("Write the number of salaries you want to write on your sheet");
        int n = keyboard.nextInt();
        float salary;
        float biggestSalarie = 0f;

        for (int k = 0; k < n; k++) {

            System.out.printf("Write the number %dº salary", k+1);
            salary = keyboard.nextInt();
            oldSalaries.add(salary);



            if(salary > biggestSalarie){
                    biggestSalarie = salary;
            }

            if(oldSalaries.get(k) > 2500){
                float newSalary = oldSalaries.get(k) * 1.10f;
                newSalaries.add(newSalary);
            } else {

                newSalaries.add(oldSalaries.get(k));
            }









        }

    }
}
