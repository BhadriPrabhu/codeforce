import java.util.Scanner;
import java.util.HashMap;

public class AGames{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<Integer,Integer> hma = new HashMap<>();
        HashMap<Integer,Integer> hmb = new HashMap<>();
        int c = 0;
        for(int i = 0; i < n; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(hmb.containsKey(a)) c += hmb.get(a);
            if(hma.containsKey(b)) c += hma.get(b);
            if(hma.containsKey(a)){
                int val = hma.get(a);
                hma.put(a,val+1);
            }else{
                hma.put(a,1);
            }
            if(hmb.containsKey(b)){
                int val = hmb.get(b);
                hmb.put(b,val+1);
            }else{
                hmb.put(b,1);
            }
        }
        System.out.println(c);
    }
}