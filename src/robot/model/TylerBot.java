package robot.model;

import lejos.nxt.*;

public class TylerBot 
{
	
	private UltrasonicSensor mySonar;
	private TouchSensor frontTouch;
	private SoundSensor backTouch;
	private SoundSensor microphone;
	
	public TylerBot()
	{
		mySonar = new UltrasonicSensor(SensorPort.S1);
		frontTouch = new TouchSensor(SensorPort.S2);
		backTouch = new SoundSensor(SensorPort.S3);
		microphone = new SoundSensor(SensorPort.S4);
		
	}
	
	public void danceRobotDance()
	{
		microphone.readValue();
	}
	
	public void hasHaphephobia()
	{
		
	}
	
	public void driveAroundRoom()
	{
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
