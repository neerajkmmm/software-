import java.util.*;
class TablePressKey{
	public static void main(String arg[]){
		Scanner as=new Scanner(System.in);
		
		System.out.print("Enter any Table: ");
		int table=as.nextInt();
		System.out.print("Enter Counter Number: ");
		int num=as.nextInt();
		as.nextLine();
		
		int c=0;
		
		for(int a=1; a<=num; a++){
			int b=table*a;
			 c++;
			System.out.println(table+"x"+a+"="+b);
			
			if(c==20){
			System.out.println("press Enter key then program continue");
				as.nextLine();
			c=0;
			}
		}
	}
    

}