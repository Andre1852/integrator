package Cars;
//Создать производный класс Lorry (грузовик), характеризуемый также грузоподъемностью кузова.
//Определить для него функции переназначения марки и изменения грузоподъемности.

public class Lorry extends Car {
    int payloadCapacity;

    public Lorry(String carBrand, int carPower, int carWeight, int payloadCapacity) {
        super(carBrand, carPower, carWeight);
        this.payloadCapacity = payloadCapacity;
    }

    public int getPayloadCapacity() {
        return payloadCapacity;
    }

    public void setPayloadCapacity(int payloadCapacity) {
        this.payloadCapacity = payloadCapacity;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }
}
