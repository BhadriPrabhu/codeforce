import java.util.Scanner;

public class AToMyCritics{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- > 0){
            int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
            System.out.println(a+b >= 10 ? "YES" : a+c >= 10 ? "YES" : b+c >= 10 ? "YES" : "NO");
        }
    }
}