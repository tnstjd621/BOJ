// P2805 나무 자르기 Silver II
package Silver;
import java.util.*;
public class P2805 {
    static int[] trees;
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int tree = sc.nextInt();
        int meter = sc.nextInt();
        trees = new int[tree];
        for(int i = 0; i < tree; i++){
            trees[i] = sc.nextInt();
        }
        int low = 0;
        int high = Arrays.stream(trees).max().getAsInt();
        long answer = 0;
        while(low <= high){
            int mid = low + (high - low) / 2;
            long amount = trim(mid);
            if(amount >= meter){
                answer = mid;
                low = mid + 1;
            }
            else high = mid - 1;
        }
        System.out.print(answer);
    }
    static long trim(int cut){
        long amount = 0;
        for(int i = 0; i < trees.length; i++){
            if(trees[i] - cut > 0)
                amount += trees[i] - cut;
        }
        return amount;
    }
}
