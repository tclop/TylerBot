package robot.controller;

import lejos.nxt.Button;
import robot.model.TylerBot;
public class TylerBotController 
{

	
	private class TylerBot myBot;
	
	public TylerBotController()
	{
		myBot = newTylerBot();
		
	}
	public void start()
	{
		
		while(Button.waitForAnyPress()!= Button.ID_ESCAPE)
		{
			myBot.drawShape(1,1);
		}
	}
}
