package ABD.Array;

public class array1 {
    public static void main(String[] args) {
        int[] arr={1,23,4,5};
        int max=0;
        for (int e:arr){
            System.out.print(e+" ");
        }
        for (int i=0;i< arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }

        }
        System.out.println(max);
    }
}
