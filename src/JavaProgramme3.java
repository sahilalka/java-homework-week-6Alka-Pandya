/*
3.1 Declare one instance and one static variable.
3.2 Declare one instance method.
3.3 Declare one static method.
3.4 Call both instance and static variables into both instance and static methods inside the print statement.
3.5 Declare the main method.
3.6 Call both instance and static methods into the main method and run the programme.
 */
public class JavaProgramme3 {
    int x = 10; // instance variables

    static int y= 20; // static variables
    public static void main(String[] args){
    JavaProgramme3 obj = new JavaProgramme3();
    obj.myMethod1();
    obj.myMethod2();
}
    // instance method
    public void myMethod1() {
     JavaProgramme3 obj = new JavaProgramme3();


        System.out.println(obj.x);
        System.out.println(y);
    }

    public static void myMethod2() {
        JavaProgramme3 obj = new JavaProgramme3();
        System.out.println(obj.x);
        System.out.println(y);}


    }




















