import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class AIWannaBeTheGuy{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Set<Integer> st = new HashSet<>();
        int c = 0;
        int p = sc.nextInt(); 
        for(int i = 0; i < p; i++){
            int t = sc.nextInt();
            if(!st.contains(t)){
                c++;
                st.add(t);
            }
            if(c == n) break;
        }
        if(c == n){
            System.out.println("I become the guy.");
            return;
        }
        int q = sc.nextInt();
        for(int i = 0; i < q; i++){
            int t = sc.nextInt();
            if(!st.contains(t)){
                c++;
                st.add(t);
            }
            if(c == n) break;
        }
        if(c == n) System.out.println("I become the guy.");
        else System.out.println("Oh, my keyboard!");
    }
}