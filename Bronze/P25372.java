// P25372 성택이의 은밀한 비밀번호 Bronze V

package Bronze;
import java.util.Scanner;
class Main{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        for(int i = 0; i<num ; i++){
            String pw = scan.next();
            if(pw.length() >= 6 && pw.length() <= 9){
                System.out.println("yes");
            }
            else{
                System.out.println("no");
            }
        }
    }
}