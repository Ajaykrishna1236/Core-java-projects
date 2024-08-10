import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.Color;
public class Main{
	
	public static void main(String[]args){
		
		JFrame frame =new JFrame();
		
		// create x-dimension /y-dimension
		frame.setSize(420,420);
		// set the title 
		frame.setTitle("JFrame title goes here");
		// to hide the close button
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//prevent the resizable
		frame.setResizable(false);
		
		// change the icon from the javalogo to mylogo
		ImageIcon image= new ImageIcon("ajy.jpg");//create an imageicon
		frame.setIconImage(image.getImage());
		// change the background color 
		frame.getContentPane().setBackground(new Color(123,50,250));
		
		frame.setVisible(true);
		
	}
	
}
