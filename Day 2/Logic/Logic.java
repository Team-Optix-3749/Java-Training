
public class Logic {
 public static void main(String[] args) {
    int tea = 0;
    int candy = 0;
    if(tea >= 5 && candy >= 6){
        if (candy >= tea*2 || tea >= tea*2){
            System.out.println(2);
        }
        else{System.out.println(1);}
    }
    else{System.out.println(0);}
    }
    
 }   
