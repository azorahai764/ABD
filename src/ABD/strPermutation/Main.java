package ABD.strPermutation;

public class Main {
    public static void find(String str,String ans){
        if(str.isEmpty()){
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char cur=str.charAt(i);
            String str2=str.substring(0,i)+str.substring(i+1);
            find(str2,ans+cur);
        }
    }

    public static void main(String[] args) {
        String str="abcd";
        find(str,"");

    }
}
