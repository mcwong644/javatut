public class Demo8 {
    //04:12:30 Jagged and 3D Array 
    public static void main(String[] args) {
        int nums [][] = new int[3][];
        nums[0] = new int[3];
        nums[1] = new int[4];
        nums[2] = new int[2];

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                nums[i][j] = (int) (Math.random() * 100);
                System.out.print(nums[i][j] + " ");
            }
            System.out.println(); // go to next line after printing each row
        }
    }
}
