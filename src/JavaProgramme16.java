import java.util.Scanner;

/*
Write a Java program to add two binary numbers.

Input Data:
Input first binary number: 10
Input second binary number: 11
Expected Output:

Sum of two binary numbers: 101

 */
public class JavaProgramme16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the binary number 1 ");
        String b1 = scanner.next();

        System.out.println("Enter the binary number 2 ");
        String b2 = scanner.next();
        int a = Integer.parseInt(b1,2);
        int b = Integer.parseInt(b2,2);
        int c = a + b;
        String s = Integer.toBinaryString(c);
        System.out.println("addition of two binary number    " + s  );
        scanner.close();
    }
}
