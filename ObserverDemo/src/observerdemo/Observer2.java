package observerdemo;

import java.util.Observable;
import java.util.Observer;

public class Observer2 implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("o2: " + ((EventData)arg).getMsg());

    }

}
