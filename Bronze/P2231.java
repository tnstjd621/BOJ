// P2231 분해합 Bronze II

package Bronze;
import java.util.Scanner;
public class P2231{
    public static void main(String[]args){
        Scanner sn = new Scanner(System.in);
        int num = sn.nextInt();
        int digit = String.valueOf(num).length();
        int candidate = num - digit*9;
        boolean found = false;
        for(int i = candidate; i <= num - digit*1; i++){
            if(i + sum(i) == num){
                System.out.print(i);
                found = true;
                break;
            }
        }
        if(!found) 
            System.out.print(0);
    }
    public static int sum(int num){
        int candidate = num;
        int total = 0;
        while(candidate > 0){
            total += candidate % 10;
            candidate /= 10;
        }
        return total;
    }
}