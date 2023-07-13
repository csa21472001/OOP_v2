
public class Main {
    public static void main(String[] args) {

        TransportPark[] cars = new Car[]{
                new Car("car1", 4),
                new Car("car2", 4),
        };

        TransportPark[] trucks = new Truck[]{
                new Truck("truck1", 6),
                new Truck("truck2", 8),
        };

        TransportPark[] bicycles = new Bicycle[]{
                new Bicycle("bicycle1", 2),
                new Bicycle("bicycle2", 2),
        };

        ServiceStationImpl serviceStation = new ServiceStation();
        serviceStation.check(cars);
        serviceStation.check(trucks);
        serviceStation.check(bicycles);


    }
}