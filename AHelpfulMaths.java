import java.util.Scanner;
import java.util.Arrays;

public class AHelpfulMaths{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int l = (s.length()+1)/2;
        char[] arr = new char[l];
        int in = 0;
        for(int i = 0; i < s.length(); i += 2){
                arr[in] = s.charAt(i);
                in++;
        }
        Arrays.sort(arr);
        StringBuilder sb = new StringBuilder(s);
        in = 0;
        for(int i = 0; i < s.length(); i += 2){
            sb.setCharAt(i,arr[in]);
            in++;
        }
        System.out.println(sb);
    }
}