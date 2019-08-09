package memento;

import java.util.Stack;
import java.util.stream.Collectors;

public class Calc {

    private int state = 0;
    
    Stack<CalcMementoImp> mementi = new Stack<>();
    
    public void plus(int i) {
        mementi.add(new CalcMementoImp(state));
        this.state += i;
    }
    
    public int getResult() {
        return state;
    }

    public void undo() {
        CalcMementoImp c = mementi.pop();
        this.state = c.getResult();
        
    }
    
    public String getHistory() {
        return mementi.stream().map(x -> x.getResult() + "").collect(Collectors.joining(","));
    }
    
    private class CalcMementoImp implements CalcMemento {
        
        private final int state;
        
        public CalcMementoImp(int state) {
            this.state = state;
        }

        @Override
        public int getResult() {
            return state;
        }
        
        
        
    }

   
    
}
