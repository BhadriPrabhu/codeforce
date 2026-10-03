import java.util.Scanner;

public class AYetAnotherTwoIntegersProblem{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- > 0){
            int a = Math.abs(sc.nextInt() - sc.nextInt());
            System.out.println((a/10) + (a%10 == 0 ? 0 : 1));
        }   
    }
}