// P31450 Everyone is a winner Bronze V
package Bronze;
import java.util.*;
public class P31450 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int medals = sc.nextInt();
        int kids = sc.nextInt();
        if(medals%kids == 0)
            System.out.print("Yes");
        else
            System.out.print("No");
    }
}
