package prototypedemo;

public class ExpensiveInit implements Cloneable{

    private int answer;
    
    public ExpensiveInit() {
        this(true);
    }
    
    private ExpensiveInit(boolean init) {
        if (init) {
            System.out.println("Dlouhy vypocet.");
            this.setAnswer(42);
        }
    }

    public int getAnswer() {
        return answer;
    }

    public void setAnswer(int answer) {
        this.answer = answer;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    
    public ExpensiveInit clone2() {
        ExpensiveInit clone = new ExpensiveInit(false);
        clone.answer = answer;
        return clone;
    }
    
    
    
}
