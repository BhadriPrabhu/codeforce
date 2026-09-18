import java.util.Scanner;

public class APetyaAndStrings{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        boolean found = false;
        for(int i = 0; i < a.length(); i++){
            int at = a.charAt(i);
            int bt = b.charAt(i);
            if(at < 97){
                at+=32;
            }
            if(bt < 97){
                bt+=32;
            }
            // System.out.println(at+" "+bt);
            if(bt < at){
                System.out.println(1);
                found = true;
                break;
            }else if(bt > at){
                System.out.println(-1);
                found = true;
                break;
            }
        }
        if(found == false){
            System.out.println(0);
        }
    }
}