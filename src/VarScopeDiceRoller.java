import java.util.Random;
public class VarScopeDiceRoller {

    //global  = declared outside a method, but within a class
    //   visible to all parts of a class
    Random random;
    int number;

    VarScopeDiceRoller(){
        random = new Random();
        roll();
    }

    void roll() {
        number = random.nextInt(6) + 1;
        System.out.println(number);
    }

}
