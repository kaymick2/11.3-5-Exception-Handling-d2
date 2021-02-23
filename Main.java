import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    int x = 0;
    Scanner input = new Scanner(System.in);
    double sum = 0;
    String isQuit = null;
    do {
      try {
        System.out.println("Enter a number, q to quit.");
        isQuit = input.next();
        if (isQuit.equals("q")) {
          x = 1;
        } else {
          x = 0;
          double numberEntry = Double.parseDouble(isQuit);
          sum = sum + numberEntry;
        }

      } catch (Exception e) {
        System.out.print("java.lang.NumberFormatException: For input string ");
        System.out.println(isQuit);
      }
    } while (x == 0);
    System.out.println("your sum is " + sum);
  }

}