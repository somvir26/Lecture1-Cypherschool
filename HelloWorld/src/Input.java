
import java.util.*;
public class Input {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("enter integer");
        int a = s.nextInt();
        System.out.println("string");
        s.next();
        String str=s.nextLine();

        System.out.println(a);
        System.out.println(str);

    }
}
