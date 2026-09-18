import java.util.Scanner;

public class AAntonAndDanik{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int c = 0;
        for(int i = 0; i < n; i++){
            if(s.charAt(i) == 'D'){
                c++;
            }
        }
        if(c > n-c){
            System.out.println("Danik");
        }else if(c < n-c){
            System.out.println("Anton");
        }else{
            System.out.println("Friendship");
        }
    }
}