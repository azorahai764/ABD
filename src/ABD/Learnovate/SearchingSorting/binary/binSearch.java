package ABD.Learnovate.SearchingSorting.binary;

class A {
    public static int bin(int[] arr,int key){
        int l=0;
        int r= arr.length-1;
        while(l<=r){
            int mid=(l+r)/2;
            if(arr[mid]==key){
                return mid;
            }
            if (arr[mid]<key) {
                l=mid+1;
            }
            else {
                r=mid-1;
            }
        }
        return -1;
    }
}
public class binSearch {
    public static void main(String[] args) {
        int[] arr={1,4,4,5,65,77,83};
        int key=5;
        int i= A.bin(arr,key);
        System.out.println("Element "+key+" is found at index "+i);
    }
}