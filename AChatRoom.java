import java.util.Scanner;

public class AChatRoom{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = "hello";
        int in = 0;
        boolean found = false;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == t.charAt(in)){
                if(in == 4){
                    found = true;
                    break;
                }
                in++;
            }
        }
        if(found == true){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}