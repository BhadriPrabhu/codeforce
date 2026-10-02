import java.util.Scanner;

public class ADivision{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for(int i = 0; i < test; i++){
            int r = sc.nextInt();
            System.out.println(1900 <= r ? "Division 1" : (1600 <= r && r <= 1899) ? "Division 2" : (1400 <= r && r <= 1599) ? "Division 3" : "Division 4");
        }
    }
}