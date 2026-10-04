import java.util.Scanner;

public class AButtons{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- > 0){
            int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
            System.out.println(a + c%2 > b ? "First" : "Second");
        }
    }
}