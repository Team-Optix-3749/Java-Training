public class ClassesAndObjects {
  public static void main(String[] args) {
    Me don = new Me("Don", 16);
    System.out.println(don.getName(don.name));
    System.out.println(don.getAge(don.age));
  }

  static class Me {
    private String name;
    private int age; 

    public Me(String name, int age) {
      this.name = name;
      this.age = age;
    }

    public String getName(String name) {
      return this.name; 
    }

    public int getAge(int age) {
      return this.age;
    }

  }
}
