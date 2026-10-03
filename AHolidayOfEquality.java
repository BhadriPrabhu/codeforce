import java.util.Scanner;

public class AHolidayOfEquality{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), max = Integer.MIN_VALUE, c = 0;
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) if(max < (arr[i] = sc.nextInt())) max = arr[i];
        for(int i = 0; i < n; i++) c += (max-arr[i]);
        System.out.println(c);
    }
}