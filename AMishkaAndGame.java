import java.util.Scanner;

public class AMishkaAndGame{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = 0, c = 0;
        for(int i = 0; i < n; i++){
            int a = sc.nextInt(), b = sc.nextInt();
            if(a > b) m++;
            else if(a < b) c++;
        }
        System.out.println(m > c ? "Mishka" : m < c ? "Chris" : "Friendship is magic!^^");
    }
}