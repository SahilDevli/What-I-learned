import java.util.*;

class revision{
    public static void main(String[] strg){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.print("Enter array elements: \n");
        for(int i=0; i<5; i++){
            arr[i] = sc.nextInt();
        }
        // array printing
        for(int i=0; i<arr.length; i++){
            System.out.print(" "+arr[i]);
        }
        sc.close();
    }
}