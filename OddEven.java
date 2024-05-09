import java.util.*;
class OddEven{
 public static void main(String agr[]){
  Scanner as=new Scanner (System.in);
  
  System.out.print ("Enter Any Number: ");
   int num= as.nextInt();
   System.out.print("Even\t"+"Odd\n");
   
   for(int a=0; a<=num; a+=2){
	   System.out.println(a+"\t"+(++a));a--;
   }
 }
}