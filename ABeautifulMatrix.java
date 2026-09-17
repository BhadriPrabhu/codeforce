import java.util.Scanner;

public class ABeautifulMatrix{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // int rt = 0, ct = 0;
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                int val = sc.nextInt();
                if(val == 1){
                    // rt = i;
                    // ct = j;
                    System.out.println(Math.abs(i-2) + Math.abs(j-2));
                    break;
                }
            }
        }
    }
}