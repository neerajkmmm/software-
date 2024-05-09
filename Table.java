import javax.swing.*;
class Table{
     public static void main(String arg[]){
   
     String value=JOptionPane.showInputDialog("Enter Table: ");
    int table= Integer.parseInt(value);
	
	String values=JOptionPane.showInputDialog("Enter Counter Number ");
	int num=Integer.parseInt(values);
	
	String str="";
	for(int a=1; a<=num; a++){
		int b=table*a;
		str+=table+" x "+a+" = "+b+"\n";
	}
	
	JOptionPane.showMessageDialog(null,str);
	
 }
}