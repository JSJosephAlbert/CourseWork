/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8;

import java.util.Scanner;

public class HourlySalaryTest {
    public static void main(String[] args){
        //takes user input for salaryArray
        Scanner input = new Scanner(System.in);
        double[] salaryArray = new double[10];
        for (int i = 0; i < salaryArray.length; i++){
            System.out.println("Enter employee " + i + " salary:");
            salaryArray[i] = input.nextDouble();
        }
        HourlySalary array = new HourlySalary(salaryArray);
        
        //prints salaryArrays contents using required methods
        HourlySalary.printSalary(salaryArray);
        System.out.println("\nAverage: " + array.averageSalary());
        array.highestSalary();
        array.lowestSalary();
        System.out.println("Number of salaries below average: " + array.belowAverageSalary());
        
    }
    
}
