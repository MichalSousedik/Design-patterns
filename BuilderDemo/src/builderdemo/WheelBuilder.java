package builderdemo;

public class WheelBuilder {

    private Wheel wheel = new Wheel();
    
    public void buildDiskA() {
        wheel.setDisk(new DiskA());
    }    
    
    public void buildDiskB() {
        wheel.setDisk(new DiskB());
    }
    
    public void buildSummerTire() {
        wheel.setTire(new SummerTire());     
    }
    
    public void buildWinterTire() {
        wheel.setTire(new WinterTire());     
    }
    
    public Wheel getWheel() {
        Wheel wheel =  this.wheel;
        resetWheel();
        return wheel;
    }
    
    public void resetWheel() {
        this.wheel = new Wheel();  
    }

    public void buildBikeTire() {
        wheel.setTire(new BikeTire()); 
        
    }
    
    
}
