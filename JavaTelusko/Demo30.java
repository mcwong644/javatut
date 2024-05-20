public class Demo30 {
    public static void main(String[] args) {
        // Based on the previous code in Demo29.java, this class likely demonstrates
        // the usage of Enums in Java.

        // laptop is an enum instance of Laptop
        Laptop laptop = Laptop.Macbook;
        System.out.println("=====laptops.getClass().getSuperclass()=========");
        System.out.println(laptop.getClass().getSuperclass());
        System.out.println(laptop + ": " + laptop.getPrice());
        System.out.println("=====ALL Laptops=========");
        Laptop[] laptops = Laptop.values();
        for (Laptop l : laptops) {
            System.out.println(l + ": " + l.getPrice());
        }
    }
}

enum Laptop {
    Macbook(2000), // passing int price to the constructor
    XPS(2200),
    Surface, // no price, will use default constructor and default price
    ThinkPad(1800);

    private int price=500; //default price

    //default constructor 
    private Laptop() {
    }

    // constructor to initialize the price which is passed as an argument
    private Laptop(int price) {
        this.price = price;
    }

    public int getPrice() {
        return this.price;
    }

}
