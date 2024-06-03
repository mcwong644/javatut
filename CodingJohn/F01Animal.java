// abstract class cannot instantiate an object.!
public abstract class F01Animal {
    int age;
    String name;

    // declare an abstract method
    public abstract void makeNoise();

    public void printName() {
        System.out.println(name);
    }
}
