import java.util.*;
class DecimalToBinary{
    public static void main(String arg[]){
	 Scanner as=new Scanner(System.in);
	 
	 System.out.print("Enter Any Number: ");
	 int num=as.nextInt();
	 
	    int a=0, c=num;
	    String b="";
		
	    for( ; ; ){
			
	     a=c/2;
	     b+=c%2;
		 c=a;
		 if(c==1 || c==0){
			 b+=c;
			 break;
		 }
        }
		 //System.out.println("Binary: "+b);
		 
		 int size=b.length();
		 String str="";
		 for(int i=size-1; i>=0; i--){
			 str+=b.charAt(i);
		 }
		 System.out.println("Binary: "+str);
	}
}