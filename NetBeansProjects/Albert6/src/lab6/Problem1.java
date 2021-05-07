/*
 * Programmer: Jospeh
 * Date: 10/28/19
 * Description: takes three user input integers then calls a method that sorts
 * the numbers
 */
package lab6;

import java.util.Scanner;

public class Problem1 {

    public static void main(String[] args) {
        
        // takes user input for three integers
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three integers you would like sorted: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        
        // calls sorting method
        displaySortedNumbers(num1, num2, num3);
        
    }
    public static void displaySortedNumbers(int num1, int num2, int num3){
        // logic for sorting numbers
        if ((num1 > num2 && num1 > num3))
        {
            if(num2 > num3)
            {
                System.out.println(num3 + " " + num2 + " " + num1);
            }
            else
                System.out.println(num2 + " " + num3 + " " + num1);
        }
        else if ((num2 > num1 && num2 > num3))
        {
            if(num1 > num3)
            {
                System.out.println(num3 + " " + num1 + " " + num1);
            }
            else
                {
                System.out.println(num1 + " " + num3 + " " + num2);
                }
        }
        else if ((num3 > num1 && num3 > num2))
        {
            if(num1 > num2)
            {
                System.out.println(num2 + " " + num1 + " " + num3);
            }
            else
                System.out.println(num1 + " " + num2 + " " + num3);
        }
        else
        {
            System.out.println("ERROR!");
        }
    }
}
