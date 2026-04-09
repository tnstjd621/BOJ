// P30030 스위트콘 가격 구하기 Bronze V
package Bronze;
import java.util.*;
public class P30030 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int price = sc.nextInt();
        System.out.print(price - (price / 11));
    }
}
