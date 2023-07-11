
public class ServiceStation_Car implements ServiceStation {
    @Override
    public void check(Car[] car, Bicycle[] bicycle, Truck[] truck) {
        if (car != null) {
            for (int i = 0; i < car.length; i++) {
                System.out.println("Обслуживаем " + car[i].getModelName());
                for (int x = 0; x < car[i].getWheelsCount(); x++) {
                    car[i].updateTyre();
                }
                car[i].checkEngine();
            }
        }
    }
}
