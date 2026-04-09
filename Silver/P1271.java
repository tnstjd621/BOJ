// P1271 엄청난 부자2 Bronze V
package Silver;
import java.util.*;
import java.math.BigInteger;
public class P1271 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        BigInteger money = sc.nextBigInteger();
        BigInteger num = sc.nextBigInteger();
        System.out.print(money.divide(num) + "\n" + money.remainder(num));
    }
}
