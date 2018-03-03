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
	private JLabel championPicLabel;
	private JLabel summonerSpell1;
	private JLabel summonerSpell2;
	
	private JButton randomizeButton;
	
	public Panel(Controller appController)
	{
		super();
		this.appController = appController;
		appLayout = new SpringLayout();
		
		nameLabel = new JLabel("Name");
		titleLabel = new JLabel("Title");
		championPicLabel = new JLabel("Picture");
		summonerSpell1 = new JLabel("Spell 1");
		summonerSpell2 = new JLabel("Spell 2");
		randomizeButton = new JButton("Randomize");
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.setBackground(new Color(220, 20, 60));
		this.setLayout(appLayout);
		this.add(randomizeButton);
		this.add(nameLabel);
		this.add(titleLabel);
		this.add(championPicLabel);
		this.add(summonerSpell1);
		this.add(summonerSpell2);
	}
	
	private void setupLayout()
	{
		appLayout.putConstraint(SpringLayout.EAST, championPicLabel, -440, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.NORTH, championPicLabel, 10, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.WEST, championPicLabel, 10, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.SOUTH, championPicLabel, -10, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.SOUTH, randomizeButton, -30, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.EAST, randomizeButton, -156, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.WEST, nameLabel, 0, SpringLayout.WEST, randomizeButton);
		appLayout.putConstraint(SpringLayout.WEST, titleLabel, 0, SpringLayout.WEST, randomizeButton);
		appLayout.putConstraint(SpringLayout.SOUTH, titleLabel, -6, SpringLayout.NORTH, randomizeButton);
		appLayout.putConstraint(SpringLayout.SOUTH, nameLabel, -6, SpringLayout.NORTH, titleLabel);
		appLayout.putConstraint(SpringLayout.NORTH, summonerSpell2, 0, SpringLayout.NORTH, championPicLabel);
		appLayout.putConstraint(SpringLayout.WEST, summonerSpell2, 6, SpringLayout.EAST, summonerSpell1);
		appLayout.putConstraint(SpringLayout.SOUTH, summonerSpell2, -326, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.EAST, summonerSpell2, -86, SpringLayout.EAST, nameLabel);
		appLayout.putConstraint(SpringLayout.NORTH, summonerSpell1, 0, SpringLayout.NORTH, championPicLabel);
		appLayout.putConstraint(SpringLayout.WEST, summonerSpell1, 6, SpringLayout.EAST, championPicLabel);
		appLayout.putConstraint(SpringLayout.SOUTH, summonerSpell1, -326, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.EAST, summonerSpell1, -156, SpringLayout.EAST, nameLabel);
	}
	
	private void updateInfo(Champion currentChampion)
	{
		nameLabel.setText(currentChampion.getName());
		titleLabel.setText(currentChampion.getTitle());
		
		championPicLabel.setIcon(new ImageIcon(Panel.class.getResource("/raptor/view/images/" + currentChampion.getName() 
								 + "Picture.jpg")));
		
	}
	
	private Champion randomizeChampion()
	{
		Random randomNum = new Random();
		
		int selectedChampionIndex;
		
		Champion selectedChampion;
		
		selectedChampionIndex = randomNum.nextInt(appController.getChampionList().size());
		selectedChampion = appController.getChampionList().get(selectedChampionIndex);
		
		return selectedChampion;
	}
	
	private void randomizeSummonerSpells()
	{
		
	}
	
	private void setupListeners()
	{
		randomizeButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				updateInfo(randomizeChampion());
			}
		});
	}
}
