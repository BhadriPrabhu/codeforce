import java.util.Scanner;

public class AILoveUsername{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int min = 0, max = 0, c = 0;
        for(int i = 0; i < n; i++){
            int t = sc.nextInt();
            if(i == 0){
                min = t;
                max = t;
            }else{
                if(max < t){
                    max = t;
                    c++;
                }
                if(min > t){
                    min = t;
                    c++;
                }
            }
        }
        System.out.println(c);
    }
}