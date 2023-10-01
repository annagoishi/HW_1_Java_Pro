package task1;

public class Main {
    public static void main(String[] args) {
        Factory factory = new Factory();

        Car truck = factory.createTruck(200, "Kamaz", "670");
        Car sportsCar = factory.createSportsCar(385, "Porsche", "911");
        Car passengerCar = factory.createPassengerCar(250, "Toyota", "Camry");

        passengerCar.setMotorPower(235);
        sportsCar.setMotorPower(470);

        System.out.println("Автомобиль №1");
        System.out.println("Марка грузового автомобиля: " + truck.carBrand);
        System.out.println("Модель грузового автомобиля: " + truck.carModel);
        System.out.println("Мощность двигателя: " + truck.getMotorPower());
        System.out.println("----------------------------");
        System.out.println("Автомобиль №2");
        System.out.println("Марка спортивного автомобиля: " + sportsCar.carBrand);
        System.out.println("Модель спортивного автомобиля: " + sportsCar.carModel);
        System.out.println("Мощность двигателя: " + sportsCar.getMotorPower());
        System.out.println("----------------------------");
        System.out.println("Автомобиль №3");
        System.out.println("Марка пассажирского автомобиля: " + passengerCar.carBrand);
        System.out.println("Модель пассажирского автомобиля: " + passengerCar.carModel);
        System.out.println("Мощность двигателя: " + passengerCar.getMotorPower());
    }
}
