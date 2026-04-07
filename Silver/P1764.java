// P1764 듣보잡 Silver IV

package Silver;
import java.util.*;
class P1764{
    public static void main(String[]args){
        Scanner sn = new Scanner(System.in);
        int n = sn.nextInt();
        int m = sn.nextInt();
        sn.nextLine();
        
        HashSet<String> hear = new HashSet<>(); //HashSet은 중복이 포함되어있지 않고 해쉬값으로 원소들이 저장되어 탐색이 O(1)임.
        for(int i = 0; i < n; i++){
            hear.add(sn.nextLine());
        }

        ArrayList<String> both = new ArrayList<>();
        for(int i = 0; i < m; i++){
            String tmp = sn.nextLine();
            if(hear.contains(tmp))
                both.add(tmp);
        }
        Collections.sort(both);
        System.out.println(both.size());
        for(String name : both)
            System.out.println(name);
    }
}