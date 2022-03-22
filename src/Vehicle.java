import java.time.LocalTime;

/**
 * @author : Christian Berniga
 * @class : 4 D
 * @created : 22/03/2022, martedì
 **/
public abstract class Vehicle {
    private static int vehicles=0;
    private final int id;
    private int registrationYear;
    private int displacement;
    private String brand;
    private String model;
    private String fuel;

    public Vehicle(int registrationYear,int displacement,String brand,String model,String fuel){
        this.id=++vehicles;
        this.registrationYear=registrationYear;
        this.displacement=displacement;
        this.brand=brand;
        this.model=model;
        this.fuel=fuel;
    }

    public Vehicle(Vehicle v){
        this.id=v.id;
        this.registrationYear=v.registrationYear;
        this.displacement=v.displacement;
        this.brand=v.brand;
        this.model=v.model;
        this.fuel=v.fuel;
    }

    public int getId() {
        return id;
    }

    public int getRegistrationYear() {
        return registrationYear;
    }

    public int getDisplacement() {
        return displacement;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getFuel() {
        return fuel;
    }

    public abstract float priceComputation(LocalTime arrivingTime);

    public abstract Vehicle clone();

    public String toString(){return id+";"+registrationYear+";"+displacement+";"+brand+";"+model+";"+fuel+";";}
}
