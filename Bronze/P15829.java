// P15829 Hashing Bronze II

package Bronze;
import java.util.Scanner;
import java.math.BigInteger;

class P15829 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BigInteger mod = new BigInteger("1234567891");
        int what = scan.nextInt(); 
        scan.nextLine();
        String word = scan.nextLine();

        BigInteger sum = BigInteger.ZERO;
        BigInteger base = BigInteger.valueOf(31);

        for (int i = 0; i < word.length(); i++) {
            int value = word.charAt(i) - 'a' + 1;
            BigInteger term = BigInteger.valueOf(value)
                    .multiply(base.pow(i))
                    .mod(mod);
            sum = sum.add(term).mod(mod);
        }

        System.out.println(sum);
    }
}
