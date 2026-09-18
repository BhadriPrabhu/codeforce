import java.util.Scanner;

public class AWord{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int low = 0, up = 0;
        for(int i = 0; i < s.length(); i++){
            int t = s.charAt(i);
            if(t < 97){
                up++;
            }else{
                low++;
            }
        }
        if(up <= low){
            System.out.println(s.toLowerCase());
        }else{
            System.out.println(s.toUpperCase());
        }  
    }
}