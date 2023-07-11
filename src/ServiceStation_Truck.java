

public class ServiceStation_Truck implements ServiceStation {
    @Override
    public void check(Car[] car, Bicycle[] bicycle, Truck[] truck) {
         if (truck != null) {
             for (int i = 0; i < truck.length; i++) {
                 System.out.println("Обслуживаем " + truck[i].getModelName());
                 for (int x = 0; x < truck[i].getWheelsCount(); x++) {
                     truck[i].updateTyre();
                 }
                 truck[i].checkEngine();
                 truck[i].checkTrailer();
             }
         }
        }
    }
