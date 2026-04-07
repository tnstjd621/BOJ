// P2606 바이러스 Silver III
package Silver;
import java.util.*;
class P2606{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int node = sc.nextInt();
        int edge = sc.nextInt();
        HashSet<Integer>[] arr = new HashSet[node+1];
        for(int i = 1; i <= node; i++){
            arr[i] = new HashSet<Integer>();
        }
        for(int m = 0; m < edge; m++){
            int i = sc.nextInt(), j = sc.nextInt();
            arr[i].add(j);
            arr[j].add(i);
        }
        boolean[] visited = new boolean[node + 1];
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        visited[1] = true;
        int count = 0;
        while(!queue.isEmpty()){
            int cur = queue.poll();
            for(int next : arr[cur]){
                if(!visited[next]){
                    visited[next] = true;
                    queue.add(next);
                    count++;
                }
            }
        }
        System.out.print(count);
    }
}