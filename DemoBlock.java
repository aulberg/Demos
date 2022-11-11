public class DemoBlock {
  public static void main(String[] args) {
    System.out.println("Demonstrating block scope ");
    int X = 1111;
    System.out.println("The first block X is " + X);

    {
      int y = 2222;
      System.out.println("The second block X is " + X);
      System.out.println("The second block y is " + y);
    }

    {
      int y = 3333;
      System.out.println("The third block X is " + X);
      System.out.println("The thid block y is " + y);
      demoMethod();
      System.out.println("After method, X is " + X);
      System.out.println("After method block y is " + y);

    }
    System.out.println("At the end X is " + X);
  }

  public static void demoMethod() {
    int X = 8888;
    int y = 9999;
    System.out.println("In demoMethod() X is " + X);
    System.out.println("In demoMethod() y is " + y);

  }
}
