/*
 * Programmer: Joseph
 * Date: 10/07/19
 * Description: takes user input for two digit hexadecimal number and converts 
 * it to decimal.
 */
package lab4;

import java.util.Scanner;

public class Problem2 {

    public static void main(String args[]) {
        //takes user input for hex digit
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a two digit hex number: ");
        final String USER = input.nextLine();

        //checks if input is two digits
        if (USER.length() == 2) {
            char ch1 = Character.toUpperCase(USER.charAt(0));
            char ch2 = Character.toUpperCase(USER.charAt(1));
            String s1 = String.valueOf(ch1);
            String s2 = String.valueOf(ch2);
            
            //checks if input is hex
            if ((('A' <= ch1 && ch1 <= 'F') ^ (Character.isDigit(ch1)))
                    && (('A' <= ch2 && ch2 <= 'F') ^ (Character.isDigit(ch2)))){
                //converts digit to hex and displays answer
                String s3 = s1 + s2;
                final int DECIMAL = Integer.parseInt(s3, 16);
                System.out.println(USER + " in decimal is: " + DECIMAL);
            }
            else{
                System.out.println("Digit is not hex");
            }
            
        } else if (USER.length() != 2) {
            System.out.println(USER + " is not exactly two hexadecimal digits");
            System.exit(0);
        }
    }
}
