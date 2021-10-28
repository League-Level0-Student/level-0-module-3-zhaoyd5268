package _01_else_if._4_are_you_happy;

import javax.swing.JOptionPane;

public class areyouhappy {

	
	public static void main(String[] args) {
		
String yesno = JOptionPane.showInputDialog("Are you happy? Yes or no? Answer without spaces please.");
	if (yesno.equalsIgnoreCase("yes")) {
		JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing.");
	} else if (yesno.equalsIgnoreCase("no")) {
	String yesorno = JOptionPane.showInputDialog(null, "Do you want to be happy?");
	if (yesorno.equalsIgnoreCase("yes")) {
			JOptionPane.showMessageDialog(null, "Then change something.");
	} else if (yesorno.equalsIgnoreCase("no")) {
		JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing.");
	}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
}
