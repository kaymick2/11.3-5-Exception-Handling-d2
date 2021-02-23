import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    int x = 0; 
    Scanner input = new Scanner(System.in);
    do {
      try {
        System.out.println("Enter a number, q to quit.");
        double no1 = input.nextDouble();
      } catch (Exception e) {
        System.out.println("computer broke, call microsoft tech support");
      }
      System.out.println("Do you want to keep doing this pointless exercise? To quit, type 'quit' :");
      System.out.println("if you screwed up the number entry and are seeing this, disregard the last statement :)");
      String isQuit = input.next();
      if (isQuit.equals("quit")) {
        x = 1;
      } else {
        x = 0;
      }
    } while (x == 0);
  }
}