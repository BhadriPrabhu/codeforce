import java.util.Scanner;

public class ALucky{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- > 0){
            int n = sc.nextInt(), i = 0, c= 0;
            while(n > 0){
                c += i++ < 3 ? n%10 : -(n%10);
                n /= 10;
            }
            System.out.println(c == 0 ? "YES" : "NO");
        }
    }
}