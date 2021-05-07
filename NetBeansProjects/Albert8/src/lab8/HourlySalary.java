/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8;

public class HourlySalary {

    private double[] array;
    private double sum;
    private double average;
    private double max;
    private double min;
    private int belowAvgCount;

    public HourlySalary(double[] array) {
        this.array = array;
    }

    public static void printSalary(double[] temp) {
        for (int i = 0; i < temp.length; i++) {
            System.out.printf("\n%1s%2d%1s%6.2f", "Salary", i, ":", temp[i]);
        }

    }

    public double averageSalary() {
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return average = sum / array.length;
    }

    public void highestSalary() {
        max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        System.out.println("Highest salary: " + max);
    }

    public void lowestSalary() {
        min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        System.out.println("Lowest salary: " + min);
    }

    public int belowAverageSalary() {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < average) {
                belowAvgCount++;
            }
        }
        return belowAvgCount;
    }

}
