package _01_else_if._5_own_adventure;

import javax.swing.JOptionPane;

public class ownadventure {
public static void main(String[] args) {
	
	String question1 = JOptionPane.showInputDialog("Once upon a time, there was a woman having a baby. "
			+ "She didn't know whether her baby should be named Rachel or Zachary. "
			+ "Which do you choose? Answer without any spaces.");
	if (question1.equalsIgnoreCase("Zachary")) {
		String question2 = JOptionPane.showInputDialog("The woman has her baby named zachary. "
				+ "He grows up to become a knight in the palace. "
				+ "The king wants to send him on a dangerous journey to kill a dragon."
				+ " Should the woman agree? Answer with yes or no.");
		if (question2.equalsIgnoreCase("yes")) {
				String question2in = JOptionPane.showInputDialog("He goes to kill the dragon. He doesn't know"
						+ " whether he should sneak attack or confront face to face. If he confonts face to face, type 1."
						+ " if he sneak attacks, type 2.");
				if (question2in.equalsIgnoreCase("1")) {
					JOptionPane.showMessageDialog(null, "The dragon blows fire at him and he burns. BAD ENDING!!!");
				}else if (question2in.equalsIgnoreCase("2")) {
					String question2out =JOptionPane.showInputDialog("He sneak attacks and gets a few hits in. "
							+ "The dragon is weakened and is moaning on the floor. should he finish him off or spare him."
							+ "type 1 for killing him and 2 for sparing him.");
					if (question2out.equalsIgnoreCase("1")) {
						JOptionPane.showMessageDialog(null, "The dragon dies. The knight returns home and "
								+ "lives happily ever after in the castle with his mother."
								+ "GOOD ENDING!!!");
				} else if (question2out.equalsIgnoreCase("2")) {
				JOptionPane.showMessageDialog(null, "The knight returns home and is deemed unworthy of a knight position."
						+ "He is hanged until he dies in front of his mother. BAD ENDING!!!");
				}
				}
				if (question2.equalsIgnoreCase("no")) {
					JOptionPane.showMessageDialog(null, "The knight never does anythihng in his life important and the king regrets giving"
							+ " him his position. BAD ENDING!!!");
				}
				///////////////////////////////////////////////////////////////////////////// RACHEL RACHEL RACHEL
	}
} else if (question1.equalsIgnoreCase("rachel")) {
		String question3 = JOptionPane.showInputDialog("The woman has her baby named rachel. "
				+ "She grows up to become a cook in the palace. "
				+ "The king wants to send her to another kingdom to share her cooking skills."
				+ " Should the woman agree? Answer with yes or no.");	
if (question3.equalsIgnoreCase("yes")) {
	JOptionPane.showInputDialog("The woman agrees but the girl dies because of robbers/bandits. BAD ENDING!!!");
} else if (question3.equalsIgnoreCase("no")) {
	JOptionPane.showMessageDialog(null, "The girl does not go. She lives the rest of her life making food for the king and queen. "
			+ "However, she marries their son and obtains a higher position. she lives the rest of her life in comfort. GOOD ENDING!!!");
}
	}
	}
}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

