import java.util.Scanner;

public class ATranslation{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String rs = sc.next();
        if(s.length() != rs.length()){
            System.out.println("NO");
            return;
        }
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) != rs.charAt(s.length()-i-1)){
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}