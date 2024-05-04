public class Demo5 {
    public static void main(String[] args) {
        Computer obj = new Computer();
        String p=obj.getPen(10);
        System.out.println(p);

    }
}

class Computer {
    public void playMusic(){
        System.out.println("Playing music...");
    }
    public String getPen(int cost) {
        if (cost >= 10)
            return "Pen";

        // no need else -default return value if cost is less than or equal to 10
        return "too cheap";
    }
}

