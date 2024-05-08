public class Demo9 {
    // 04:20:54 Array of Objects 
    public static void main(String[] args) {
        Student[] students = new Student[4];
        students[0] = new Student(1, "John");
        students[1] = new Student(2, "Jane");
        students[2] = new Student(3, "Bob");
        students[3] = new Student(4, "Wong");

        for (Student student : students) {
            System.out.println(student.getId() + " - " + student.getName());
        }
    }
}

class Student {
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}   
