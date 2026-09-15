import java.util.Scanner;

public class AWayTooLongWords{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for(int z = 0; z < test; z++){
            String s = sc.next();
            int len = s.length();
            if(len > 10){
                int t = len - 2;
                System.out.println(s.charAt(0)+""+t+""+s.charAt(len-1));
            }else{
                System.out.println(s);
            }
        }
    }
}