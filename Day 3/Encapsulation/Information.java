public class Information {
    private int age;
    private String name; 
    private String gender;
    Information(int a, String n, String g){
        age = a;
        name = n;
        gender = g;
    }
    // getters + above21
    public String getName(){return name;}
    public int getAge(){return age;}
    public String getGender(){return gender;}
    public boolean above21(){
        if(age > 21){return true;}
        return false;
    }
    // setters
    public void setName(String n){name = n;}
    public void setAge(int a){age = a;}
    public void setGender(String g){gender = g;}

    public void fullInfo(){
        System.out.println(above21());
        System.out.println(getAge());
        System.out.println(getGender());
        System.out.println(getName());
    }
    public static void main(String[] args) {
        Information one = new Information(23, "bleh", "M");
        Information two = new Information(20, "gravitas", "f");
        one.fullInfo();
        two.fullInfo();
    }

}
