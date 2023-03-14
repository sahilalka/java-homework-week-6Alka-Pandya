import java.util.Scanner;

/*
Write a Java program to compute the specified expressions and print the
output.
Test Data:
((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))
Expected Output : 2.138888888888889
 */
public class JavaProgramme12 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println(" Enter the number 1 ");
        double f = scanner.nextDouble();
        System.out.println( " Enter the number 2");
        double g = scanner.nextDouble();
        System.out.println(" Enter the number 3 ");
        double h = scanner.nextDouble();
        System.out.println(" Enter the number 4 ");
        double i = scanner.nextDouble();
             myMethod( f, g, h, i);
             scanner.close();
    }

     public static void myMethod(double f,double g,double h , double i){
         double number = ((f * g - g * g  ) / ( h - i));
         System.out.println("Expected Output :"  + number );
     }



}
