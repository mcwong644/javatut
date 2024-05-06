public class Demo6 { 
    //https://youtu.be/BGTx91t8q50?si=jj45UOKA-tcze5QD starts 3:48
    // arrays
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        // print all elements
        for (int num : numbers) {
            System.out.println(num);
        }

        // print elements using index
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        // print elements in reverse order
        for(int i= numbers.length -1;i>=0;i--){
            System.out.println(numbers[i]);
        }
        
        for(int num: numbers) {
            System.out.print(num +" ");            
        }
 
    }    
}
