import java.util.*;
class Even{
    public static void main(String arg[]){
     Scanner as=new Scanner (System.in);
     System.out.print ("Enter Any Number: ");
     int num= as.nextInt();
   
        for(int a=2; a<=num; a+=2){
	     System.out.println(""+a);
        }
    }
}