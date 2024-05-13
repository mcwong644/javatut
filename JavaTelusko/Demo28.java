public class Demo28 {
    // 
    // 08:07:22 What is Interface 
    // 08:15:18 More on Interfaces
    // 08:18:40 Need of Interface 

    public static void main(String[] args) {
        Laptop lapobj = new Laptop();
        Desktop dskobj = new Desktop();
        Developer navin = new Developer();
        Developer navin2 = new Developer();
        // Laptop and Desktop are subclasses of Computer, so we can use an anonymous inner class to create a new instance of A that overrides the code() method
        navin.devApp(lapobj);
        navin2.devApp(dskobj);
    
    }
}

class Developer{
    public void devApp(Computer com){
        com.code();
        // System.out.println("coding...");
    }
}

interface Computer {
    void code();
}
class Laptop implements Computer {
    public void code(){
        System.out.println("from Laptop: code, compile, run...");
        }
        
 }

 class Desktop implements Computer {
    public void code(){
        System.out.println("from Desktop: code, compile, run...FASTER");
    }
 }
