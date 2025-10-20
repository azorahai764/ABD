package ABD.ScondLarge;

public class Solution {
    public int getSecondLargest() {
        int[] arr={10,20,70,60,50};
        int max=0;
        int sec_max=0;
        for(int i:arr){
            if(i>max){
                sec_max=max;
                max=i;
            }
        }
        for(int i: arr){
             if(i>sec_max && i!=max){
                sec_max=i;
            }
        }
        System.out.println("largest number: "+max);
        System.out.println("Second largest number: "+sec_max);
        return 0;
    }
    public static void main(String[] args){
        Solution s=new Solution();
        int a=s.getSecondLargest();
        System.out.println(a);
    }
}
