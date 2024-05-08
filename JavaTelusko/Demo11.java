public class Demo11 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity());
        sb=new StringBuffer("Hello");
        
        System.out.println(sb.capacity());
        sb.setLength(30);
        System.out.println(sb.capacity());
        sb.append(" World");
        System.out.println(sb.toString());
        sb.deleteCharAt(2);
        System.out.println(sb.toString());
        sb.insert(4, "java");
        System.out.println(sb.toString());
        sb.ensureCapacity(100);
        System.out.println(sb.capacity());

    }
}
