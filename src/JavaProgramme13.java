import java.util.Scanner;

/*
Write a Java program that takes three numbers as input to calculate and
print the average of the numbers.

 */
public class JavaProgramme13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number1");
        double a = scanner.nextDouble();
        System.out.println("Enter the number2");
        double b = scanner.nextDouble();
        System.out.println("Enter the numbe3");
        double c = scanner.nextDouble();
        double avg = ( a + b + c)/ 3;
        System.out.println("Average  " + avg);
        scanner.close();
    }




    }



