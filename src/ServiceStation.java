public class ServiceStation implements ServiceStationImpl {
    public void check(TransportPark[] transport) {
        if (transport != null) {
            for (int i = 0; i < transport.length; i++) {
                System.out.println("Обслуживаем " + transport[i].getModelName());
                transport[i].service();
            }
        }
    }
}