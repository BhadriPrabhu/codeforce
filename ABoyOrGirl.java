import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class ABoyOrGirl{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Set<Character> st = new HashSet<>();
        int c = 0;
        for(int i = 0; i < s.length(); i++){
            if(st.add(s.charAt(i))){
                c++;
            }
        }
        if(c%2 == 0){
            System.out.println("CHAT WITH HER!");
        }else{
            System.out.println("IGNORE HIM!");
        }     
    }
}