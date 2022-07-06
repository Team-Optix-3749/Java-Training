public class VoidMethods {
  public static void main (String[] args) {
    printBool(0.37);
    printBool(49);
  }
  public static void printBool(double number) {
    System.out.println(number > 10);
  }
}
