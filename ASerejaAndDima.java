import java.util.Scanner;

public class ASerejaAndDima{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n]; 
        for(int i = 0; i < n; i++) arr[i] = sc.nextInt();
        int a = 0, b = 0;
        boolean isA = true;
        for(int i = 0; i < n; i++){
            int len = n-1;
            if(arr[i] > arr[len]){
                if(isA){
                    a+=arr[i];
                    isA=false;
                }else{
                    b+=arr[i];
                    isA=true;
                }
            }else{
                if(isA){
                    a+=arr[len];
                    isA=false;
                }else{
                    b+=arr[len];
                    isA=true;
                }
                i--;
                n--;
            }
        }
        System.out.println(a+" "+b);
    }
}