import java.util.Scanner;

public class AHalloumiBoxes{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- > 0){
            int n = sc.nextInt(), k = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++) arr[i] = sc.nextInt();
            if(k == 1){
                boolean less = false;
                for(int i = 1; i < n; i++) if(arr[i-1] > arr[i]) less = true;
                System.out.println(less ? "NO" : "YES");
            }else System.out.println("YES");
        }
    }
}