// P4999 아! Bronze V

package Bronze;
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String pat = scan.nextLine();
        String doc = scan.nextLine();
        if(doc.length()<=pat.length()){
            System.out.print("go");
        }
        else{
            System.out.print("no");
        }
    }
}