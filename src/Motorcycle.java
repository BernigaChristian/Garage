import java.time.LocalTime;

import static java.time.temporal.ChronoUnit.HOURS;
import static java.time.temporal.ChronoUnit.MINUTES;

/**
 * @author : Christian Berniga
 * @class : 4 D
 * @created : 22/03/2022, martedì
 **/
public class Motorcycle extends Vehicle{
    private int engineTiming;

    public Motorcycle(int registrationYear,int displacement,String brand,String model,String fuel,int engineTiming){
        super(registrationYear,displacement,brand,model,fuel);
        this.engineTiming=engineTiming;
    }

    public Motorcycle(Motorcycle m){
        super(m);
        this.engineTiming=m.engineTiming;
    }

    public float priceComputation(LocalTime arrivingTime){return HOURS.between(arrivingTime, LocalTime.now())+(MINUTES.between(arrivingTime,LocalTime.now()))/60;}

    public Motorcycle clone(){return new Motorcycle(this);}

    public String toString(){return super.toString()+engineTiming;}
}
