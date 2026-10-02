import java.util.Scanner;

public class ABuyAShovel{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt(), r = sc.nextInt(), i = 1;
        while(true){
            if((i*k)%10 == 0 || (i*k)%10 == r)break;
            i++;
        }
        System.out.println(i);
    }
}