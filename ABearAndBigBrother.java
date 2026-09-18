import java.util.Scanner;

public class ABearAndBigBrother{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int y = 0;
        while(a <= b){
            a *= 3;
            b *= 2;
            y++;
        }
        System.out.println(y);
    }
}