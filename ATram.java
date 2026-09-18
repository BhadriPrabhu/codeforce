import java.util.Scanner;

public class ATram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int c = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < len; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            c -= a;
            c += b;
            max = Math.max(max,c);
        }
        System.out.println(max);
    }
}