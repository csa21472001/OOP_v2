public class Main {
    public static void main(String[] args) {

        Car[] cars = new Car[]{
                new Car("car1", 4),
                new Car("car2", 4),
        };

        Truck[] trucks = new Truck[]{
                new Truck("truck1", 6),
                new Truck("truck2", 8),
        };

        Bicycle[] bicycles= new Bicycle[]{
                new Bicycle("bicycle1", 2),
                new Bicycle("bicycle2", 2),
        };

        ServiceStation carCheck = new ServiceStation_Car();
        ServiceStation bicycleCheck = new ServiceStation_Bicycle();
        ServiceStation truckCheck = new ServiceStation_Truck();
            carCheck.check(cars,null,null);
            bicycleCheck.check(null,bicycles,null);
            truckCheck.check(null,null,trucks);
    }
}