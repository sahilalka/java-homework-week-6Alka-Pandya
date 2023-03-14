/* 4.1 Declare two instance and two static variables.
   4.2 Declare one instance method.
   4.3 Declare one static method.
   4.4 Call all four instance and static variables into both instance and static methods inside the print statement.
   4.5 Declare the main method.
   4.6 Call both instance and static methods into the main method and run the programme.
 */
public class JavaProgramme4 {
  int a = 10; // instance variable
  int b = 20; // instance variable

  static int c = 50; // static variables
  static int d = 100; // static variables
  public static void main(String[] args){
    JavaProgramme4 obj = new JavaProgramme4();
    obj.myMethod1();
    myMethod2();

  }

  public void myMethod1 () {
    JavaProgramme4 obj = new JavaProgramme4();
    System.out.println(obj.a);
    System.out.println(obj.b);
    System.out.println(c);
    System.out.println(d);
  }


    public static void myMethod2(){

      JavaProgramme4 obj = new JavaProgramme4();

      System.out.println(obj.a);
      System.out.println(obj.b);
      System.out.println(c);
      System.out.println(d);



    }

  }










