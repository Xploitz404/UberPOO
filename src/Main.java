public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Hola mundo!!");
        Car car = new Car("XYZ-123", new Account("Pepe Martínez", "EXM123"));
        car.passenger = 4;
        car.printDataCar();
        Car car2 = new Car("ALV-456", new Account("Alonso González", "EXP456"));
        car2.passenger = 6;
        car2.printDataCar();
    }
}
