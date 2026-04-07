// P14940 쉬운 최단거리 Silver I

package Silver;
import java.util.*;
class P14940{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int[][] arr = new int[n][m];
        int[][] dist = new int[n][m];
        int sx = 0;
        int sy = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                arr[i][j] = sc.nextInt();
                dist[i][j] = -1;
                if(arr[i][j] == 2){
                    sx = i;
                    sy = j;
                }
                else if(arr[i][j] == 0)
                    dist[i][j] = 0;
            }
        }

        int[] dx = { -1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};
        Queue<int[]> q = new LinkedList<>();
        dist[sx][sy] = 0;
        q.add(new int[]{sx,sy});
        while(!q.isEmpty()){
            int[] cur = q.poll();
            for(int d = 0; d < 4; d++){
                int nx = cur[0] + dx[d];
                int ny = cur[1] + dy[d];
                if(nx < 0 || ny < 0 || nx >= n || ny >= m) continue;
                if (arr[nx][ny] == 0 || dist[nx][ny] != -1) continue;
                dist[nx][ny] = dist[cur[0]][cur[1]] + 1;
                q.add(new int[]{nx, ny});
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                sb.append(dist[i][j]);
                if (j < m - 1) sb.append(' ');
            }
            sb.append('\n');
        }
        System.out.print(sb);
    }
}