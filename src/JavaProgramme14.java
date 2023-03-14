import java.util.Scanner;

/*
Write a Java program to print the area and perimeter of a rectangle.

Test Data:
Width = 5.5 Height = 8.5

Expected Output:

Area is 5.6 * 8.5 = 47.60
Perimeter is 2 * (5.6 + 8.5) = 28.20

 */
public class JavaProgramme14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number1");
        double a = scanner.nextDouble();
        System.out.println("Enter the number2");
        double b = scanner.nextDouble();
        double area = ( a * b );
        System.out.println("Area  "  + area );
        double perimeter  = 2 * (a + b);
        System.out.println(" Rectangle" +  perimeter);
        scanner.close();






    }




}
