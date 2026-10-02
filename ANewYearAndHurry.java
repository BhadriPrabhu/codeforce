import java.util.Scanner;

public class ANewYearAndHurry{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int min = 240-k, i = 0;
        for(int j = 1; j <= n; j++){
            if(min >= 5*j){
                i++;
                min -= 5*j;
            }else{
                break;
            }
        }
        System.out.println(i);
    }
}