package adapterdemo;

public class CalcClient {

    private Calculator calc;
    
    public void setCalc(Calculator calc) {
        this.calc = calc;
    }

    public void useCalc() {
        int result = calc.sum(5,10);
        System.out.println(result);
        
    }

}
