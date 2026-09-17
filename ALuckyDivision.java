import java.util.Scanner;

public class ALuckyDivision{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        boolean isFound = false;
        int arr[] = {4, 7, 44, 47, 74, 77, 444, 447, 474, 477, 744, 747, 774, 777};
        for(int i = 0; i < arr.length; i++){
            if(a%arr[i] == 0){
                isFound = true;
                break;
            }
        }
        if(isFound == true){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}