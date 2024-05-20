public class Demo29 {
    // This class appears to be demonstrating the usage of Enums in Java.
    // Based on the comments in the previous code snippets, we can infer the
    // following:

    // 08:27:11 What is Enum
    // 08:34:04 enum if and switch
    // 08:37:59 Enum Class
    public static void main(String[] args) {
        Status status = Status.PENDING;
        System.out.println(status);
        status = Status.INPROGRESS;
        System.out.println(status);
        Status st = Status.valueOf("COMPLETED");
        System.out.println(st);
        Status st2 = Status.COMPLETED;
        System.out.println(st2.ordinal());
        Status st3 = Status.values()[2];
        System.out.println(st3);
        System.out.println("=====ALL Statuses=========");
        Status[] statuses = Status.values();
        for (Status s : statuses) {
            System.out.println("status "+s + " ordinal: " + (s.ordinal() + 1) + " name: " + s.name() + " name as string: " + s.toString());
        }
        System.out.println("=====if else======");
        if (status == Status.INPROGRESS) {
            System.out.println("The status is INPROGRESS");
        } else{
            System.out.println("The status is not INPROGRESS");
        }
        System.out.println("======switch======");
        status=Status.FAILED;
        switch (status) {
            case PENDING:
                System.out.println("The status is PENDING");
                break;
            case INPROGRESS:
                System.out.println("The status is INPROGRESS");
                break;
            case COMPLETED:
            System.out.println("The status is COMPLETED");
            break;
            case FAILED:
            System.out.println("The status is FAILED");
            break;
            default:
            System.out.println("The status is unknown");
            break;

        }
    }

}

enum Status {
    PENDING, INPROGRESS, COMPLETED, FAILED;
}
