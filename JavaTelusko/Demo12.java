public class Demo12 {
    public static void main(String[] args) {
        Mobile obj1 = new Mobile();
        obj1.setBrand("iPhone");
        obj1.setPrice(1500);
        obj1.setType("Smartphone");
        Mobile obj2 = new Mobile();
        obj2.setBrand("Samsung");
        obj2.setPrice(800);
        obj2.setType("Smartphone");
        // Mobile.subtype = "4G";
        System.out.println("Brand: " + obj1.getBrand() + ", Price: " + obj1.getPrice() + ", Type: " + obj1.getType()+" "+ obj1.getSubtype());
        System.out.println("Brand: " + obj2.getBrand() + ", Price: " + obj2.getPrice() + ", Type: " + obj2.getType());
        
        Mobile.subtype = "4G";
        System.out.println("Brand: " + obj1.getBrand() + ", Price: " + obj1.getPrice() + ", Type: " + obj1.getType()+" "+ obj1.getSubtype());
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
    public  Mobile() {
        // Default constructor
        System.out.println(this.brand + " " + this.price + " " + this.type + " " + Mobile.subtype);
    }   
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBrand() {
        return this.brand;
    }

    public int getPrice() {
        return this.price;
    }

    public String getType() {
        return this.type;
    }
    public String getSubtype(){
        return Mobile.subtype;
    }
    public void setSubtype(String subtype){
        Mobile.subtype = subtype;
    }
}
