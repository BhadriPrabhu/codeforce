import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class APangram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n < 26){
            System.out.println("NO");
            return;
        }
        String s = sc.next();
        Set<Character> st = new HashSet<>();
        int ct = 0;
        for(int i = 0; i < n; i++){
            char t = s.charAt(i);
            int c = t;
            if(c < 97) c += 32;
            char ch = (char)c;
            if(!st.contains(ch)){
                ct++;
                st.add(ch);
            }
        }
        if(ct == 26){
            System.out.print("YES");
        }else{
            System.out.print("NO");
        }
    }
}