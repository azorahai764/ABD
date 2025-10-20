package ABD.Backtracking;

public class Prob1 {
    public static void changeArr(int[] a, int i, int val){
        if(i==a.length){
            for (int n:a){
                System.out.print(n+ " ");
            }
            return;
        }
        a[i]=val;
        changeArr(a,i+1,val+1);
        a[i]=a[i]-2;
    }
    public static void main(String[] args) {
    int[] a=new int[5];
    changeArr(a,0,1);
        System.out.println();
        for (int n:a){
            System.out.print(n+ " ");
        }
}}
