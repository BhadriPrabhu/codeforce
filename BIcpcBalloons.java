import java.util.Scanner;
import java.util.HashMap;

public class BIcpcBalloons{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- > 0){
            int n = sc.nextInt(), c = 0;
            String s = sc.next();
            HashMap<Character,Integer> hm = new HashMap<>();
            for(int i = 0; i < n; i++){
                if(hm.containsKey(s.charAt(i))) c += 1;
                else{
                    hm.put(s.charAt(i),1);
                    c += 2;
                }
            }
            System.out.println(c);
        }
    }
}