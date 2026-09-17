import java.util.Scanner;

public class AFootball{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int c = 0, cur = 0;
        boolean d = false;
        for(int i = 0; i < s.length(); i++){ 
            if(cur == 0 && s.charAt(i) == '0'){
                c++;
            }else if(cur == 1 && s.charAt(i) == '1'){
                c++;
            }else{
                if(s.charAt(i) == '0') cur = 0;
                else cur = 1;
                c = 1;
            }
            if(c >= 7) d = true;
        }
        if(d == false) System.out.println("NO");
        else System.out.println("YES");
    }
}