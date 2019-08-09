package builderdemo;

public class WheelDirector {
    
    public void buildSummerWheel (WheelBuilder wheelBuilder) {
        wheelBuilder.buildDiskA();
        wheelBuilder.buildSummerTire();
    }    
    
    public void buildWinterWheel (WheelBuilder wheelBuilder) {
        wheelBuilder.buildDiskA();
        wheelBuilder.buildWinterTire();
    } 
    
    public void buildBikeWheel (WheelBuilder wheelBuilder) {
        wheelBuilder.buildDiskA();
        wheelBuilder.buildBikeTire();
    }

}
