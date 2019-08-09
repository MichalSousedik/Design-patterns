package interpreterdemo;

public class Variable extends Terminal{
    private char var;

    
    
    public Variable(char var) {
        this.var = var;
    }



    @Override
    public int interpreter(InterpreterContext context) {
        return context.getVariable(var).orElseThrow(RuntimeException::new);
    }
}
