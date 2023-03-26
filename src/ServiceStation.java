public class ServiceStation {
    public void check(Car car) {
            checkTransportWheel(car);
            car.checkEngine();
        }


    public void check(Bicycle bicycle) {
            checkTransportWheel(bicycle);
        }


    public void check(Truck truck) {

            checkTransportWheel(truck);
            truck.checkEngine();
            truck.checkTrailer();
    }

    private void checkTransportWheel(TransportWheel transportWheel) {
        System.out.println("Обслуживаем " + transportWheel.getModelName());
        for (int i = 0; i < transportWheel.getWheelsCount(); i++) {
            transportWheel.updateTyre();
        }
    }
}