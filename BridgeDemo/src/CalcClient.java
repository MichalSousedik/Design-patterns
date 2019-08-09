
public class CalcClient {

    private CalcAbstraction calc;
    
    public void setCalc(CalcAbstraction calc) {
        this.calc = calc;        
    }
    
    public void useCalc() {
        System.out.println(calc.plus(10, 15));
    }

}
