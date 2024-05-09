import java.util.*;
class BinaryToDecimal{
	public static void main(String arg[]){
		Scanner as=new Scanner(System.in);
		System.out.print("Enter Any Binary number : ");
		String num=as.next();
		
		int len=num.length()-1;
		int decimal=0;
		
		
	    for(int i=0; i<=len; i++){
			
		 //double value=Math.pow(a,2);
		 char ch=num.charAt(len-i);
		 int v=ch-'0';
		// double c=Math.pow(d,a);
		 decimal +=v*Math.pow(2,i);
		}	
		 System.out.println("Decimal: "+decimal);
		
		
	}

}