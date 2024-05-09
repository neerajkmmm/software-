import java.util.*;
class NamePrint{
    public static void main(String arg[]){
	 Scanner as=new Scanner(System.in);
	
	 System.out.print("Enter Your Name: ");
	 String name=as.next();
	 
	 int len=name.length()-1;
	 
	 String b="";
	 
	    for(int a=0; a<=len; a++){
			
		 char value=name.charAt(a);
		 b+=value+"";
		
		 System.out.println(b);
	    }
	}
}	