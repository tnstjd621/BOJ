// P2357 최솟값과 최댓값 Gold I

package Gold;
import java.io.*;
import java.util.*;

class P2357 {
    static int[] arr;
    static int[] minTree;
    static int[] maxTree;
    static int size;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        arr = new int[m + 1];
        
        for (int i = 1; i <= m; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        size = 1;
        while (size < m) size <<= 1;

        minTree = new int[size * 2];
        maxTree = new int[size * 2];

        build();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            int minVal = queryMin(1, 1, size, start, end);
            int maxVal = queryMax(1, 1, size, start, end);

            sb.append(minVal).append(" ").append(maxVal).append("\n");
        }

        System.out.print(sb);
    }

    static void build() {
        // 리프 채우기
        for (int i = 1; i <= arr.length - 1; i++) {
            minTree[size + i - 1] = arr[i];
            maxTree[size + i - 1] = arr[i];
        }

        for (int i = size - 1; i > 0; i--) {
            minTree[i] = Math.min(minTree[i * 2], minTree[i * 2 + 1]);
            maxTree[i] = Math.max(maxTree[i * 2], maxTree[i * 2 + 1]);
        }
    }

    static int queryMin(int node, int left, int right, int ql, int qr) {
        if (qr < left || right < ql) return Integer.MAX_VALUE;
        if (ql <= left && right <= qr) return minTree[node];
        int mid = (left + right) / 2;
        return Math.min(queryMin(node * 2, left, mid, ql, qr),
                        queryMin(node * 2 + 1, mid + 1, right, ql, qr));
    }

    static int queryMax(int node, int left, int right, int ql, int qr) {
        if (qr < left || right < ql) return Integer.MIN_VALUE;
        if (ql <= left && right <= qr) return maxTree[node];
        int mid = (left + right) / 2;
        return Math.max(queryMax(node * 2, left, mid, ql, qr),
                        queryMax(node * 2 + 1, mid + 1, right, ql, qr));
    }
}
