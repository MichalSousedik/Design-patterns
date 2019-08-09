package command;

public class Calculator {

    public int result = 0;
    
    public void plus(int i) {
        result+=i;
    }
    
    public int getResult() {
        return this.result;
    }

    public void setResult(int i) {
        this.result = i;
        
    }
    
}
