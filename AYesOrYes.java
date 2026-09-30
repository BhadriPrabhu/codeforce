import java.util.Scanner;

public class AYesOrYes{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for(int i = 0; i < test; i++){
            String s = sc.next();
            String l = s.toLowerCase();
            if(l.equals("yes"))System.out.println("YES");
            else System.out.println("NO");
        }
    }
}