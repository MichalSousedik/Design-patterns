package interpreterdemo;

public abstract class NonTerminal extends Expression {

    protected Expression left;
    protected Expression right;
    
    public NonTerminal(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }
    
    
    
}
