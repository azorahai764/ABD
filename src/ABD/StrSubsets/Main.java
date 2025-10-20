package ABD.StrSubsets;

public class Main {
    public static void subsets(String str,int i,String ans){
        //Base condition
        if(i==str.length()){
            if(ans.isEmpty()){
                System.out.println("null");
            }
            else {
                System.out.println(ans);
            }
            return;
        }
        //Recursion
        //Yes
        subsets(str,i+1,ans+str.charAt(i));
        //No
        subsets(str,i+1,ans);
    }
    public static void main(String[] args) {
        String str="abc";
        subsets(str,0,"");
    }
}