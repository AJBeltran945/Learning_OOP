public class ArrayObjects {
    public static void main(String[] args){

//        ArrayObjectsFood[] reff = new ArrayObjectsFood[3];

        ArrayObjectsFood Pasta = new ArrayObjectsFood("tomato","tuna");
        ArrayObjectsFood Sushi = new ArrayObjectsFood("rice","seaweed","crab");
        ArrayObjectsFood IceCream = new ArrayObjectsFood("icecream");

        ArrayObjectsFood [] reff = {Pasta,Sushi,IceCream};

//        reff [0] = Pasta;
//        reff [1] = Sushi;
//        reff [2] = IceCream;

        System.out.println(reff[0].ingridient1);
        System.out.println(reff[1].ingridient2);
        System.out.println(reff[2].ingridient3);
    }
}
