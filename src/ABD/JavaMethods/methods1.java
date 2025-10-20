package ABD.JavaMethods;
import java.util.Scanner;
public class methods1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string: ");
        String str=sc.next();
//        System.out.println(str.length());
//        System.out.println(str.charAt(5));
        int count_vowels=0;
        int count_consonants=0;
        String temp = str.toLowerCase();
        for (char s:temp.toCharArray()) {
            if (Character.isLetter(s)) {
                if (s=='a'||s=='e'||s=='i'||s=='o'||s=='u'){
                    count_vowels++;
                }
                else {
                    count_consonants++;
                }
            }
        }
            System.out.println("vowels: "+count_vowels);
            System.out.println("consonants: "+count_consonants);
    }
}
