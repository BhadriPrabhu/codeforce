import java.util.Scanner;

public class AEvenOdds{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();
        if(n%2 == 1){
            if((n/2)+1 >= k){
                System.out.println((k*2)-1);
            }else{
                System.out.println((k%((n/2)+1))*2);
            }
        }else{
            if(n/2 < k){
                if((k%(n/2))*2 == 0){
                    System.out.println(k);
                }else{
                    System.out.println((k%(n/2))*2);
                }
            }else{
                System.out.println((k*2)-1);
            }
        }
    }
}