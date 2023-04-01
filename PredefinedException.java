/*Write a java program to implement the concept of exception
 handling using pre defined exception. */

public class PredefinedException {

  public static void main(String[] args) {
    int dividend = 10;
    int divisor = 0;
    int quotient;

    try {
      quotient = dividend / divisor;
      System.out.println("Quotient = " + quotient);
    } catch (ArithmeticException e) {
      System.out.println("An error occurred: " + e.getMessage());
    }
  }

}