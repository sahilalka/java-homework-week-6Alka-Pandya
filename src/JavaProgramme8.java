import java.util.Scanner;

/*
Write a program to calculate the area of a triangle.
 */
public class JavaProgramme8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the base of triangle" );
        int base = scanner.nextInt();

        System.out.println("Enter the height of triangle" );
        int height = scanner.nextInt();

        int area = (base *  height) / 2;
        System.out.println(" The area of Triangle is " + area);
        scanner.close();

    }



}
