// P7595 Triangles Bronze IV
package Bronze;
import java.util.*;
import java.io.*;
public class P7595 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String line;
        while ((line = br.readLine()) != null) {
            int n = Integer.parseInt(line.trim());
            if (n == 0) break;
            for (int i = 1; i <= n; i++) {
                for (int j = 0; j < i; j++) {
                    sb.append('*');
                }
                sb.append('\n');
            }
        }
        System.out.print(sb);
    }
}