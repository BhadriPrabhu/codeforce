import java.util.Scanner;

public class ABit{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int sum = 0;
        for(int i = 0; i < len; i++){
            String s = sc.next();
            if(s.charAt(1) == '+'){
                sum++;
            }else{
                sum--;
            }
        }
        System.out.println(sum);
    }
}