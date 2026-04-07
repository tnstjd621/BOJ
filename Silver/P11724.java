// P11724 연결 요소의 개수

package Silver;
import java.util.*;
class P11724 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int node = sc.nextInt();
        int edge = sc.nextInt();
        HashSet<Integer>[] arr = new HashSet[node + 1];
        for (int i = 1; i <= node; i++) arr[i] = new HashSet<>();
        for (int m = 0; m < edge; m++) {
            int i = sc.nextInt(), j = sc.nextInt();
            arr[i].add(j);
            arr[j].add(i);
        }
        boolean[] visited = new boolean[node + 1];
        int count = 0;
        for (int start = 1; start <= node; start++) {
            if (!visited[start]) {
                count++;
                Queue<Integer> queue = new LinkedList<>();
                queue.add(start);
                visited[start] = true;
                while (!queue.isEmpty()) {
                    int cur = queue.poll();
                    for (int next : arr[cur]) {
                        if (!visited[next]) {
                            visited[next] = true;
                            queue.add(next);
                        }
                    }
                }
            }
        }
        System.out.print(count);
    }
}