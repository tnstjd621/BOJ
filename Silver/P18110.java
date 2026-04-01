// P18110 solved.ac Silver IV

package Silver;
import java.io.*;
import java.util.*;

class Main {
    public static int[] arr;
    public static int[] sorted;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        arr = new int[num];
        sorted = new int[num];

        for (int i = 0; i < num; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        mergeSort(0, num - 1);

        // 하위 15%, 상위 15% 제외
        int average;
        if ((num * 0.15) * 10 % 10 >= 5) average = (int)(num * 0.15) + 1;
        else average = (int)(num * 0.15);

        int count = 0, sum = 0;
        for (int i = average; i < arr.length - average; i++) {
            count++;
            sum += arr[i];
        }

        double a = (double) sum / count;

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        if (a * 10 % 10 >= 5) bw.write((int)a + 1 + "\n");
        else bw.write((int)a + "\n");
        bw.flush();
        bw.close();
    }

    public static void mergeSort(int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;
            mergeSort(start, mid);
            mergeSort(mid + 1, end);
            merge(start, mid, end);
        }
    }

    public static void merge(int start, int mid, int end) {
        int p = start;
        int q = mid + 1;
        int idx = start;

        while (p <= mid && q <= end) {
            if (arr[p] <= arr[q]) sorted[idx++] = arr[p++];
            else sorted[idx++] = arr[q++];
        }
        while (p <= mid) sorted[idx++] = arr[p++];
        while (q <= end) sorted[idx++] = arr[q++];

        for (int i = start; i <= end; i++) arr[i] = sorted[i];
    }
}
