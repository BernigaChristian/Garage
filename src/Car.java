import java.time.LocalTime;
import static java.time.temporal.ChronoUnit.HOURS;
import static java.time.temporal.ChronoUnit.MINUTES;

/**
 * @author : Christian Berniga
 * @class : 4 D
 * @created : 22/03/2022, martedì
 **/
public class Car extends Vehicle{
    private int seats;

    public Car(int registrationYear,int displacement,String brand,String model,String fuel,int seats){
        super(registrationYear,displacement,brand,model,fuel);
        this.seats=seats;
    }

    public Car(Car c){
        super(c);
        this.seats=c.seats;
    }

    public float priceComputation(LocalTime arrivingTime){return 1.5F*(HOURS.between(arrivingTime, LocalTime.now())+(MINUTES.between(arrivingTime,LocalTime.now()))/60);}

    public Car clone(){return new Car(this);}

    public String toString(){return super.toString()+seats;}
}
