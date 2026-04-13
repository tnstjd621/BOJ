// P1620 나는야 포켓몬 마스터 이다솜 Silver IV
package Silver;
import java.util.*;
class P1620{
    public static void main(String[]args_){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] arr = new String[N + 1];
        int M = sc.nextInt();
        sc.nextLine();
        Map<String, Integer> map = new HashMap<>();
        for(int i = 1; i <= N; i++){
            arr[i] = sc.nextLine();
            map.put(arr[i], i);
        }
        for(int j = 0; j < M; j++){
            String tmp = sc.nextLine();
            char first = tmp.charAt(0);
            if(Character.isDigit(tmp.charAt(0))){
                int num = Integer.parseInt(tmp);
                System.out.println(arr[num]);
            }
            else{
                System.out.println(map.get(tmp));
            }
        }
    }
}