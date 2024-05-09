import java.util.*;
class Odd{
	public static void main(String agr[]){
		Scanner as=new Scanner (System.in);

		System.out.print("Enter Any Number: ");
		int num=as.nextInt();

		for(int a=1; a<=num; a+=2){
			System.out.println(""+a);
		}
	}
 }