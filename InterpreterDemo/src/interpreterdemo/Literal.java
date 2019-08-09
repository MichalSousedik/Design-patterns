package interpreterdemo;

public class Literal extends Terminal {

    private int value;

    public Literal(int value) {
        this.value = value;
    }

    @Override
    public int interpreter(InterpreterContext context) {
        return value;
    }
    
}
