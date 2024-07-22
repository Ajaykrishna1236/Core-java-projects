import javax.swing.JOptionPane;
public class Main{
	public static void main(String [] args){
		
		String day=JOptionPane.showInputDialog("Enter the day");
		switch(day){
			
			case "sunday":
				JOptionPane.showMessageDialog(null,"today is sunday");
			break;
			
			case "monday":
				JOptionPane.showMessageDialog(null,"today is monday");
			break;
			
			case "Tuesday":
					
					JOptionPane.showMessageDialog(null,"today is Tuesday");
			break;
			
			case "wendsday":
					JOptionPane.showMessageDialog(null,"today is wendsday");
			break;
			
			case "Thusday":
					JOptionPane.showMessageDialog(null,"today is Thusday");
			break;
		    
			default:
					JOptionPane.showMessageDialog(null,"INVALID INPUT");
			break;
			
		}
		
	}
}