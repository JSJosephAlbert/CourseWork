/*
 * Programmer: Joseph
 * Date: 10/10/19
 * Description: Displays a table of triganometric info for give angles.
 */
package lab4;

public class Problem1 {

    public static void main(String[] args) {
        System.out.printf("%s", "******************************");
        System.out.printf("\n%12s%12s", "Degrees", "Radians");
        System.out.printf("\n%s", "******************************");
        System.out.printf("\n%9d%14.3f", 20, Math.toRadians(20));
        System.out.printf("\n%9d%14.3f", 40, Math.toRadians(40));
        System.out.printf("\n%9d%14.3f", 60, Math.toRadians(60));
        System.out.printf("\n%9d%14.3f", 80, Math.toRadians(80));
        System.out.printf("\n%s", "******************************");

        System.out.printf("\n%s", "==================================================");
        System.out.printf("\n%s%9d%9d%9d%9d", "Angle", 20, 40, 60, 80);
        System.out.printf("\n%s", "==================================================");
        System.out.printf("\n%s%13.3f%9.3f%9.3f%9.3f", "Sine", Math.sin(0.349), Math.sin(0.698),
                Math.sin(1.047), Math.sin(1.396));
        System.out.printf("\n%s%11.3f%9.3f%9.3f%9.3f", "Cosine", Math.cos(0.349), Math.cos(0.698),
                Math.cos(1.047), Math.cos(1.396));
        System.out.printf("\n%s%10.3f%9.3f%9.3f%9.3f", "Tangent", Math.tan(0.349), Math.tan(0.698),
                Math.tan(1.047), Math.tan(1.396));
        System.out.printf("\n%s", "==================================================");

    }

}
