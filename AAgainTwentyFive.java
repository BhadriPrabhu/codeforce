import java.util.Scanner;

public class AAgainTwentyFive{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        if(n == 1){
            System.out.println(5);
            return;
        }
        System.out.println(25);
    }
}