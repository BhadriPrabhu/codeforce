import java.util.Scanner;

public class AHulk{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            if(i != 0){
                System.out.print("that ");
            }
            if(i%2 == 0){
                System.out.print("I hate ");
            }else{
                System.out.print("I love ");
            }
        }
        System.out.print("it");
    }
}