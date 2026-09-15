import java.util.Scanner;
import java.util.HashSet;

public class BEraseFirstOrSecondLetter{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for(int z = 0; z < test; z++){
            int len = sc.nextInt();
            String s = sc.next();
            HashSet<Character> hs = new HashSet();
            int tot = 0, c = 0;
            for(int i = 0; i < len; i++){
                if(hs.add(s.charAt(i))){
                    c++;
                }
                tot += c;
            }
            System.out.println(tot);
        }
    }
}