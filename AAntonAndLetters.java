import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class AAntonAndLetters{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String sr = s.substring(1,s.length()-1);
        if(sr.length() == 0){
            System.out.println(0);
            return;
        }
        String[] arr = sr.split(", ");
        Set<Character> st = new HashSet<>();
        int c = 0;
        for(int i = 0; i < arr.length; i++){
            if(!st.contains(arr[i].charAt(0))){
                c++;
                st.add(arr[i].charAt(0));
            }
        }
        System.out.println(c);
    }
}