import java.util.Scanner;

public class AMarathon{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- > 0){
            int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), d = sc.nextInt();
            System.out.println((a<b ? 1 : 0) + (a<c ? 1 : 0) + (a<d ? 1 : 0));
        }
    }
}