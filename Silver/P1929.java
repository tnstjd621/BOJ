// P1929 소수 구하기 Silver III

package Silver;

import java.util.Scanner;
class P1929 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int min = scan.nextInt();
        int max = scan.nextInt();
        for(int i = min; i <= max; i++){
            if(checkPrime(i)){
                System.out.println(i);
            }
        }
    }
    public static boolean checkPrime(int num){
        if(num < 2) return false;
        for(int j = 2; j <= Math.sqrt(num); j++){
            if(num % j == 0){
                return false;
            }
        }
        return true;
    }
}