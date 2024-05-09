import java.util.*;
class NumberPressKey{
	public static void main(String arg[]){
		Scanner ob=new Scanner(System.in);
		System.out.print("Enter Any Number: ");
		int num=ob.nextInt();
		ob.nextLine();
		
		int b=0;

		for(int j=1; j<=num; j++){
			b++;
			System.out.println(j);
			
            if(b==20){
             System.out.println("Press key Enter Than Program Cotinue.");
			 ob.nextLine();
			 b=0;
            }			 
		}
	}

}