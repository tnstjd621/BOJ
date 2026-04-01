// P11689 GCD(n, k) = 1 Gold I

package Gold;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long n = Long.parseLong(br.readLine());
        long result = n;
        long x = n;

        for (long i = 2; i * i <= x; i++) {
            if (x % i == 0) {
                result = result - result / i;
                while (x % i == 0) x /= i;
            }
        }
        if (x > 1) result = result - result / x;

        System.out.println(result);
    }
}