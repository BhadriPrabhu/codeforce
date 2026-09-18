import java.util.Scanner;

public class BQueueAtTheSchool{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        String s = sc.next();
        StringBuilder sb = new StringBuilder(s);
        // t %= n;
        while(t-- > 0){
            for(int i = 0; i < n-1; i++){
                if(sb.charAt(i) == 'B' && sb.charAt(i+1) == 'G'){
                    sb.setCharAt(i,'G');
                    sb.setCharAt(i+1,'B');
                    i++;
                }
            }
        }
        System.out.println(sb);
    }
}