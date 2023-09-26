public abstract class TransportPark {
    private String modelName;
    private int wheelsCount;

    public TransportPark(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public void service() {
        for (int i = 0; i < this.wheelsCount; i++) {
            this.updateTyre();
        }
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    public String getModelName() {
        return modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }


//    public static void check(TransportPark[] transport) {
//        if (transport != null) {
//            for (int i = 0; i < transport.length; i++) {
//                System.out.println("Обслуживаем " + transport[i].getModelName());
//                for (int x = 0; x < transport[i].getWheelsCount(); x++) {
//                    transport[i].updateTyre();
//                    updateTyre ();
//                }
//            }
//        }
//    }
}
