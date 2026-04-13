// P1699 제곱수의 합 Silver II
package Silver;
import java.util.*;
public class P17626 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int[] dp = new int[num+1];
        dp[1] = 1;
        int min = 0;
        for(int i = 2; i <= num; i++){
            min = Integer.MAX_VALUE;
            for(int j = 1; j*j <= i; j++){
                int temp = i - j*j;
                min = Math.min(min, dp[temp]);
            }
            dp[i] = min+1;
        }
        System.out.print(dp[num]);
    }
}
