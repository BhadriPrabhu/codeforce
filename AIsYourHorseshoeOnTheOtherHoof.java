import java.util.Scanner;
import java.util.HashSet;

public class AIsYourHorseshoeOnTheOtherHoof{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> hs = new HashSet<>();
        int c = 0;
        for(int i = 0; i < 4; i++){
            int t = sc.nextInt();
            if(hs.contains(t)){
                c++;
            }else{
                hs.add(t);
            }
        }
        System.out.println(c);
    }
}