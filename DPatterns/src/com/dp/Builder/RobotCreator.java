package com.dp.Builder;

public class RobotCreator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RobotBuilder oldRobotBuilder = new OldRobotBuilder();
		RobotEngineer robotEngineer = new RobotEngineer(oldRobotBuilder);
		
		robotEngineer.makeRobot();
		
		Robot createdRobot = robotEngineer.getRobot();
		
		System.out.println("Robot Head" + createdRobot.getRobotHead());
		
		System.out.println("Robot Arms" + createdRobot.getRobotArms());
		
		System.out.println("Robot Legs" + createdRobot.getRobotLegs());
		
		System.out.println("Robot Body" + createdRobot.getRobotBody());
	}

}
