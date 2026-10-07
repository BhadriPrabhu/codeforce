import java.util.Scanner;
import java.util.Arrays;

public class ATwins{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), tot = 0;
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
            tot += arr[i];
        }
        int sum = 0;
        Arrays.sort(arr);
        for(int i = 0; i < n/2; i++){
            int t = arr[i];
            arr[i] = arr[n-i-1];
            arr[n-i-1] = arr[i];
        }
        for(int i = 0; i < n; i++){
            sum += arr[i];
            if(sum > (tot-sum)){
                System.out.println(i+1);
                return;
            }
        }
        System.out.println(arr.length);
    }
}