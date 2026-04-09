// P1012 유기농 배추 Silver II

package Silver;
import java.util.*;
public class P1012{
    static boolean[][] visited;
    static int[][] arr;
    static int row, col;
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i = 0; i < num; i++){
            col = sc.nextInt();
            row = sc.nextInt();
            int K = sc.nextInt();
            arr = new int[row][col];
            visited = new boolean[row][col];
            for(int j = 0; j < K; j++){
                int tmp_col = sc.nextInt();
                int tmp_row = sc.nextInt();
                arr[tmp_row][tmp_col] = 1;
            }
            int count = 0;
            for(int m = 0; m < row; m++){
                for(int n = 0; n < col; n++){
                    if(arr[m][n] == 1 && !visited[m][n]){
                        bfs(m, n);
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }
    static void bfs(int x, int y){
        int[] dx = {0, 0, -1, 1};
        int[] dy = {1, -1, 0, 0};
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x,y});
        visited[x][y] = true;
        while(!queue.isEmpty()){
            int[] cur = queue.poll();
            for(int i = 0; i < 4; i++){
                int nx = cur[0] + dx[i];
                int ny = cur[1] + dy[i];
                if((nx < row && nx >= 0) && (ny < col && ny >= 0) && (arr[nx][ny] == 1 && !visited[nx][ny])){
                    queue.add(new int[]{nx,ny});
                    visited[nx][ny] = true;
                }
            }
        }
    }
}