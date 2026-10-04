import java.util.Scanner;
import java.util.ArrayList;

public class ATeamOlympiad{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        ArrayList<Integer> c = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            int t = sc.nextInt();
            if(t == 1) a.add(i);
            else if(t == 2) b.add(i);
            else c.add(i);
        }
        int len = Math.min(a.size(),Math.min(b.size(),c.size()));
        System.out.println(len);
        for(int i = 0; i < len; i++) System.out.println(a.get(i)+" "+b.get(i)+" "+c.get(i));
    }
}