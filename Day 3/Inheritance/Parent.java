public class Parent {
    String last_name;
    String eye_color;
    Parent(String ln, String ec){
        last_name = ln;
        eye_color = ec;
    }
    Parent(){}
}
class Child extends Parent{
    String first_name;
    Child(String fn, String ln, String ec){
        super(ln, ec);
        first_name = fn;
    }
    public String getName(){return first_name+" "+last_name;}
    public String getEyeColor(){return eye_color;}    

public static void main(String[] args) {
    Child me = new Child("Deez", "Nuts", "Brown");
    System.out.println(me.getName());
    System.out.println(me.getEyeColor());
}
}
