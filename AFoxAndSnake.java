import java.util.Scanner;

public class AFoxAndSnake{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int r = m-1;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(i%2 == 0 || (i%2 == 1 && j == r)){
                    System.out.print("#");
                }else{
                    System.out.print(".");
                }
            }
            System.out.println();
            if(i%2 == 1){
                if(r == m-1) r = 0;
                else r = m-1;
            }
        }
    }
}