import java.util.*;
class SquarePressKey{
	public static void main(String arg[]){
		Scanner as=new Scanner(System.in);
		
		System.out.print("Enter Any Number: ");
		int num=as.nextInt();
		System.out.println("Number+"+"Square+"+"Cube");
	      as.nextLine();
		int d=0;
		for(int a=1; a<=num; a++){
			d++;
			
			int b=a*a;
			int c=b*a;
			
			System.out.println(a+"\t"+b+"\t"+c);
			
			if(d==20){
			System.out.println("press Enter key then program continue");
				as.nextLine();
				d=0;
			}
		}
		
	}

}