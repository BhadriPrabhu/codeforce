import java.util.Scanner;

public class AMinimize{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- > 0){
            int a = sc.nextInt(), b = sc.nextInt(), min = Integer.MAX_VALUE;
            for(int i = a; i <= b; i++) if(((i-a)+(b-i)) < min) min = (i-a)+(b-i);
            System.out.println(min);
        }
    }
}