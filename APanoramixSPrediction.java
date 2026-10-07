import java.util.Scanner;

public class APanoramixSPrediction{
    public static boolean isPrime(int n){
        if(n <= 1) return false;
        for(int i = 2; i * i <= n; i++) if(n%i == 0) return false;
        return true;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        for(int i = a+1; i < b; i++){
            if(isPrime(i)){
                System.out.println("NO");
                return;
            }
        }
        System.out.println(isPrime(b) ? "YES" : "NO");
    }
}