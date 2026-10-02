import java.util.Scanner;
import java.util.HashMap;

public class ABeautifulYear{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        n++;
        while(true){
            HashMap<Integer,Integer> hm = new HashMap<>();
            int t = n, c = 0;
            while(t > 0){
                int d = t%10;
                if(!hm.containsKey(d)){
                    hm.put(d,1);
                    c++;
                }
                t /= 10;
            }
            if(c == 4) break;
            n++;
        }
        System.out.println(n);
    }
}