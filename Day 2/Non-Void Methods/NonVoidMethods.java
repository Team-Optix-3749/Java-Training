public class NonVoidMethods {
  public static void main(String[] args) {
    System.out.println(isFriendsWithAlbert("Don"));
    System.out.println(doubleNum(5.205));
    System.out.println(invert(true));
  }

  public static String isFriendsWithAlbert(String name) {
    return name + " is friends with Albert";
  }
  public static double doubleNum(double number) {
    return 2*number;
  }
  public static boolean invert(boolean bool) {
    return !bool;
  }
}
