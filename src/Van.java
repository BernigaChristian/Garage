import java.time.LocalTime;

import static java.time.temporal.ChronoUnit.HOURS;
import static java.time.temporal.ChronoUnit.MINUTES;

/**
 * @author : Christian Berniga
 * @class : 4 D
 * @created : 22/03/2022, martedì
 **/
public class Van extends Vehicle{
    private float maxLoad;

    public Van(int registrationYear,int displacement,String brand,String model,String fuel,float maxLoad){
        super(registrationYear,displacement,brand,model,fuel);
        this.maxLoad=maxLoad;
    }

    public Van(Van v){
        super(v);
        this.maxLoad=v.maxLoad;
    }

    public float priceComputation(LocalTime arrivingTime){return 2*(HOURS.between(arrivingTime,LocalTime.now())+(MINUTES.between(arrivingTime,LocalTime.now()))/60);}

    public Van clone(){return new Van(this);}

    public String toString(){return super.toString()+maxLoad;}
}