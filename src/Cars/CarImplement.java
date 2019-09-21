package Cars;

public class CarImplement {
    public static void main(String[] args) {
        Car car1 = new Car("TOYOTA",125,1350);
        System.out.println("Мощность car1:" + car1.getCarPower() + " л.с.");
        car1.setCarPower(135);
        System.out.println("Мощность car1 после модернизации:" + car1.getCarPower() + " л.с.");

        Car lorry1 = new Lorry("MAN", 360, 2800, 10000);
        System.out.println(((Lorry) lorry1).getCarBrand() + ", Мощность lorry1:" + lorry1.getCarPower() + " л.с.");
        lorry1.setCarPower(395);
        ((Lorry) lorry1).setCarBrand("SUPERMAN");
        System.out.println(((Lorry) lorry1).getCarBrand() + ", Мощность lorry1 после модернизации:" + lorry1.getCarPower() + " л.с.");
    }
}
