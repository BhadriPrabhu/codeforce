import java.util.Scanner;

public class AWordCapitalization{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        StringBuilder sb = new StringBuilder(s);
        int t = s.charAt(0);
        if(t > 96){
            t -= 32;
        }
        char ch = (char)t;
        sb.setCharAt(0,ch);
        System.out.println(sb);
    }
}