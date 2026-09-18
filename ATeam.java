import java.util.Scanner;

public class ATeam{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int tot = 0;
        for(int i = 0; i < len; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if(a+b+c >= 2){
                tot++;
            }
        }
        System.out.println(tot);
    }
}