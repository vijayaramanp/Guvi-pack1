
import java.util.Scanner;
class StringReverse{
 public static void main(String []qwe){
	 
	 Scanner sc=new Scanner(System.in);
	 String S=sc.next();
	 String S1=new StringBuilder(S).reverse().toString();
	 System.out.println(S1);
 }
}
