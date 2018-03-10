package raptor.view;

import raptor.controller.Controller;

import javax.swing.JFrame;

public class Frame extends JFrame
{
	private Controller appController;
	private Panel appPanel;
	
	public Frame(Controller appController)
	{
		super();
		this.appController = appController;
		appPanel = new Panel(appController);
		
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(appPanel);
		this.setTitle("Raptor Randomizer");
		this.setResizable(false);
		this.setSize(650, 425);
		this.setVisible(true);	
	}
	
	public Controller getAppController()
	{
		return appController;
	}
}
