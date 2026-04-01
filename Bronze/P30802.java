// P30802 웰컴 키트 Bronze III

package Bronze;
import java.util.Scanner;
public class P30802 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[7];
        for(int i = 0; i<6; i++){
            arr[i] = sc.nextInt();
        }
        int t = sc.nextInt();
        int p = sc.nextInt();

        int sum = 0;
        for(int i = 0; i<6; i++){
            sum += (arr[i] + t - 1) / t;
        }
        System.out.println(sum);
        System.out.print(n / p + " " + n%p);
    }
}
