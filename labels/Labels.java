import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.border.Border;
import javax.swing.BorderFactory;
import java.awt.*;
public class Labels{
	
	public static void main(String[]args){
		
			JFrame frame =new JFrame();
	ImageIcon image =new ImageIcon("ajy.jpg");
	
     Border border =BorderFactory.createLineBorder(Color.green,4);
  // create an JLabel
  JLabel label =new JLabel();
  //create an text method
  label.setText("You are Ajay Krishna");
  label.setIcon(image);
  frame.add(label);
  label.setHorizontalTextPosition(JLabel.CENTER);
  label.setVerticalTextPosition(JLabel.TOP);
  label.setForeground(Color.blue);
  label.setFont(new Font("MV Boli",Font.PLAIN,20));
  label.setIconTextGap(-5);
  label.setBackground(Color.black);
  label.setOpaque(true);
  label.setBorder(border);
  label.setVerticalAlignment(JLabel.CENTER);
  
		
		
		
		//create an Jframe
	
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setSize(500,500);
	frame.setVisible(true);
    //create an imageIcon
	

  
	
	}

}