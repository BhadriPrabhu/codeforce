import java.util.Scanner;
import java.util.Arrays;

public class ARestoringThreeNumbers{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[4];
        int max = Integer.MIN_VALUE, maxi = 0;
        for(int i = 0; i < 4; i++) if(max < (arr[i] = sc.nextInt())){ max = arr[i]; maxi = i; }
        for(int i = 3; i >= 0; i--) if(i != maxi) System.out.print((max-arr[i])+" ");
    }
}