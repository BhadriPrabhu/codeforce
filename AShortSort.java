import java.util.Scanner;

public class AShortSort{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- > 0){
            String s = sc.next(), t = "abc";
            int c = 0;
            for(int i = 0; i < s.length(); i++) if(s.charAt(i) == t.charAt(i)) c++;
            System.out.println(c >= 1 ? "YES" : "NO");
        }
    }
}