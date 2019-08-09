
public class DoubleCalcImplementation extends CalcImplementation {

    public double plus(double x, double y) {
        return x + y;
    }
    
    @Override
    public int plus(int x, int y) {
        return (int)plus((double)x, (double)y);
    }

}
