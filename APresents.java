import java.util.Scanner;

public class APresents{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            int t = sc.nextInt();
            arr[t-1] = i+1;
        }
        for(int i = 0; i < n; i++){
            System.out.print(arr[i]);
            if(i != n-1){
                System.out.print(" ");
            }
        }
    }
}