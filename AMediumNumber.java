import java.util.Scanner;

public class AMediumNumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- > 0){
            int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
            if(Math.max(a,b) == a && Math.max(a,c) == a) System.out.println(Math.max(b,c));
            else if(Math.max(a,b) == b && Math.max(b,c) == b) System.out.println(Math.max(a,c));
            else System.out.println(Math.max(a,b));
        }
    }
}