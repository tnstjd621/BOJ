// P11659 구간 합 구하기 4 Silver III

package Silver;
import java.util.Scanner;
class P11659{
    public static void main(String[]args){
        Scanner sn = new Scanner(System.in);
        int N = sn.nextInt();
        int M = sn.nextInt();
        int[] arr = new int[N+1];
        arr[0] = 0;
        for(int t = 1; t <= N; t++){
            arr[t] = arr[t-1] + sn.nextInt();
        }
        for(int t = 0; t < M; t++){
            int i = sn.nextInt();
            int j = sn.nextInt();
            System.out.println(arr[j] - arr[i-1]);
        }
    }
}