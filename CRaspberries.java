import java.util.Scanner;

public class CRaspberries{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for(int z = 0; z < test; z++){
            int len = sc.nextInt();
            int k = sc.nextInt();
            int min = k;
            int even = 0;
            for(int i = 0; i < len; i++){
                int n = sc.nextInt();
                if(n%k != 0){
                    int sub = k - (n%k);
                    if(min > sub) min = sub;
                }else{
                    min = 0;
                }
                if(n%2 == 0){
                    even++;
                }
            }
            if(k == 4){
                int o = Math.max(0, 2-even);
                min = Math.min(min,o);
            }
            System.out.println(min);
        }
    }
}