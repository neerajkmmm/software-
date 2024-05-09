import java.awt.*;
import javax.swing.*;
class NumberAwt{
    public static void main(String arg[]){
	
	 TextArea area=new TextArea();
	 
	    for(int a=1; a<=500; a++){
		 area.append(a+"\n");
	    }
	
	 JOptionPane.showMessageDialog(null,area);
	}
}