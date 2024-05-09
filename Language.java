import java.awt.*;
import javax.swing.*;
class Language{
    public static void main(String arg[]){
	TextArea area=new TextArea();
	
	    for(char a=65165; a<=65534; a++){
			area.append(a+"\n");
        	
		}
		Font f=new Font("arial",Font.BOLD,25);
		area.setFont(f);
		
		JOptionPane.showMessageDialog(null,area);
	}
}