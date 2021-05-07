/*
 * Programmer: Joseph
 * Date: 10/15/19
 * description: takes user input for amount of randomly generated numbers,
 * computes number of odd/even, highest numner, and odd/even average.
 */
package lab5;

import java.util.Scanner;

public class Problem1 {
    
    public static void main(String[] args) {
        
        //takes user input for amount of generated numbers
        Scanner input = new Scanner(System.in);
        System.out.println("enter how many random numbers you would like to"
                + " generate: ");
        int user = input.nextInt();
        int num = 0;
        int odd = 0;
        int even = 0;
        int highest = 0;
        double oddSum = 0;
        double evenSum = 0;
        double oddAvg = 0;
        double evenAvg = 0;
        
        //generates numbers
        for (int count = 0; count < user; count++) {
            num = (int) (Math.random() * 10) + 1;
            System.out.print(num + " ");
            
            //finds highest number
            if (num > highest){
                highest = num;
            }
            
            //counts and averages odd numbers
            if(num % 2 != 0){
                odd++;
                oddSum += num;
                oddAvg = oddSum / user;
            }
            //counts and averages even numbers
            if(num % 2 == 0){
                even++;
                evenSum += num;
                evenAvg = evenSum / user;
            }
        }
        //displays results
        System.out.printf("\n%s%d" ,"Number of odd: ", odd);
        System.out.printf("\n%s%d" , "Number of even: ", even);
        System.out.printf("\n%s%d", "Highest number: ", highest);
        System.out.printf("\n%s%1.2f", "Average of odd: ", oddAvg);
        System.out.printf("\n%s%1.2f", "Average of even: ", evenAvg);
    }

}
