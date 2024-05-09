import java.util.*;
class PrimNumber{
    public static void main(String arg[]){
	 Scanner as=new Scanner(System.in);
	
	 System.out.print("Enter Any Number: ");
	 int num=as.nextInt();
	 
	 int counter=0;
	 
	    for(int i=2; i<num; i++){
		 // int result =i%num ;
		 if(num%i == 0)
			counter++;
	    }
		 if(counter==0)
			System.out.println("prim Number is ");
		 else
			System.out.println("Not Prim Number");
	}
}	