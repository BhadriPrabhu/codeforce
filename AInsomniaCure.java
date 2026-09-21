import java.util.Scanner;

public class AInsomniaCure{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int l = sc.nextInt();
        int m = sc.nextInt();
        int n = sc.nextInt();
        int d = sc.nextInt();
        if(k == 1 || l == 1 || m == 1 || n == 1){
            System.out.print(d);
            return;
        }
        int c = 0;
        for(int i = 1; i <= d; i++){
            if(i%k == 0 || i%l == 0 || i%m == 0 || i%n == 0){
                c++;
            }
        }
        System.out.print(c);
    }
}