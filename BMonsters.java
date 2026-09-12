import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;

public class BMonsters {
    static class Monster implements Comparable<Monster> {
        int id;
        int rem;

        Monster(int id, int rem) {
            this.id = id;
            this.rem = rem;
        }

        @Override
        public int compareTo(Monster other) {
            if (this.rem != other.rem) {
                return Integer.compare(other.rem, this.rem);
            }
            return Integer.compare(this.id, other.id);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int t = Integer.parseInt(st.nextToken());

        StringBuilder out = new StringBuilder();

        while (t-- > 0) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            Monster[] monsters = new Monster[n];
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                int health = Integer.parseInt(st.nextToken());
                int rem = health % k;
                if (rem == 0) {
                    rem = k;
                }
                monsters[i] = new Monster(i + 1, rem);
            }

            Arrays.sort(monsters);

            for (int i = 0; i < n; i++) {
                out.append(monsters[i].id).append(i == n - 1 ? "" : " ");
            }
            out.append("\n");
        }

        System.out.print(out);
    }
}