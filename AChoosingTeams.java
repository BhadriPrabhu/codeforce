import java.util.Scanner;

public class AChoosingTeams{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt(), c = 0;
        for(int i = 0; i < n; i++) if(sc.nextInt() + k <= 5) c++;
        System.out.println(c/3);
    }
}