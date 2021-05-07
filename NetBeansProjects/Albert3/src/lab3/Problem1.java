/*
 * Programmer: Joseph
 * Date: 9/21/19
 * Description: Takes user input for customer type and price, then displays 
 * customer type, discount percentage and total price.
 */
package lab3;

import java.util.Scanner;


public class Problem1 {

    public static void main(String[] args) {
        
// takes user input for customer type and price
        Scanner input = new Scanner(System.in);
        System.out.println("Enter customer type. 0 for new, 1 for existing: ");
        final int customer = input.nextInt();
        System.out.println("Enter price of your item:");
        double price = input.nextDouble();
        
        //computes and displays customer type, discount and toal price
        if((customer  < 0 || customer > 1) || (price < 69)){
            System.out.println("invalid customer type and/or price");
        }
        else if((customer == 0) && (price >= 69 && price < 150)){
            System.out.println("Custmoer type: New!");
            System.out.println("Your total is: " + price);
        }
        else if((customer == 1) && (price >= 69 && price < 150)){
            System.out.println("Custmoer type: Existing");
            System.out.println("Your total is: " + price);
        }
        else if((customer == 0) && (price >= 150 && price < 250)){
            System.out.println("Custmoer type: New!");
            System.out.println("Your total is: " + price);
        }
        else if((customer == 1) && (price >= 150 && price < 250)){
            System.out.println("Custmoer type: Existing");
            System.out.println("Discount: 5%");
            System.out.println("Your total is: " + (price - price * 0.05));
        }
        else if((customer == 0) && (price >= 250 && price < 500)){
            System.out.println("Custmoer type: New!");
            System.out.println("Discount: 4%");
            System.out.println("Your total is: " + (price - price * 0.04));
        } 
        else if((customer == 1) && (price >= 250 && price < 500)){
            System.out.println("Custmoer type: Existing");
            System.out.println("Discount: 8%");
            System.out.println("Your total is: " + (price - price * 0.08));
        }  
        else if((customer == 0) && (price >= 500)){
            System.out.println("Custmoer type: New!");
            System.out.println("Discount: 6%");
            System.out.println("Your total is: " + (price - price * 0.06));
        }    
        else if((customer == 1) && (price >= 500)){
            System.out.println("Custmoer type: Existing");
            System.out.println("Discount: 10%");
            System.out.println("Your total is: " + (price - price * 0.1));
        }    
    }
}
