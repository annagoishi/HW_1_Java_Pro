package task1;

public class Factory {
    public Car createTruck(int motorPower, String carBrand, String carModel) {
        return new Car(CarType.TRUCK, motorPower, carBrand, carModel);
    }

    public Car createSportsCar(int motorPower, String carBrand, String carModel) {
        return new Car(CarType.SPORTSCAR, motorPower, carBrand, carModel);
    }

    public Car createPassengerCar(int motorPower, String carBrand, String carModel) {
        return new Car(CarType.PASSENGERCAR, motorPower, carBrand, carModel);
    }
}
