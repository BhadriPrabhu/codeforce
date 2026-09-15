import java.util.Scanner;

public class ANextRound{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int k = sc.nextInt();
        int c = 0;
        int arr[] = new int[len];
        for(int i = 0; i < len; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < len; i++){
            if(arr[i] >= arr[k-1] && arr[i] > 0){
                c++;
            }
        }
        System.out.println(c);
    }
}