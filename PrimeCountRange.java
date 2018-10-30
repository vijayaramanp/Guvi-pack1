import java.util.Scanner;
class PrimeCountRange{
	public static void main(String[] qwe){
		
		Scanner x=new Scanner(System.in);
		int l=x.nextInt();
		int r=x.nextInt();
		int count=0;
		int a=l;
		for(;a<=r;){
			int prime=0;
			for (int b=2;b<a;b++){
				if(a%b==0){
					prime=1;
					break;
				}			
				
			}
			if(prime==0)
				count++;
			a++;
		}
		System.out.println(count);
	}


}
