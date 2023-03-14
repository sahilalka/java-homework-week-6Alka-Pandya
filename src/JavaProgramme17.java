import java.util.Scanner;

/*Write a Java program to convert a decimal number to binary number.

Input Data:
Input a Decimal Number : 5
Expected Output

Binary number is: 10
 */
public class JavaProgramme17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the decimal number 1");
        int a = scanner.nextInt();

        String b = Integer.toBinaryString(a);
        System.out.println(" binary number "   + b);
        scanner.close();


    }


}
