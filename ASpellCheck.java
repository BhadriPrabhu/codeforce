import java.util.Scanner;
import java.util.HashMap;

public class ASpellCheck{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- > 0){
            int n = sc.nextInt();
            String s = sc.next();
            String t = "Timur";
            if(n == t.length()){
                HashMap<Character,Integer> hm = new HashMap<>();
                for(int i = 0; i < n; i++) hm.put(t.charAt(i),1);
                for(int i = 0; i < n; i++) if(hm.containsKey(s.charAt(i))) hm.remove(s.charAt(i));
                System.out.println(hm.size() == 0 ? "YES" : "NO");
            }else{
                System.out.println("NO");
            }
        }
    }
}