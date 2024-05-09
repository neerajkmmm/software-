import java.util.*;
class Item{
    public static void main (String arg[]){
	 Scanner as=new Scanner(System.in);
	
	 System.out.print("Enter your Item: ");
	 int item=as.nextInt();
	 int totalprice=0;
	 
	    if(item==0){
			System.out.print("Excuit"+item);
		}
	    for(int a=1; a<=item; a++){
			
		 System.out.print("Enter "+ a +" Item price: ");
		 int price=as.nextInt();
		 
		 totalprice+=price;
	    }
		System.out.println("\nTotal Items is: "+item);
		System.out.println("Total price is: " +totalprice);
		
	}

}