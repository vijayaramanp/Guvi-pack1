import java.util.Scanner;
class Roman2Decimal {
	
	public static void main(String []qwe){
		
	Scanner sc=new Scanner(System.in);
	String rom=sc.next();
	
	String temp=0;
	
	for(int d=0;d<rom.length();d++){
		
		int L1=findValue(rom.charAt(d));
		
		if(d+1<rom.length()){
			int L2=findValue(rom.charAt(d+1));
			if(L1>=L2){
				temp=temp+L1;
			}
			else{
				temp=temp+L2-L1;
				d++;
			}
		}
		else{
			temp=temp+L1;
			d++;
		}
		
		
	}
	
	System.out.println(temp);
	
	}
	
	public static int findValue(char A){
		
		if(A=='I')
			return 1;
		else if(A=='V')
			return 5;
		else if(A=='X')
			return 10;
		else if(A=='L')
			return 50;
		else if(A=='C')
			return 100;
		else if(A=='D')
			return 500;
		else if(A=='M')
			return 1000;	
		else
			return -1;
		
	}
	

}

