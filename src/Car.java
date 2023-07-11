public class Car extends TransportPark{

    public Car(String modelName, int wheelsCount) {
        super(modelName,wheelsCount);
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
}
