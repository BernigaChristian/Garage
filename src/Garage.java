import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author : Christian Berniga
 * @class : 4 D
 * @created : 22/03/2022, martedì
 **/
class FullGarageException extends Exception{
    public String toString(){return "SORRY! The garage is full.";}
}

public class Garage {
    private ArrayList<VehicleInGarage> vehicles;

    public Garage(){vehicles=new ArrayList<>();}

    public void loadVehicles(String fileName)   throws IOException,FullGarageException{
        Scanner read = new Scanner(new File(fileName));
        while (read.hasNextLine())
            if(vehicles.size()<25)  vehicles.add(new VehicleInGarage(read.nextLine().split(";")));
            else    throw new FullGarageException();
    }

    public float exitVehicle(int index){
        float parkingPrice=vehicles.get(index).priceComputation();
        vehicles.remove(index);
        return parkingPrice;
    }

    public void backup(String fileName)    throws IOException{
        BufferedWriter write=new BufferedWriter(new FileWriter(fileName));
        for(VehicleInGarage v:vehicles)
            write.write(v.toString()+"\n");
        write.close();
    }

    public String toString(){
        String data="ALL THE VEHICLES IN GARAGE\n";
        for(VehicleInGarage v:vehicles)
            data+=v.toString()+"\n";
        return data;
    }
}

class Test{
    public static void main(String[] args) {
        Garage g1=new Garage();
        /**load*/
        try{g1.loadVehicles("in.txt");}
        catch (IOException | FullGarageException e){System.out.println(e);}
        /**toString*/
        System.out.println(g1.toString());
        /**backup*/
        try{g1.backup("out.txt");}
        catch (IOException e){System.out.println(e);}
        /**exit*/
        System.out.println("A car is trying to exit...PRICE="+ g1.exitVehicle(4)+"\n");
        /**toString*/
        System.out.println(g1.toString());
    }
}

