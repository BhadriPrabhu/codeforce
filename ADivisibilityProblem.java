import java.util.Scanner;

public class ADivisibilityProblem{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for(int i = 0; i < test; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int t = a/b;
            if(a%b != 0){
                t += 1;
                System.out.println((t*b)-a);
            }else{
                System.out.println(0);
            }
        }
    }
}