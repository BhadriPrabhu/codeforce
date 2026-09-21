import java.util.Scanner;

public class ACandiesAndTwoSisters{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for(int i = 0; i < test; i++){
            int n = sc.nextInt();
            int t = (n-1)/2;
            System.out.println(t);
        }
    }
}