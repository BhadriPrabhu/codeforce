import java.util.Scanner;
import java.util.Arrays;

public class ARemoveSmallest{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- > 0){
            int n = sc.nextInt();
            boolean no = false;
            int[] arr = new int[n];
            for(int i = 0; i < n; i++) arr[i] = sc.nextInt();
            Arrays.sort(arr);
            for(int i = 0; i < n-1; i++) if(Math.abs(arr[i]-arr[i+1]) > 1) no = true;
            System.out.println(no ? "NO" : "YES");
        }   
    }
}