abstract class Shirt {
    String color;
    Shirt(String c){
        color = c;
    }
    public String getColor(){return color;}
}

class TShirt extends Shirt{
    String size;
    float price;
    TShirt(String c, String s, float p){
        super(c);
        size = s;
        price = p;
    }
    }

class Jacket extends Shirt{
    String brand;
    float price;
    Jacket(String c, String b, float p){
        super(c);
        brand = b;
        price = p;
    }
    String getDescription(){
        return color + " " + brand + " " + price;
    }
public static void main(String[] args) {
    TShirt t = new TShirt("red", "Large", 7.79f);
    System.out.println(t.getColor());
}
}