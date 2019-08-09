package adapterdemo;

public class CalcClassAdapter extends Calc implements Calculator {

    @Override
    public int sum(int i, int j) {
        return (int) this.plus(i, j);
    }

}
