import java.util.Scanner;

public class CPrependAndAppend{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- > 0){
            int n = sc.nextInt(), c = 0;
            String s = sc.next();
            for(int i = 0; i < n/2; i++){
                if(s.charAt(i) != s.charAt(n-i-1)) c += 2;
                else i = n/2;
            }
            System.out.println(n-c);
        }
    }
}