import java.time.LocalTime;

/**
 * @author : Christian Berniga
 * @class : 4 D
 * @created : 22/03/2022, martedì
 **/
public class VehicleInGarage {
    private LocalTime arrivingTime;
    private Vehicle vehicle;

    public VehicleInGarage(String data[]){
        arrivingTime=LocalTime.parse(data[1]);
        if(data[0].equalsIgnoreCase("C"))
            vehicle=new Car(Integer.parseInt(data[2]),Integer.parseInt(data[3]),data[4],data[5],data[6],Integer.parseInt(data[7]));
        else if (data[0].equalsIgnoreCase("M"))
            vehicle=new Motorcycle(Integer.parseInt(data[2]),Integer.parseInt(data[3]),data[4],data[5],data[6],Integer.parseInt(data[7]));
        else
            vehicle=new Van(Integer.parseInt(data[2]),Integer.parseInt(data[3]),data[4],data[5],data[6],Float.parseFloat(data[7]));
    }

    public float priceComputation(){return vehicle.priceComputation(arrivingTime);}

    public String toString(){return vehicle.toString()+";"+arrivingTime.toString();}


}
