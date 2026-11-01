//Example of interface with default method
package divb_2526;

public interface vehicle {
    void start();
    default  void fuelType(){
        System.out.println("Default method of Vehicle");
    }
}
interface SampleX{
    default void fuelType(){
        System.out.println("Hello WOrld");
    }
}
