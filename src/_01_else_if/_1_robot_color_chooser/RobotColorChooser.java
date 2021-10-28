
package _01_else_if._1_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.AWTException;
import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) throws AWTException {
		
		//1. Create a new Robot
		Robot rob = new Robot();
	
	//2. Make the robot draw a shape (this will take more than one line of code)		
for (int i=0; i<10; i++) {
		String pencolor = JOptionPane.showInputDialog("what color would you liike my robot to draw with? red, green or blue?");
	if (pencolor.equalsIgnoreCase("red")) {
		rob.setPenColor(Color.RED);
	} else if (pencolor.equalsIgnoreCase("green")) {
rob.setPenColor(Color.GREEN);
} else if (pencolor.equalsIgnoreCase("blue")) {
	rob.setPenColor(Color.BLUE);
} else {
rob.setRandomPenColor();	
}
		//3. Set the pen width to 10
		// done
		//4. Ask the user what color pen they would like the robot to draw with
	// done
		//5. Use an if/else statement to set the pen color that the user requested
        // doing
		//6. If the user doesn't enter anything, choose a random color
        
		//7. Put a loop around your code so that you keep asking the user for more colors & drawing them
	rob.setSpeed(15);
for (i=0; i<4; i++) {
rob.setPenWidth(10);
rob.penDown();
rob.move(200);
rob.turn(90);
} 

}		



	}
}
