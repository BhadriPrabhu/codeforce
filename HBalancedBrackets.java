import java.util.Scanner;
import java.util.Stack;

public class HBalancedBrackets{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '(') st.push('(');
            else{
                if(st.size() == 0){
                    System.out.print("NO");
                    return;
                }else{
                    st.pop();
                }
            }
        }
        if(st.size() != 0){
            System.out.print("NO");
            return;
        }
        System.out.print("YES");
    }
}