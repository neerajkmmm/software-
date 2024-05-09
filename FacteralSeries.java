import java.util.*;
class FacteralSeries{
    public static void main(String arg[]){
	 Scanner as=new Scanner(System.in);
	
	 System.out.print("Enter Any Number: ");
	 int num=as.nextInt();
	
	    int value=1;
	
	    for(int a=1; a<=num; a++){
	     value=value*a;
		 System.out.println(value);
	    }
	}
}