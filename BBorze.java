import java.util.Scanner;

public class BBorze{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        for(int i = 0; i < s.length(); i++) System.out.print(s.charAt(i) == '-' ? s.charAt(++i) == '.' ? 1 : 2 : 0);
    }
}