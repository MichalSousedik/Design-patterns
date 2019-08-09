
public abstract class CalcAbstraction {

    private CalcImplementation calcImplementation;
    
    public CalcAbstraction(CalcImplementation calcImplementation) {
        this.calcImplementation = calcImplementation;
    }
    
    public int plus(int x, int y) {return calcImplementation.plus(x,y);}
    
}
