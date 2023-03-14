/*Write a program for a calculator with addition, subtraction, multiplication
and division methods all with parameters and use string concatenation
methods.
 */
public class JavaProgramme5 {
    public static void main(String[] args) {
        JavaProgramme5 obj = new JavaProgramme5();
        obj.addition(10, 5);
        obj.substraction(10, 5);
        obj.multiplication(10, 5);
        obj.division(10, 5);
    }

    public void addition(int a, int b) {
        int ans = a + b;
        System.out.println("Addition is : " + ans);

    }

    public void substraction(int a, int b) {
        int ans1 = a - b;
        System.out.println("Substraction is : " + ans1);
    }

    public static void multiplication(int a, int b) {
        int ans2 = a * b;
        System.out.println("Multiplication is  : " + ans2);

    }

    public static void division(int a, int b) {
        int ans3 = a / b;
        System.out.println("Division is :" + ans3);
    }

}




