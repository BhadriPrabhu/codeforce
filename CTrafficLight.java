import java.util.Scanner;

public class CTrafficLight{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for(int z = 0; z < test; z++){
            int len = sc.nextInt();
            char st = sc.next().charAt(0);
            String s = sc.next();
            StringBuilder sb = new StringBuilder(s+s);

            if(st == 'g'){
                System.out.println(0);
                continue;
            }

            int max = 0;
            int c = 0;
            boolean isStart = false;
            for(int i = 0; i < len*2; i++){
                if(sb.charAt(i) == st && isStart == false){
                    isStart = true;
                    c=0;
                }
                if(isStart == true){
                    if(sb.charAt(i) == 'g'){
                        if(max < c){
                            max = c;
                        }
                        isStart = false;
                    }else{
                        c++;
                    }
                }
            }
            if(max == 0){
                max = c;
            }
            System.out.println(max);
        }
    }
}