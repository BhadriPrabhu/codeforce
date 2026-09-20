import java.util.Scanner;

public class AUltraFastMathematician{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s1.length(); i++){
            char ch1 = s1.charAt(i);
            char ch2 = s2.charAt(i);
            if(ch1 == '1' && ch2 == '1'){
                sb.append('0');
            }else if(ch1 == '1' || ch2 == '1'){
                sb.append('1');
            }else{
                sb.append('0');
            }
        }
        System.out.println(sb);
    }
}