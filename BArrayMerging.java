import java.util.Scanner;
import java.util.HashMap;

public class BArrayMerging{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for(int z = 0; z < test; z++){
            HashMap<Integer,Integer> hs = new HashMap();
            int len = sc.nextInt();
            int[] arr = new int[len];
            int f = 0;
            for(int i = 0; i < len; i++){
                int val = sc.nextInt();
                if(i == 0){
                    f = val;
                }
                hs.put(val,1);
            }
            int c = 0;
            for(int i = 0; i < len; i++){
                int val = sc.nextInt();
                if(hs.containsKey(val)){
                    c++;
                }
            }
            if(c <= f){
                System.out.println(f);
            }else{
                System.out.println(c);
            }
        }
    }
}