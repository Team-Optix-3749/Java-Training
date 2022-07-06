public class Logic {
  public static void main (String[] args) {
    teaParty(6,8);
    teaParty(3,8);
    teaParty(20,6);
  }
  private static void teaParty(int tea, int candy) {
    int partyStatus = 0;
    if (tea < 5 || candy < 5) {
      partyStatus = 0;
    if (tea >= 2*candy || candy >= 2*tea); {
      partyStatus = 2;
    }
    if (tea >= 5 && candy >= 5); {
      partyStatus = 1;
    }
    }

    System.out.println(partyStatus);
  }
}
