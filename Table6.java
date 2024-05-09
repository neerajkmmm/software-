import java.util.*;
class Table6{
    public static void main(String arg[]){
	 Scanner as=new Scanner(System.in);
	
	 System.out.print("Enter Table: ");
	 int table=as.nextInt();
	 
	 System.out.print("Enter Counter Number: ");
	 int num=as.nextInt();
	 
	    for(int a=1; a<=num; a++){
		  int b=table*a;
		  System.out.println(table+"x"+a+"="+b);
	    }
	}
}