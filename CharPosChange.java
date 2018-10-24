import java.util.Scanner;
class CharPosChange{
	
	public static void main(String []asd){
		Scanner x=new Scanner(System.in);
		String st1=x.nextLine();
		int len=st1.length();
		char []arr=new char[len];
		for(int d=0;d<=len/2;d++){
			arr[d]=st1.charAt(d+1);
			arr[d+1]=st1.charAt(d);
			d++;
		}
		if(len%2==1){
			arr[len-1]=st1.charAt(len-1);
			
		}
		
		System.out.println(arr);
		
	}
	
	
}

