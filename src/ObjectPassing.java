public class ObjectPassing {
    public static void main(String[] args) {
        ObjectPassingGarrage garage = new ObjectPassingGarrage();

        ObjectPassingCar car1 = new ObjectPassingCar("BMW");
        ObjectPassingCar car2 = new ObjectPassingCar("Tesla");

        garage.park(car1);
        garage.park(car2);
    }
}
