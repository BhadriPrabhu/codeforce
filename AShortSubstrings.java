import java.util.Scanner;
import java.util.HashMap;

public class AShortSubstrings{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- > 0){
            String s = sc.next();
            System.out.print(s.charAt(0));
            for(int i = 1; i < s.length(); i++){
                if(i != s.length()-1 && s.charAt(i) == s.charAt(i+1)) i++;
                System.out.print(s.charAt(i));
            }
            System.out.println();
        }
    }
}