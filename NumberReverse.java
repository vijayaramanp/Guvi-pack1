//Reverse a given numbers
import java.util.Scanner;
class NumberReverse{
 public static void main(String []qwe){
   int n=sc.nextInt();
   int R=0,digit=0;
   while(n!=0){
     digit=n/10;
     R=R*10+digit;
     n=n/10;
   }
   System.out.println(R);
 }
}
