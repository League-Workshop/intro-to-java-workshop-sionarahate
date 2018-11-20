package section2;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class FourSquare {
	
	// 2. Create a new Robot
Robot bob = new Robot ();
	void go() {
		// 4. Make the robot move as fast as possible

		// 5. Set the pen width to 5
		bob.setRandomPenColor();
		bob.sparkle();
bob.setSpeed(75);
bob.move(100);
bob.setPenWidth(5);
bob.penDown();
bob.move(80);
bob.turn(90);
bob.move(80);
bob.turn(90);
bob.move(80);
bob.turn(90);
bob.move(80);
		// 6. Use a for loop to repeat steps #7 to #8, four times...
for (int i = 0; i < 4; i++) {
	bob.move(80);
	bob.turn(90);
	
	
}
bob.turn(180);
bob.move(80);
for (int i = 0; i <4 ; i++) {
	

bob.turn(90);
bob.move(80);
}
bob.turn(180);
bob.move(80);
bob.move(80);
bob.turn(90);
bob.move(-80);
bob.turn(90);
bob.move(80);
			// 7. Set the pen color to random
	
	
			// 1. Call the drawSquare() method
	drawSquare();
			// 8. Turn the robot 90 degrees to the right

	}

	
	void drawSquare() {
		JOptionPane.showMessageDialog(null, "yay! you called the drawSquare() method!");
		/* 3. Fill in the code to draw a square inside the method below. */
		
		
	}

	public static void main(String[] args) {
		new FourSquare().go();
	}

}



