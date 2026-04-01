// P10773 제로 Silver IV

package Silver;

import java.util.Scanner;
import java.util.ArrayList;
class P10773 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList <Integer> nums = new ArrayList<>();
        int num = scan.nextInt();
        for(int i = 0; i<num; i++){
            int temp = scan.nextInt();
            if(temp == 0) nums.remove(nums.size() - 1);
            else nums.add(temp);
        }
        int sum = 0;
        for(int a : nums){
            sum += a;
        }
        System.out.print(sum);
    }
}