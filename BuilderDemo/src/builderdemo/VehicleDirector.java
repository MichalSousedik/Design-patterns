package builderdemo;

public class VehicleDirector {

    public void buildBike(VehicleBuilder vehicleBuilder) {
       vehicleBuilder.buildBikeWheel();
       vehicleBuilder.buildBikeWheel();
       vehicleBuilder.buildHandlebars();        
    }

    public void buildPolyCar(VehicleBuilder vehicleBuilder) {
        vehicleBuilder.buildWinterWheel();
        vehicleBuilder.buildWinterWheel();
        vehicleBuilder.buildSummerWheel();
        vehicleBuilder.buildSummerWheel();
        vehicleBuilder.buildSteeringWheel();
    }

}
