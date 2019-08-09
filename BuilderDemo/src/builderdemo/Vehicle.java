package builderdemo;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Vehicle {

    public Set<Wheel> wheels = new HashSet<>();
    public Steering steering;
    
    
    public Set<Wheel> getWheels() {
        return wheels;
    }
    public void setWheels(Set<Wheel> wheels) {
        this.wheels = wheels;
    }
    public Steering getSteering() {
        return steering;
    }
    public void setSteering(Steering steering) {
        this.steering = steering;
    }
    
    @Override
    public String toString() {
        return "Steering: " + steering.toString() +
                " Number of wheels: " + wheels.size() +
                " Wheels: " + wheels.stream().map(Wheel::toString).collect(Collectors.joining(", "));
    }
    

}
