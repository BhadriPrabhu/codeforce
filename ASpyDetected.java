import java.util.Scanner;
import java.util.HashMap;

public class ASpyDetected{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- > 0){
            int n = sc.nextInt(), nu = 0;
            HashMap<Integer,Integer> hm = new HashMap<>();
            for(int i = 0; i < n; i++){
                int t = sc.nextInt();
                if(hm.containsKey(t)) nu = t; 
                else hm.put(t,i);
            }
            for(HashMap.Entry<Integer,Integer> i : hm.entrySet()) if(nu != i.getKey()) System.out.println(i.getValue()+1);
        }
        
    }
}