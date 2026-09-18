import java.util.Scanner;

public class AStringTask{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        StringBuilder sb = new StringBuilder(s);
        // System.out.println(sb);
        for(int i = 0; i < sb.length(); i++){
            char ch = sb.charAt(i);
            int t = ch;
            if(t < 97){
                t += 32;
                ch = (char)t;
            }
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                sb.deleteCharAt(i);
                i--;
            }
            else{
                sb.setCharAt(i,ch);
                sb.insert(i,'.');
                i++;
            }
        }
        System.out.println(sb);
    }
}