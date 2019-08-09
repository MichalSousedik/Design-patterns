package interpreterdemo;

public class Product extends NonTerminal {


    public Product(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public int interpreter(InterpreterContext context) {
        return right.interpreter(context) * left.interpreter(context);         
    }

}
