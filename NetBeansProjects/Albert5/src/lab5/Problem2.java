/*
 * Programmer: joseph
 * Date: 10/15/19
 * Description: Converts meters to feet and feet to meters, then displays results 
 * in a table
 */
package lab5;

public class Problem2 {

    public static void main(String[] args) {

        int meter1 = 7;
        double feet2 = 0;
        int feet1 = 50;
        double meter2 = 0;
        int count = 0;

        //displays header
        System.out.printf("%10s%10s%10s%12s%12s", "meters", "feet", "|", "feet",
                "meters");

        do {
            count++;
            //converts meters to feet and vice versa
            feet2 = meter1 * 3.2808;
            meter2 = feet1 * 0.3048;
            //displays table
            System.out.printf("\n%6d%15.2f%9s%11d%13.2f", meter1, feet2, "|",
                    feet1, meter2);
            meter1 += 10;
            feet1 += 10;

        } while (count <= 10);
    }
}
