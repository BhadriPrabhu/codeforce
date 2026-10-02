import java.util.Scanner;
import java.util.Arrays;

public class AABAgain{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- > 0){
            int n = sc.nextInt();
            System.out.println((n%10)+(n/10));
        }
    }
}