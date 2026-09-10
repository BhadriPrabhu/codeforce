// import java.util.Scanner;

// public class BSwapAndDelete{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int test = sc.nextInt();
//         for(int z = 0; z < test; z++){
//             String s = sc.next();
//             int len = s.length();
//             int c = 0;
//             StringBuilder t = new StringBuilder(s);
//             for(int i = 0; i < t.length(); i++){
//                 if(s.charAt(i) == t.charAt(i)){
//                     if(s.charAt(i) == s.charAt(len-i-1)){
//                         c++;
//                         t.deleteCharAt(i);
//                     }else{
//                         char ch = t.charAt(i);
//                         t.setCharAt(i,t.charAt(len-i-1));
//                         t.setCharAt(len-i-1,ch);
//                     }
//                 }
//             }
//             System.out.println(c);
//         }
//     }
// }

import java.util.*;

public class BSwapAndDelete
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int tst= sc.nextInt();
        for(int i=0;i<tst; i++)
        {
            String s= sc.next();
            int ones=0;
            int zeros=0;
            for(int j=0; j<s.length(); j++){
                if(s.charAt(j)=='1'){
                    ones++;
                }else{
                    zeros++;
                }
            }

            for(int k=0; k<s.length(); k++){
                if(s.charAt(k)=='1'){
                    if(zeros>0){
                        zeros--;
                    }else{
                        break;
                    }
                }else{
                    if(ones>0){
                        ones--;
                    }else{
                        break;
                    }
                }
            }

            System.out.println((zeros+ones));

        }

    }

}