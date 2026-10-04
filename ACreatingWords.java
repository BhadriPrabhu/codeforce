import java.util.Scanner;

public class ACreatingWords{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- > 0){
            String s1 = sc.next(), s2 = sc.next();
            System.out.println(s2.charAt(0)+s1.substring(1)+" "+s1.charAt(0)+s2.substring(1));
        }
    }
}