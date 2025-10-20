package ABD.Learnovate.SearchingSorting;
class Search{
    public static int lin(int[] arr,int key){
        int a=0;
        int i;
        for (i = 0; i <arr.length ; i++) {
            if (key == arr[i]) {
                a = arr[i];
                break;
            }
        }
            if (a == key) {
                System.out.println("Element at index "+i+" is "+a);
            }
            else{
                System.out.println("Element not found.");
            }
        return -1;
    }
}
public class linear {
    public static void main(String[] args) {
        int[] arr={1,2,3,56,67,87,4};
        int key=87;
        Search.lin(arr,key);
    }
}
