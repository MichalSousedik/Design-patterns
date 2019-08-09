package adapterdemo;

public class AdapterDemo {

    public static void main(String[] args) {
        
        CalcClient cc = new CalcClient();
        Calc calc = new Calc();
        cc.setCalc(new CalcObjectAdapter(calc));
        cc.useCalc();
        
        
        CalcClient cc2 = new CalcClient();
        cc2.setCalc(new CalcClassAdapter());
        cc2.useCalc();
         
    }

}
