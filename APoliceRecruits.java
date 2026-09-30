import java.util.Scanner;

public class APoliceRecruits{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = 0, sum = 0;
        for(int i = 0; i < n; i++){
            int t = sc.nextInt();
            if(t > 0) sum += t;
            else{
                if(sum > 0){
                    sum--;
                }else{
                    c++;
                }
            }
        }
        System.out.println(c);
    }
}