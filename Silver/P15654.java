// P15654 N과 M (5) Silver III

package Silver;
import java.util.Scanner;

public class P15654{
    static boolean[] visited;
    static int[] result;

    public static void main(String[] args) throws Exception{
        // Input
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] arr = new int[N];
        for(int i = 0; i < N; i++){
            arr[i] = sc.nextInt();
        }

        // Sort
        insertionSort(arr);

        visited = new boolean[N];
        result = new int[M];

        // DFS
        dfs(arr, M, 0);
    }

    // dfs
    public static void dfs(int[] arr, int M, int depth){
        if(depth == M){
            for(int i = 0; i < M; i++){
                System.out.print(result[i] + " ");
            }
            System.out.println();
            return;
        }

        for(int i = 0; i < arr.length; i++){
            if(!visited[i]){
                visited[i] = true;
                result[depth] = arr[i];

                dfs(arr, M, depth + 1);

                visited[i] = false; 
            }
        }
    }

    // Sorting Algorithm
    public static void insertionSort(int[] arr){
        for(int i = 1; i < arr.length; i++){
            int key = arr[i];
            int j = i - 1;
            while(j >= 0 && arr[j] > key){
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
}