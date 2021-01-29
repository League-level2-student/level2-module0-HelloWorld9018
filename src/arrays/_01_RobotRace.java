package arrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
	
	Robot [] robs = new Robot[5];
	int currentFurthest = 500;
	
	public static void main(String[] args) {
		
		//2. create an array of 5 robots.
		
	//3. use a for loop to initialize the robots.
		_01_RobotRace race = new _01_RobotRace();
		
		race.initializeRobots();
		
		//4. make each robot start at the bottom of the screen, side by side, facing up
		
		race.setRobotlocation();
		
	//5. use another for loop to iterate through the array and make each robot move 
	//   a random amount less than 50.
		
		race.moveRobot();
		
			//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.
		
		
		
		while(race.currentFurthest > 10) {
			race.moveRobot();
		}
		
		
		
	//7. declare that robot the winner and throw it a party!
		//race.checkWinner();
		System.out.println("The winner is player " + race.checkWinner());
		JOptionPane.showMessageDialog(null, "The winner is player " + race.checkWinner());
	//8. try different races with different amounts of robots.

	//9. make the robots race around a circular track.
		
	}
	
	
	void initializeRobots() {
		
		for(int i = 0; i<robs.length; i++) {
			Robot robot = new Robot();
			robs[i] = robot;
		}
		
	}
	
	
	void setRobotlocation() {
		robs[0].moveTo(150, 500);
		robs[1].moveTo(300, 500);
		robs[2].moveTo(450, 500);
		robs[3].moveTo(600, 500);
		robs[4].moveTo(750, 500);
	}
	
	void moveRobot () {
		
		
		for(int i = 0; i<robs.length; i++) {
			Random ran = new Random();
			int distance = ran.nextInt(20);
			robs[i].setSpeed(50);
			robs[i].move(distance);
			
			
			if(robs[i].getY() < currentFurthest) {
				currentFurthest = robs[i].getY();
			}
		}

	}
	
	
	String checkWinner() {
		String winer = "0";
		
		for (int i = 0; i<robs.length; i++) {
		//winer = robs [0];
			if(robs[i].getY() == currentFurthest) {
				robs[i].sparkle();
				int playerNum = i + 1;
				winer = "" + playerNum;
			}
		
	}
	 return winer;
	}
	
}
