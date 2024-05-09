import java.util.*;
class NumberPrint{
    public static void main(String arg[]){
	 Scanner as=new Scanner(System.in);
	
	 System.out.print("Enter any Number: ");
	 int num=as.nextInt();
	 
	 String value="";
	 
	    for(int a=1; a<=num; a++){
		value+=a+"";
		 System.out.println(value);
	    }
	}
}