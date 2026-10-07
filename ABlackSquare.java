import java.util.Scanner;

public class ABlackSquare{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), d = sc.nextInt(), sum = 0;
        String s = sc.next();
        for(int i = 0; i < s.length(); i++){
            int t = s.charAt(i) - '0';
            if(t == 1) sum += a;
            else if(t == 2) sum += b;
            else if(t == 3) sum += c;
            else sum += d;
        }
        System.out.print(sum);
    }
}