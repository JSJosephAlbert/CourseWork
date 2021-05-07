/*
 * Programmer: Joseph
 * Date: 11/24/19
 * Description: generates 8 random salaries then prints max, minimum, difference 
 * between highest and lowest salary, and number of salaries above given average
 */
package lab8;

public class Salary {

    public static void main(String[] args) {
        //prints random salaries
        double[] salaryArray = new double[8];
        for (int i = 0; i < salaryArray.length; i++) {
            salaryArray[i] = (Math.random() * 63) + 12.01;
            System.out.printf("\n%6s%2d%6s%2.2f", "Employee", i , " hourly salary is: ", salaryArray[i]);
        }
        salaryArray[5] = 55.0;

        //prints max salary
        double max = salaryArray[0];
        int maxId = 1;
        for (int i = 1; i < salaryArray.length; i++) {
            if (max < salaryArray[i]) {
                max = salaryArray[i];
                maxId = i;
            }
        }
        System.out.printf("\n%6s%2d%1s%2.2f", "Hghest hourly salary is employee", maxId, ": ", max);

        //prints minimum salary
        double min = salaryArray[0];
        int minId = 1;
        for (int i = 1; i < salaryArray.length; i++) {
            if (min > salaryArray[i]) {
                min = salaryArray[i];
                minId = i;
            }
        }
        System.out.printf("\n%6s%2d%1s%2.2f", "Lowest hourly salary is employee", minId, ": ", min);
        
        //prints difference between min and max salaries
        double difference = max - min;
        System.out.printf("\n%6s%2.2f", "Min-max salary difference: ", difference);
        
        //prints number of accounts greater than given average of 22
        int greaterThanAvgCount = 0;
        for(int i = 0; i < salaryArray.length; i++){
            if (salaryArray[i] > 22.0){
                greaterThanAvgCount++;
            }
        }
        System.out.println("\nNumber of employees with salary greater than national average: " + greaterThanAvgCount);

    }

}
