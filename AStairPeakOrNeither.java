import java.util.Scanner;

public class AStairPeakOrNeither{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- > 0){
            int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
            int t1 = Math.max(a,b);
            int t2 = Math.max(b,c);
            if(t2 == c && t1 == b && t1 != t2 && a != b && t1 != a) System.out.println("STAIR");
            else if(t2 == t1 && t1 != a && b != c && a != b) System.out.println("PEAK");
            else System.out.println("NONE");
        }
    }
}