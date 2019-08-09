package observerdemo;

import java.util.Observer;

public class ObserverDemo {

    public static void main (String[] args) {
        
        Subject s = new Subject();
        Observer o1 = new Observer1();
        Observer o2 = new Observer2();
        
        s.addObserver(o1);
        s.addObserver(o2);
        
        s.raiseEvent();
    }
    
}
