public class CandO {
    String Name;
    int Age;
    CandO(String name, int age){
        Age = age;
        Name = name;
    }
    public int GetAge(){return Age;}
    public String GetName(){return Name;}


    public static void main(String[] args) {
        CandO Me = new CandO("varalu", 15);
        System.out.println(Me.GetAge());
        System.out.println(Me.GetName());
    }
}
