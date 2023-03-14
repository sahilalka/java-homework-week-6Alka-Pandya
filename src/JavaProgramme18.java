import java.util.Scanner;

/*Write a Java program to print the sum (addition), multiply, subtract, divide and
remainder of two numbers.
Test Data:
Input first number: 125
Input second number: 24
Expected Output :
125 + 24 = 149
125 - 24 = 101
125 x 24 = 3000
125 / 24 = 5
125 mod 24 = 5
 */
public class JavaProgramme18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input first number");
        int numb1 =scanner.nextInt();
        System.out.println("Input second number");
        int numb2 = scanner.nextInt();

        System.out.println(numb1 + "    +    " + numb2 + "  =  " + (numb1 + numb2));
        System.out.println(numb1 + "    -    " + numb2 + "  =  " + (numb1 + numb2));
        System.out.println(numb1 + "    /    " + numb2 + "  =  " + (numb1 + numb2));
        System.out.println(numb1 + "    x    " + numb2 + "  =  " + (numb1 + numb2));
        System.out.println(numb1 + "    mod    " + numb2 + "  =  " + (numb1 + numb2));
        scanner.close();
    }


}




















