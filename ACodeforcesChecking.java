import java.util.Scanner;

public class ACodeforcesChecking{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- > 0){
            // char ch = sc.next().charAt(0);
            // if("codeforces".contains(String.valueOf(ch))) System.out.println("YES");
            // else System.out.println("NO");
            System.out.println("codeforces".contains(sc.next()) ? "YES" : "NO");
        }
    }
}