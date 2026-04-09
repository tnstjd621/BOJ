// P1003 피보나치 함수 Silver III

package Silver;
import java.util.*;
class P1003{
    static int[] zeroCount = new int[41];
    static int[] oneCount = new int[41];
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        precompute();
        
        int num = sc.nextInt();
        for(int i = 0; i < num; i++){
            int n = sc.nextInt();
            System.out.println(zeroCount[n] + " " + oneCount[n]);
        }
    }
    
    public static void precompute(){
        zeroCount[0] = 1;
        oneCount[0] = 0;
        zeroCount[1] = 0;
        oneCount[1] = 1;

        for(int i = 2; i <= 40; i++){
            zeroCount[i] = zeroCount[i-1] + zeroCount[i-2];
            oneCount[i] = oneCount[i-1] + oneCount[i-2];
        }
    }

}