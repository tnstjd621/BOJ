// P1259 팰린드롬수 Bronze I
package Bronze;

import java.util.Scanner;
class P1259 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        while(str.compareTo("0") != 0){
            check(str);
            str = scan.nextLine();
        }
    }
    public static void check(String str){
        int len = str.length();
        for(int i = 0; i<=(len/2)-1; i++){
            if(str.charAt(i) != str.charAt(len-i-1)){
                System.out.println("no");
                return;
            }
        }
        System.out.println("yes");
        return;
    }
}
