// P1920 수 찾기 Silver IV

package Silver;
import java.util.Scanner;
import java.util.Arrays;
public class P1920 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        for(int i = 0; i < n; i++){
            A[i] = sc.nextInt();
        }
        //Sort A
        Arrays.sort(A);
        int m = sc.nextInt();
        int[] B = new int[m];
        for(int i = 0; i < m; i++){
            B[i] = sc.nextInt();
        }
        for(int num : B){
            binarySearch(num, 0, A.length-1, A);
        }
    }
    public static void binarySearch(int target, int first, int last, int[] arr){
        if(first > last){
            System.out.println(0);
            return;
        }
        int mid = (first + last)/2;
        if(arr[mid] == target){
            System.out.println(1);
            return;
        }
        if(arr[mid] > target){
            binarySearch(target, first, mid-1, arr);
        }
        else{
            binarySearch(target, mid+1, last, arr);
        }
    }
}