import java.util.Scanner;

public class AVanyaAndFence{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int h = sc.nextInt();
        int w = 0;
        for(int i = 0; i < n; i++){
            int p = sc.nextInt();
            if(p%h != 0){
                w++;
            }
            w += p/h;
        }
        System.out.println(w);
    }
}