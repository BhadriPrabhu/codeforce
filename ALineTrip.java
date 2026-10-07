import java.util.Scanner;

public class ALineTrip{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- > 0){
            int n = sc.nextInt(), t = sc.nextInt(), cur = 0, max = Integer.MIN_VALUE;
            for(int i = 0; i < n; i++){
                int a = sc.nextInt();
                max = Math.max(max,a-cur);
                cur = a;
            }
            max = Math.max(max,(t-cur)*2);
            System.out.println(max);
        }
    }
}