import java.util.StringTokenizer;

public class OLConstPizza {
    String bread;
    String sauce;
    String cheese;
    String topping;

    OLConstPizza(){
    }
    OLConstPizza(String bread){

        this.bread = bread;
    }
    OLConstPizza(String bread,String sauce){

        this.bread = bread;
        this.sauce = sauce;
    }
    OLConstPizza(String bread,String sauce,String cheese){

        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;
    }
    OLConstPizza (String bread, String sauce, String cheese, String topping){
        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;
        this.topping = topping;
    }
}
