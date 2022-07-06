public class NonVoidMethods {
    public static void main(String[] args) {
        System.out.println(printAlbert("Varalu"));
        System.out.println(doubleYoMoma(7718));
        System.out.println(toggle(true));
    }
    public static String printAlbert(String name){
        String retstring = name + " is friends with Albert";
        return retstring;
    }
    public static int doubleYoMoma(int num){
        return num*2;
    }
    public static boolean toggle(boolean val){
        if(val == true){return false;}
        return false;
    }
}
