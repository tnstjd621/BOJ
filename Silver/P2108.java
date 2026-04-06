// P2108 통계학 Silver II

package Silver;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class P2108 {
    public static int src[];
    public static int tmp[];
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        src = new int[n];
        for(int i = 0; i<n; i++){
            src[i] = scan.nextInt();
        }
        tmp = new int[n];
        mergeSort(0, src.length-1);
        if(src.length == 1) tmp[0] = src[0];
        mean();
        median();
        most();
        range();
    }
    public static void mean(){
        long sum = 0;
        for(int j = 0; j < tmp.length; j++){
            sum += tmp[j];
        }
        System.out.println((int)Math.round((double)sum/ tmp.length));
        return;
    }
    public static void median(){
        System.out.println(tmp[tmp.length/2]);
    }
    public static void most(){
        int maxCount = 0;
        int i = 0;
        while(i < tmp.length){
            int count = 1;
            while(i + count < tmp.length && tmp[i + count] == tmp[i]){
                count++;
            }
            if(count > maxCount) maxCount = count;
            i += count;
        }
    
        List<Integer> modes = new ArrayList<>();
        i = 0;
        while(i < tmp.length){
            int count = 1;
            while(i + count < tmp.length && tmp[i + count] == tmp[i]){
                count++;
            }
            if(count == maxCount) modes.add(tmp[i]);
            i += count;
        }
    
        if(modes.size() > 1){
            System.out.println(modes.get(1));
        } else {
            System.out.println(modes.get(0));
        }
    }
    public static void range(){
        System.out.println(tmp[tmp.length-1] - tmp[0]);
    }
    public static void mergeSort(int start, int end){
        if (start < end){
            int mid = (start + end) / 2;
            mergeSort(start, mid);
            mergeSort(mid + 1, end);
            
            int p = start;
            int q = mid + 1;
            int idx = p;
            
            while(p <= mid || q <= end){
                if(q > end || (p <= mid && src[p] < src[q])){
                    tmp[idx++] = src[p++];
                }
                else{
                    tmp[idx++] = src[q++];
                }
            }
            for(int i = start; i <= end; i++){
                src[i] = tmp[i];
            }
        }
    }
}