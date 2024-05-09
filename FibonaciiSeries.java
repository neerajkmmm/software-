import java.util.*;
class FibonaciiSeries{
    public static void main(String arg[]){
	 Scanner as=new Scanner(System.in);
	
	 System.out.print("Enter Any Number: ");
	 int num=as.nextInt();
	 
	 int a=0,  b=1, c;
	 System.out.println(""+a);
	 System.out.println(""+b);
	
	    for(int i=1; i<=num; i++){
		 c=a+b;
		 
		 System.out.println(c);
		  a=b;
		  b=c;
	    }
	 
	}
}	