import java.util.Scanner;

public class ATheNewYearMeetingFriends{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int t = Math.max(a,b);
        int m = Math.max(t,c);
        int r = Math.min(a,b);
        int mi = Math.min(r,c);
        System.out.println(m-mi);
    }
}