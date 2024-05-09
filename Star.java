import java.util.*;
class Star{
    public static void main(String arg[]){
	 Scanner as=new Scanner(System.in);
	
	 System.out.print("Enter any Number: ");
	 int num=as.nextInt();
	 
	 String star="";
	 
	    for(int a=1; a<=num; a++){
		star+="*";
		 System.out.println(star);
	    }
	}
}