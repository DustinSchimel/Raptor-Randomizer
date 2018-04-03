package raptor.view;

import raptor.controller.Controller;

import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
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
		appPanel.setBackground(new Color(20, 23, 63));
		this.setContentPane(appPanel);
		this.setTitle("Raptor Randomizer");
		this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/raptor/view/images/AppIcon_32x32.png")));
		this.setResizable(false);
		this.setSize(650, 429);
		this.setVisible(true);
	}
	
	public Controller getAppController()
	{
		return appController;
	}
}
