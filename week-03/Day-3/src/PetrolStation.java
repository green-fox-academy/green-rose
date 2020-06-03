import java.util.*;

public class PetrolStation {
    public static void main(String[] args) {
        //List<String> cars = new ArrayList<String>(Arrays.asList("blue", "black", "green", "white"));
        Station station = new Station(350);
        Car[] carsInStation = new Car[5];
        for (int i = 0; i <5 ; i++) {
            carsInStation[i] = new Car();
        }
        for (Car car: carsInStation) {
            station.reFill(car);
            System.out.println(car.getCapacity()+": "+car.getGasAmount());
        }
        System.out.println(station.getGasAmount());
    }
}
