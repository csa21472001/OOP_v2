public class Main {
    public static void main(String[] args) {
//        Car car = new Car();
//        Car car2 = new Car();
//        car.modelName = "car1";
//        car2.modelName = "car2";
//        car.wheelsCount = 4;
//        car2.wheelsCount = 4;

        Car[] cars = new Car[]{
                new Car("car1", 4),
                new Car("car2", 4),
        };

//        Truck truck = new Truck();
//        Truck truck2 = new Truck();
//        truck.modelName = "truck1";
//        truck2.modelName = "truck2";
//        truck.wheelsCount = 6;
//        truck2.wheelsCount = 8;

        Truck[] trucks = new Truck[]{
                new Truck("truck1", 6),
                new Truck("truck2", 8),
        };

//        Bicycle bicycle = new Bicycle();
//        Bicycle bicycle2 = new Bicycle();
//        bicycle.modelName = "bicycle1";
//        bicycle2.modelName = "bicycle2";
//        bicycle.wheelsCount = 2;
//        bicycle2.wheelsCount = 2;

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
//        station.check(car, null, null);
//        station.check(car2, null, null);
//        station.check(null, bicycle, null);
//        station.check(null, bicycle2, null);
//        station.check(null, null, truck);
//        station.check(null, null, truck2);

    }
}