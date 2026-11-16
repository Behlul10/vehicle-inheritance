public class MainApp {
    public static void main(String[] args) {
        Moped slowRide = new Moped("Red", 1, 0, 5);

        slowRide.setFuelCapacity(5);

        System.out.println(slowRide.getColor());
    }
}
