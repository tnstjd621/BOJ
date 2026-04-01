// P2869 달팽이는 올라가고 싶다 Bronze I

package Bronze;
import java.util.Scanner;
public class P2869{
    public static void main(String[]args){
        Scanner sn = new Scanner(System.in);
        int a = sn.nextInt();
        int b = sn.nextInt();
        int v = sn.nextInt();
        System.out.print((v - a + (a - b) - 1) / (a - b) + 1);
    }
}