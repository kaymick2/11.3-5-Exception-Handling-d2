import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    int x = 0;
    Scanner input = new Scanner(System.in);
    double sum = 0;
    do {
      try {
        System.out.println("Enter a number, q to quit.");
        String isQuit = input.next();
        if (isQuit.equals("q")) {
          x = 1;
        } else {
          x = 0;
        }
        double numberEntry = Double.parseDouble(isQuit);
        sum = sum + numberEntry;
      } catch (Exception e) {
        System.out.println("computer broke, call microsoft tech support");
      }
    } while (x == 0);
  }
}