// P14623 감정이입 Bronze II
package Bronze;
import java.io.*;
public class P14623 {
    public static void main(String[]args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long b1 = Long.parseLong(br.readLine().trim(), 2);
        long b2 = Long.parseLong(br.readLine().trim(), 2);
        System.out.print(Long.toBinaryString(b1 * b2));
    }
}
