// P11399 ATM Silver IV
package Silver;
import java.util.*;
class P11399{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for(int i = 0 ; i < num; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int[] sum = new int[num];
        sum[0] = arr[0];
        int count = sum[0];
        for(int i = 1; i < num; i++){
            sum[i] = sum[i-1] + arr[i];
            count += sum[i];
        }
        System.out.print(count);
    }
}