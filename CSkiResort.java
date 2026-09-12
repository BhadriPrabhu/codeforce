import java.io.IOException;
import java.util.Scanner;

public class CSkiResort {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        StringBuilder out = new StringBuilder();

        while (test-- > 0) {
            int n = sc.nextInt();
            long k = sc.nextLong();
            long q = sc.nextLong();

            long[] arr = new long[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextLong();
            }

            long cnt = 0;
            long ans = 0;

            for (int i = 0; i < n; i++) {
                if (arr[i] <= q) {
                    cnt++;
                } else {
                    if (cnt >= k) {
                        long l = cnt - k + 1;
                        ans += (l * (l + 1)) / 2;
                    }
                    cnt = 0;
                }
            }

            if (cnt >= k) {
                long l = cnt - k + 1;
                ans += (l * (l + 1)) / 2;
            }

            out.append(ans).append("\n");
        }
        System.out.print(out);
    }
}