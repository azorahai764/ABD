package ABD.Array;
import java.util.Scanner;

public class array2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n ;
        System.out.print("Enter size: ");
        n=sc.nextInt();
        int[] arr2 = new int[n];
        for (int i = 0; i <n ; i++) {
            System.out.print("enter array elements: ");
            arr2[i] = sc.nextInt();
        }
        for (int e:arr2){
            System.out.print(e+" ");
        }
    }
}
