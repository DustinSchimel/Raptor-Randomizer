package raptor.view;

import raptor.controller.Controller;
import raptor.model.Champion;

import javax.swing.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Panel extends JPanel
{
	private Controller appController;
	private SpringLayout appLayout;
	
	private JLabel nameLabel;
	private JLabel titleLabel;
	
	private JButton randomizeButton;
	
	public Panel(Controller appController)
	{
		super();
		this.appController = appController;
		appLayout = new SpringLayout();
		
		nameLabel = new JLabel("Name");
		titleLabel = new JLabel("Title");
		randomizeButton = new JButton("Randomize");
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.setLayout(appLayout);
		this.add(randomizeButton);
		this.add(nameLabel);
		this.add(titleLabel);
	}
	
	private void setupLayout()
	{
		appLayout.putConstraint(SpringLayout.WEST, nameLabel, 198, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.SOUTH, nameLabel, -247, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.NORTH, titleLabel, 6, SpringLayout.SOUTH, nameLabel);
		appLayout.putConstraint(SpringLayout.WEST, titleLabel, 0, SpringLayout.WEST, nameLabel);
		appLayout.putConstraint(SpringLayout.WEST, randomizeButton, 10, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.SOUTH, randomizeButton, -10, SpringLayout.SOUTH, this);
	}
	
	private void updateInfo(Champion currentChampion)
	{
		nameLabel.setText(currentChampion.getName());
		titleLabel.setText(currentChampion.getTitle());
	}
	
	private void setupListeners()
	{
		randomizeButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				Random randomNum = new Random();
				
				int selectedChampionIndex;
				
				Champion selectedChampion;
				
				selectedChampionIndex = randomNum.nextInt(appController.getChampionList().size());
				selectedChampion = appController.getChampionList().get(selectedChampionIndex);
				
				updateInfo(selectedChampion);
				
			}
		});
	}

}
