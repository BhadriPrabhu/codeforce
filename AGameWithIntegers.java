import java.util.Scanner;

public class AGameWithIntegers{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for(int i = 0; i < test; i++){
            int n = sc.nextInt();
            if(n%3 == 0){
                System.out.println("Second");
            }else{
                System.out.println("First");
            }
        }
    }
}