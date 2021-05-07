/*
 * Programmer: Joseph
 * Date: 10/28/19
 * Description: takes user input for three sides of a user input triangle 
 * then calls a method to compute area if triangle is valid
 */
package lab6;

import java.util.Scanner;

public class Problem2 {

    public static void main(String[] args) {
        //takes user input
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the three sides of your triangle: ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();
        
        //checks that triangle is valid then calls compute area method if triangle is valid
        if ((side1 + side2) > side3) {
            if ((side1 + side3) > side2) {
                if (side2 + side3 > side1) {
                    double area = area(side1, side2, side3);
                    System.out.printf("%s%3.2f","Area of your triangle is: " , area);
                } else {
                    System.out.println("The Triangle is Not a Valid Triangle");
                }
            } else {
                System.out.println("The Triangle is Not a Valid Triangle");
            }
        } else {
            System.out.println("The Triangle is Not a Valid Triangle");
        }

    }
    //computes area
    public static double area(double side1, double side2, double side3) {
        double s = (side1 + side2 + side3) / 2;
        double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        return area;
    }
}
