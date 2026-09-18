import java.util.Scanner;

public class ANearlyLuckyNumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int c = 0, cl = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '7' || s.charAt(i) == '4'){
                cl++;
            }
        }
        if(cl == 4 || cl == 7){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}