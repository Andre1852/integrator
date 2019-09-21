package Cars;
//Создать базовый класс Саг.
//Определить характеристики торговой марки (строки), веса, мощности.
//Определить методы переназначения и изменения мощности.

public class Car {
    String carBrand;
    int carPower;
    int carWeight;

    public Car(String carBrand, int carPower, int carWeight) {
        this.carBrand = carBrand;
        this.carPower = carPower;
        this.carWeight = carWeight;
    }

    public int getCarPower() {
        return carPower;
    }

    public void setCarPower(int carPower) {
        this.carPower = carPower;
    }
}
