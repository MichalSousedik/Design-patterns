package interpreterdemo;

public class Sum extends NonTerminal {

    public Sum(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public int interpreter(InterpreterContext context) {
        return right.interpreter(context) + left.interpreter(context);        
    }

}
