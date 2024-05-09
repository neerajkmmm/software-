import java.util.*;
class NumberConversion{
    public static void main(String arg[]){
	   Scanner as=new Scanner(System.in);
	   System.out.print("Enter Decimal Number:");
	   int num=as.nextInt();
	   String str="";
	 
        for(int a=1; a<=num; a++){
		 
		  int b=a%2;
		  int d=b%2;
          str +=d+"";		
	    }
        System.out.println(str);	 
    }
}