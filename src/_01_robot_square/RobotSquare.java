package _01_robot_square;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 */

import org.jointheleague.graphical.robot.Robot;

// This recipe draws a square using the Robot

public class RobotSquare {
    public static void main(String[] args) throws Exception {
 
    	// 1. Make a new Robot
    	Robot E= new Robot();

        // 3. Put the robot's pen down


        // 5. Do everything below here 4 times
for (int i = 0; i < 4; i++) {

        //         2. Move your robot 200 pixels
E.move(200);

        //         4. Turn the robot 90 degrees to the right (90 degrees)
E.turn(90);

    }
}
}