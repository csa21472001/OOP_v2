public class ServiceStation_Bicycle implements ServiceStation {
    @Override
    public void check(Car[] car, Bicycle[] bicycle, Truck[] truck) {
        if (bicycle != null) {
            for (int i = 0; i < bicycle.length; i++) {
            System.out.println("Обслуживаем " + bicycle[i].getModelName());
            for (int x = 0; x < bicycle[i].getWheelsCount(); x++) {
                bicycle[i].updateTyre();
            }
        }
        }
    }
}
