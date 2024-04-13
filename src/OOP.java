public class OOP {
    public static void main(String[] args){

        OOPcar myCar= new OOPcar();// declarar un objeto en un classe

        // mostrar los atributos
        System.out.println(myCar.make);
        System.out.println(myCar.model);
        System.out.println(myCar.year);
        System.out.println(myCar.price);

        //usar los methodos del objeto
        myCar.drive();
        myCar.brake();
    }
}
