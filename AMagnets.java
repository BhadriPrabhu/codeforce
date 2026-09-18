import java.util.Scanner;

public class AMagnets{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cur = 0, c = 0;
        for(int i = 0; i < n; i++){
            int t = sc.nextInt();
            if(cur != t){
                c++;
                cur = t;
            }
        }
        System.out.println(c);
    }
}