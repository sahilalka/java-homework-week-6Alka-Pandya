import java.util.Scanner;

/*
Write a program to convert the upper case to lower case.
 */
public class JavaProgramme9 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name in uppercase");

        String a = scanner.nextLine();
        myMethod(a);
        scanner.close();
    }
    public static void myMethod(String a) {

        System.out.println("convert the upper case to lowercase  "   +  a.toLowerCase());
    }

      }






