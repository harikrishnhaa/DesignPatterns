package com.dp.Builder;

public class OldRobotBuilder implements RobotBuilder {
	
	private Robot robot;
	
	public OldRobotBuilder() {
		// TODO Auto-generated constructor stub
		this.robot = new Robot();
	}

	@Override
	public void buildRobotHead() {
		// TODO Auto-generated method stub
		robot.setRobotHead("Square Head");
	}

	@Override
	public void buildRobotArms() {
		// TODO Auto-generated method stub
		robot.setRobotArms("Flashy Arms");

	}

	@Override
	public void buildRobotLegs() {
		// TODO Auto-generated method stub
		robot.setRobotLegs("Flaunting Legs");

	}

	@Override
	public void buildRobotBody() {
		// TODO Auto-generated method stub
		robot.setRobotBody("Chic body");

	}
	
	public Robot getRobot(){
		return this.robot;
	}

}
