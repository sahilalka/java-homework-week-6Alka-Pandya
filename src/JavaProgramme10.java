import java.util.Scanner;

/*.
10. Write a Java program that takes a number as input and prints its
multiplication table up to 10.
Test Data: Input a number: 8
Expected Output :
8 x 1 = 8
8 x 2 = 16
8 x 3 = 24
...
8 x 10 = 80
 */
public class JavaProgramme10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Test Data : Input a number");
        int number = scanner.nextInt();
        multiplication(number);
        scanner.close();
    }
    public static void multiplication (int table){
        System.out.println(table + "x 1 = " + table * 1);
        System.out.println(table + "x 2 = " + table * 2);
        System.out.println(table + "x 3 = " + table * 3);
        System.out.println(table + "x 4 = " + table * 4);
        System.out.println(table + "x 5 = " + table * 5);
        System.out.println(table + "x 6 = " + table * 6);
        System.out.println(table + "x 7 = " + table * 7);
        System.out.println(table + "x 8 = " + table * 8);
        System.out.println(table + "x 9 = " + table * 9);
        System.out.println(table + "x 10 = " + table * 10);

        
    }





        }