import java.util.Scanner;
import java.util.HashMap;

public class AAmusingJoke{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        String s = sc.next();
        if(a.length()+b.length() != s.length()){
            System.out.println("NO");
            return;
        }
        HashMap<Character,Integer> hm = new HashMap<>();
        for(int i = 0; i < a.length(); i++){
            if(hm.containsKey(a.charAt(i))){
                int val = hm.get(a.charAt(i));
                hm.put(a.charAt(i),val+1);
            }else{
                hm.put(a.charAt(i),1);
            }
        }
        for(int i = 0; i < b.length(); i++){
            if(hm.containsKey(b.charAt(i))){
                int val = hm.get(b.charAt(i));
                hm.put(b.charAt(i),val+1);
            }else{
                hm.put(b.charAt(i),1);
            }
        }
        for(int i = 0; i < s.length(); i++){
            if(hm.containsKey(s.charAt(i))){
                int val = hm.get(s.charAt(i));
                if(val == 0){
                    System.out.println("NO");
                    return;
                }else{
                    hm.put(s.charAt(i),val-1);
                }
            }else{
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}