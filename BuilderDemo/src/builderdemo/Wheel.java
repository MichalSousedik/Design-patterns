package builderdemo;

public class Wheel {

    private Tire tire;
    
    private Disk disk;

    public Tire getTire() {
        return tire;
    }

    public void setTire(Tire tire) {
        this.tire = tire;
    }

    public Disk getDisk() {
        return disk;
    }

    public void setDisk(Disk disk) {
        this.disk = disk;
    }
    
    @Override
    public String toString() {
        return "Tire: " + tire + " Disk: " + disk;
    }
    
}
