import java.util.Scanner;

public class BBlankSpace{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- > 0){
            int n = sc.nextInt(), z = 0, max = 0;
            for(int i = 0; i < n; i++){
                int t = sc.nextInt();
                if(t == 0) z++;
                else{
                    if(max < z) max = z;
                    z = 0;
                }
            }
            if(max < z) max = z;
            System.out.println(max);
        }
    }
}