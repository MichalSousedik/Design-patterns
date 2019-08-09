package adapterdemo;

public class CalcObjectAdapter implements Calculator {

    private Calc calc;
    
    public CalcObjectAdapter(Calc calc) {
        this.calc = calc;
    }

    @Override
    public int sum(int i, int j) {
        return (int)calc.plus(i, j);
    }

}
