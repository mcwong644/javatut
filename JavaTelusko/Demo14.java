public class Demo14 {
    public static void main(String[] args) {
        Mobile1 obj1 = new Mobile1();
        Mobile1.show1();
    }
}

class Mobile1 {
    String brand;
    int price;
    String type;
    static String subtype="5G";

    public Mobile1() {
        System.out.println(this.brand + " " + this.price + " " + this.type + " " + Mobile1.subtype);
    }
    public static void show1(){
        System.out.println("in static show1 method");
    }

}