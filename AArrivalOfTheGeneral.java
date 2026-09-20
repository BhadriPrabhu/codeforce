import java.util.Scanner;

public class AArrivalOfTheGeneral{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE, maxi = 0, mini = 0;
        int c = 0;
        for(int i = 0; i < n; i++){
            int a = sc.nextInt();
            if(max < a){
                max = a;
                maxi = i+1;
            }
            if(min >= a){
                min = a;
                mini = i+1;
            }
        }
        c = maxi-1;
        if(maxi > mini){
            c--;
        }
        c += n-mini;
        System.out.print(c);
    }
}