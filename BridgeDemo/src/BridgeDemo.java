
public class BridgeDemo {

    public static void main (String[] args) {
        CalcClient calcClient = new CalcClient();
        CalcAbstraction calc = new DefaultCalcAbstraction();
        calcClient.setCalc(calc);
        calcClient.useCalc();
        
        calc = new DoubleCalcAbstraction();
        calcClient.setCalc(calc);
        calcClient.useCalc();
        
    }
}
