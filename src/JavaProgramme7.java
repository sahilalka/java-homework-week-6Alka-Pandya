import java.util.Scanner;

/*
Write a program to insert any temperature value in degree Fahrenheit and
convert to degree Celsius ((F − 32) × 5/9 = 0°C).
 */
public class JavaProgramme7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter temperature in fahrenheit");
        double f = scanner.nextDouble();
        JavaProgramme7 obj = new JavaProgramme7();
        obj.temperature(f);
        scanner.close();
    }
    public void temperature(double f){
        double c = (f - 32) * 5/9;
        System.out.println("temperature converted into celsius"  + c);
    }


}
