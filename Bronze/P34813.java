// P34813 공통교육과정 Bronze V
package Bronze;
import java.util.*;
public class P34813 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.substring(0,1);
        if(str.equals("F"))
            System.out.print("Foundation");
        else if(str.equals("C"))
            System.out.print("Claves");
        else if(str.equals("V"))
            System.out.print("Veritas");
        else
            System.out.print("Exploration");
    }
}
