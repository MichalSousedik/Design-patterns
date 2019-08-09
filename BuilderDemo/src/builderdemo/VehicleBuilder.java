package builderdemo;

public class VehicleBuilder {
    
    private Vehicle vehicle = new Vehicle();
    WheelBuilder wheelBuilder = new WheelBuilder();
    WheelDirector wheelDirector = new WheelDirector();
    
    public void buildBikeWheel() {
        wheelDirector.buildBikeWheel(wheelBuilder);
        vehicle.getWheels().add(wheelBuilder.getWheel());
    }    
    
    public void buildSummerWheel() {
        wheelDirector.buildSummerWheel(wheelBuilder);
        vehicle.getWheels().add(wheelBuilder.getWheel());
    } 
    
    public void buildWinterWheel() {
        wheelDirector.buildWinterWheel(wheelBuilder);
        vehicle.getWheels().add(wheelBuilder.getWheel());
    }
    
    public void buildHandlebars() {
        vehicle.setSteering(new HandleBars());
    }
    
    public void buildSteeringWheel() {
        vehicle.setSteering(new SteeringWheel());
    }
    
    public Vehicle getVehicle() {
        return vehicle;
    }
    
    public void resetVehicle() {
        this.vehicle = new Vehicle();
    }
    

}
