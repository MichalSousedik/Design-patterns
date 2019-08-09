package observerdemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class Subject extends Observable{

    List<Observer> observers = new ArrayList<>();
    
    public void attach(Observer o) {
        observers.add(o);
        
    }

    public void raiseEvent() {
        setChanged();
        notifyObservers(new EventData("new event"));
        clearChanged();
    }

}
