// P11050 이항 계수 1 Bronze I

package Bronze;
import java.util.Scanner;
public class P11050 {
     public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.print((fac(n))/(fac(k)*fac(n-k)));
     }
     public static int fac(int num){
        if(num == 1 || num == 0)
            return 1;
        return num * fac(num-1);
     }
}
