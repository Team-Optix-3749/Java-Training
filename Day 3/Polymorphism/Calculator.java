import java.text.spi.DecimalFormatSymbolsProvider;

import javax.swing.plaf.multi.MultiButtonUI;

public class Calculator {
    public Double divide(int one, int two){
        Double answer = (double)one/two;
        return answer;
    }
    public int mult(int one, int two){return one*two;}
}
class SlowCalculator extends Calculator {
    @Override
    public int divide(int one, int two){return one/two;}
    public static int mult(int one, int two){
        int answer = 0;
        for (int i = 1; i <= two; i ++){
            answer = answer + one;
        }
        return answer;
    }

    public static void main(String[] args) {
        SlowCalculator s = new SlowCalculator();
        // methods down here 

    }
}
