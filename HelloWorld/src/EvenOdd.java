import java.util.*;
public class EvenOdd {
    public static void main(String []args){
        Scanner s = new Scanner(System.in);
        System.out.println("the input take from user");
        int number = s.nextInt();
        if(number % 2==0){
            System.out.println("the number is even");
        }
  else {
      System.out.println("the number is odd");
        }
  s.close();
    }
}
