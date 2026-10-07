import java.util.Scanner;

public class AArrayColoring{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- > 0){
            int n = sc.nextInt(), c = 0;
            for(int i = 0; i < n; i++) if(sc.nextInt()%2 == 1) c++;
            System.out.println(c%2 == 0 ? "YES" : "NO");
        }
    }
}