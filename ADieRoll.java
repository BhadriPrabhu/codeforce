import java.util.Scanner;

public class ADieRoll{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = 7 - Math.max(sc.nextInt(),sc.nextInt());
        System.out.println(n == 0 ? "0/1" : n == 6 ? "1/1" : n == 3 ? "1/2" : n == 1 ? "1/6" : n == 2 ? "1/3" : n == 4 ? "2/3" : n == 5 ? "5/6" : n/6);
    }
}