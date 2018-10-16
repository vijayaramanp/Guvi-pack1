//nput size N<=20
import java.util.Scanner;
class Factorial{
 public static void main(String[] qwe){
  Scanner sc=new Scanner(System.in);
   int N=sc.nextInt();
   int fact=1;
   if(N==0||N==1){
    fact=1; 		
	System.out.print(fact);
   }
   else if(N<=20){
     while(N!=0){
       fact=fact*N;
       N--;
     }
	 System.out.print(fact);
   }
   else{
	   
	   System.out.print("limit exceeds");
   }
   
   
 }
  
  
}
