import java.util.*;
class ReveresName{
    public static void main(String arg[]){
	 Scanner as=new Scanner(System.in);
	
	 System.out.print("Enter Your Name: ");
	 String name=as.next();
	 
	 int len=name.length()-1;
	 
	 String value="";
	 
	    for(int a=len; a>=0; a--){
			
		 char b=name.charAt(a);
		 value+=b+"";
		}
		 System.out.println(value);
	    
	}
}