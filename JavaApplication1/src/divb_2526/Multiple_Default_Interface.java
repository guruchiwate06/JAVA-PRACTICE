//to implement multiple intrefce with default method 
package divb_2526;

public class Multiple_Default_Interface implements vehicle,SampleX{
    public void start(){
        System.out.println("Start implemented");
    }
    public void fuelType(){
        vehicle.super.fuelType();      //for calling the fueltype method from the vehicle 
        SampleX.super.fuelType();      //for calling the fueltype from the SampleX 
        System.out.println("Issue Resloved");
    }
    @Override 
    public void start(){
        throw new UnsupportedOperatoinException("Not Supported");
    }
}
