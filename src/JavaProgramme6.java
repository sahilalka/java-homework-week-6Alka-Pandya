/*Write a program to enter any radius value of the circle and find out the
area.(Formula of Area A=PI*r*r).
 */

import java.util.Scanner;

public class JavaProgramme6 {

    public static void main(String[] args) {

        Scanner scanobj = new Scanner(System.in);
        System.out.println("Enter redius");
        double r = scanobj.nextDouble();
        myMethod(r);
        double area = myMethod(r);
        System.out.println("circle of area  "  +   area);
        scanobj.close();

    }
    public static double myMethod(double r) {
        double pi = 3.14;
    double area = pi*r * r;
    return area;
    }

    }









