package com.dp.Builder;

public class Robot implements RobotPlan {
	
	private String robotHead;
	private String robotArms;
	private String robotLegs;
	private String robotBody;

	@Override
	public void setRobotHead(String robotHead) {
		this.robotHead = robotHead;

	}

	@Override
	public void setRobotArms(String robotArms) {
		// TODO Auto-generated method stub
		this.robotArms = robotArms;
	}

	@Override
	public void setRobotLegs(String robotLegs) {
		// TODO Auto-generated method stub
		this.robotLegs = robotLegs;
	}

	@Override
	public void setRobotBody(String robotBody) {
		// TODO Auto-generated method stub
		this.robotBody = robotBody;
	}

	public String getRobotHead() {
		return robotHead;
	}

	public String getRobotArms() {
		return robotArms;
	}

	public String getRobotLegs() {
		return robotLegs;
	}

	public String getRobotBody() {
		return robotBody;
	}

}
