public class Methods {
    // method = a block of code that is executed whenever it is called upon
    public static void main (String[] args){

        String name = "Austin";
        int age = 18;

        hello(name,age); // call method

        int x = 3;
        int y = 4;

        int z = add(x,y); // call method

        System.out.println(z);
    }

    static void hello(String name, int age){ //method
        System.out.println("Hello "+name);
        System.out.println("You are "+age);
    }

    static int add(int x, int y) { //method

        int z = x + y;
        return z;

    }
}
