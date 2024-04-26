public class inheritance {
    public static void main(String[] args) {

        // inheritance = 	the process where one class acquires,
        //					the attributes and methods of another.

        inheritanceCar car = new inheritanceCar();

        car.go();

        inheritanceBicycle bike = new inheritanceBicycle();

        car.go();
        bike.stop();

        System.out.println(car.doors);
        System.out.println(bike.pedals);

    }
}
