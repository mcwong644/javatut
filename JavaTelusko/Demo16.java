

public class Demo16 {
    //06:06:08 Anonymous Object 
    public static void main(String[] args) {
        AA a = new AA();
        a.setName("Peter Lee");
        a.show();
        System.out.println(a.getName());
        
        //anonymous object created & getName() called
        // can't reuse this anonymous object for further operations
        System.out.println("Anonymous Object : " + new AA("mark anthony").getName());
        // new AA("mark anthony").show();
    }
}

class AA {
    String name;

    public AA() {
        System.out.println("AA's constructor called. Object created");
    }
    public AA(String name) {
        this.name = name;
    }
    public void show() {
        System.out.println("AA's show method called.");
    }
    public String getName() {
        // System.out.println(this.name);
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
}