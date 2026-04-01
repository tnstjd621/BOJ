// P2798 블랙잭 Bronze II

package Bronze;
import java.util.Scanner;
public class P2798 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for(int i = 0; i<n; i++){
            for(int j = 1; j < n ; j++){
                if(j == i) j++;
                else{
                    for(int h = 2; h < n; h++){
                        if(h == j || h == i) h++;
                        else{
                            if (arr[i] + arr[j] + arr[h] > sum && arr[i] + arr[j] + arr[h] <= m) sum = arr[i] + arr[j] + arr[h];
                        }
                    }
                }
            }
        }
        System.out.print(sum);
    }
}
