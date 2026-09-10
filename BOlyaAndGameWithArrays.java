import java.util.Scanner;
import java.util.Arrays;

public class BOlyaAndGameWithArrays{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for(int z = 0; z < test; z++){
            int al = sc.nextInt();
            int[] m = new int[al];
            int min = Integer.MAX_VALUE;
            for(int i = 0; i < al; i++){
                int len = sc.nextInt();
                int[] arr = new int[len];
                for(int j = 0; j < len; j++){
                    arr[j] = sc.nextInt();
                }
                Arrays.sort(arr);
                m[i] = arr[1];
                if(min > arr[0])min = arr[0];
            }
            Arrays.sort(m);
            int min1 = m[0];
            long tot = 0;
            for(int i : m){
                tot += i;
            }
            System.out.println(tot+min-min1);
        }
    }
}