public class DEmo7 {
    public static void main(String[] args) {
        int [][] numbers = {{10, 20, 30}, {40, 50,60},  {70, 80, 90}};
        int num2[][] = new int[3][3];

        // print all elements
        System.out.println("numbers[][]");
        for (int[] row : numbers) {
            for (int num : row) {
                System.out.print(num + " ");
                
            }
            System.out.println();
        }
        System.out.println("\nnum2[][]");
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                num2[i][j] = numbers[i][j] *10;
                System.out.print(num2[i][j] + " ");
            }
            System.out.println();
        }
        //random
        System.out.println("\nnum2[][] Random");
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                num2[i][j] = (int) (Math.random() *10);
                System.out.print(num2[i][j] + " ");
            }
            System.out.println();
        }
    }
}
