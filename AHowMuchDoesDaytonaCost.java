import java.util.Scanner;
import java.util.Arrays;

public class AHowMuchDoesDaytonaCost{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- > 0){
            int n = sc.nextInt(), k = sc.nextInt();
            boolean found = false;
            for(int i = 0; i < n; i++) if(sc.nextInt() == k) found = true;
            System.out.println(found ? "YES" : "NO");
        }
    }
}