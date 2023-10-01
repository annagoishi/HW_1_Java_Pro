package task1;
//В созданном пакете создайте класс Автомобиль.
// Создайте поля для типа автомобиля – грузовик, спорткар, легковой
// (можно сделать перечисление), мощность двигателя (сколько лошадиных сил),
// поля для марки и модели автомобиля. Одно из полей сделайте публичным,
// второе – без модификатора доступа, остальные – приватными.
// Создайте объект этого класса в программе и попробуйте установить значения для полей.
// Какие поля возможно установить? Для приватных полей напишите геттеры и сеттеры.
// Создайте класс Завод. Класс будет производить три вида автомобилей (иметь 3 метода)
// – спорткар, грузовик, легковой. В основной программе создайте несколько автомобилей
// с помощью класса Завод.
public class Car {
    private CarType carType;

    private int motorPower;
    String carBrand;
    public String carModel;

    public CarType getCarType() {
        return carType;
    }
    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    public int getMotorPower() {
        return motorPower;
    }

    public void setMotorPower(int motorPower) {
        this.motorPower = motorPower;
    }

    public Car(CarType carType, int motorPower, String carBrand, String carModel) {
        this.carType = carType;
        this.motorPower = motorPower;
        this.carBrand = carBrand;
        this.carModel = carModel;
    }

}
