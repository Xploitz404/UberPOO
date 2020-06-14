public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Hola mundo!!");
        UberX uberX = new UberX("XYZ-123", new Driver("José Pérez", "EXM123"), "Toyota", "Prius");
        uberX.setPassenger(4);
        uberX.printDataCar();
        UberVan uberVan = new UberVan("BLC123", new Driver("Pedro lozada", "JKL623"));
        uberVan.setPassenger(6);
/*         Car car2 = new Car("ALV-456", new Account("Alonso González", "EXP456"));
        car2.passenger = 6;
        car2.printDataCar(); */
    }
}
