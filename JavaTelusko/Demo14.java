public class Demo14 {
    // 05:13:25 Encapsulation 
    // 05:25:04 Getters and setters 
    
    // 05:27:55 this keyword 
    // 05:37:36 constructor 
    // 05:44:35 default vs parameterized constructor 

    // encapsulation, use private var and public getter/setter

    public static void main(String[] args) {
        Human human = new Human();
        human.setName("John Doe");
        human.setAge(30);
        System.out.println("Name: " + human.getName()+", "+"Age: " + human.getAge());
        // System.out.println("Age: " + human.getAge());
        Human human1=new Human("Wong",60);
        System.out.println("Name: " + human1.getName()+", "+"Age: " + human1.getAge());
        Human human2=new Human();
        System.out.println("Name: " + human2.getName()+", "+"Age: " + human2.getAge());
    }
}

class Human {
    private String name;
    private int age;

    //constructors
    public Human() {
        this.name = "Nameless";
        this.age = 99;
    }
    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public int getAge() {
        return this.age;
    }
}