import java.util.*;
class UnknownSeries2{
    public static void main(String arg[]){
	 Scanner as=new Scanner(System.in);
	
	 System.out.print("Enter Any Number: ");
	 int num=as.nextInt();
	 
	 int add=2, value=0;
	 
	    for(int a=1; a<=num; a++){
			value+=add*a;
		 System.out.println(value--);
	    }
	 
	}
}