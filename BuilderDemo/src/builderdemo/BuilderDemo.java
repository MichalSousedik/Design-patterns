package builderdemo;

public class BuilderDemo {

    public static void main(String[] args) {
        
        VehicleBuilder vehicleBuilder = new VehicleBuilder();
        VehicleDirector vehicleDirector = new VehicleDirector();
        vehicleDirector.buildBike(vehicleBuilder);
        Vehicle bike = vehicleBuilder.getVehicle();
        
        System.out.println(bike);
        
        vehicleBuilder.resetVehicle();
        vehicleDirector.buildPolyCar(vehicleBuilder);
        Vehicle car = vehicleBuilder.getVehicle();
        System.out.println(car);
        
        
        
    }
}
