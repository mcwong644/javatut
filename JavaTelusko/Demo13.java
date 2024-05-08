
public class Demo13 {
    public static void main(String[] args) throws ClassNotFoundException {
        // load class w/o instantiating objects
        Class.forName("Mobile");
    }
}
class Mobile {
    String brand;
    int price;
    String type;
    static String subtype;
    // static initializer block
    static
    {
        subtype="5G";
        System.out.println("Static Subtype Initialized to: " + subtype);
    }
    public Mobile() {
        System.out.println(this.brand + " " + this.price + " " + this.type + " " + Mobile.subtype);
    }
}