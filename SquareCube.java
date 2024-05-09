import java.util.*;
class SquareCube{
 public static void main(String agr[]){
  Scanner as=new Scanner (System.in);
  
  System.out.print ("Enter Any Number: ");
   int num= as.nextInt();
    System.out.println("Number+"+"Square+"+"Cube");
	
	for(int a=1; a<=num; a++){
		
	 int b=a*a;
	 int c=b*a;
	
	 System.out.println(a+"\t"+b+"\t"+c);
    }
  }
}