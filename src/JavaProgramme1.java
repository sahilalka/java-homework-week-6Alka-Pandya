/**
 * 1.1 Declare two instance variables.
 * 1.2 Declare one instance method.
 * 1.3 Call both instance variables into the instance method inside the print statement.
 * 1.4 Declare the main method.
 * 1.5 Call the above instance method into the main method and run the programme.
 */

public class JavaProgramme1 {
    int a = 10;// instance variables
    int b = 20;// instance variables

    // instance method
    public void myMethod() {
        System.out.println(a);
        System.out.println(b);
    }

    public static void main(String[] args) {
       JavaProgramme1  obj = new JavaProgramme1();
        obj.myMethod();
    }

}






