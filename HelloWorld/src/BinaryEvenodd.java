import java.util.*;
public class BinaryEvenodd {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the number by your choice:");
        int number=s.nextInt();
        if((number&1)==0){
            System.out.println("the number is even");
        }
        else{
            System.out.println("the number is odd");
        }
    }
}
