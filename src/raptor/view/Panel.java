package raptor.view;

import raptor.controller.Controller;
import raptor.model.Champion;

import javax.swing.*;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
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
		
		nameLabel = new JLabel("Name", SwingConstants.CENTER);
		nameLabel.setFont(new Font("Serif", Font.PLAIN, 20));
		titleLabel = new JLabel("Title", SwingConstants.CENTER);
		titleLabel.setFont(new Font("Serif", Font.PLAIN, 20));
		championPicLabel = new JLabel("");
		championPicLabel.setPreferredSize(new Dimension(200, 380));
		summonerSpell1 = new JLabel("");
		summonerSpell1.setPreferredSize(new Dimension(64, 64));
		summonerSpell2 = new JLabel("");
		summonerSpell2.setPreferredSize(new Dimension(64, 64));
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
		appLayout.putConstraint(SpringLayout.WEST, randomizeButton, 0, SpringLayout.WEST, nameLabel);
		appLayout.putConstraint(SpringLayout.SOUTH, randomizeButton, 0, SpringLayout.SOUTH, championPicLabel);
		appLayout.putConstraint(SpringLayout.EAST, randomizeButton, 0, SpringLayout.EAST, nameLabel);
		appLayout.putConstraint(SpringLayout.NORTH, summonerSpell2, 6, SpringLayout.SOUTH, titleLabel);
		appLayout.putConstraint(SpringLayout.SOUTH, summonerSpell2, 0, SpringLayout.SOUTH, summonerSpell1);
		appLayout.putConstraint(SpringLayout.WEST, summonerSpell2, 0, SpringLayout.WEST, titleLabel);
		appLayout.putConstraint(SpringLayout.EAST, summonerSpell2, -282, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.NORTH, summonerSpell1, 71, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.WEST, summonerSpell1, 8, SpringLayout.EAST, championPicLabel);
		appLayout.putConstraint(SpringLayout.SOUTH, summonerSpell1, -219, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.EAST, summonerSpell1, -359, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.WEST, nameLabel, 161, SpringLayout.EAST, championPicLabel);
		appLayout.putConstraint(SpringLayout.WEST, titleLabel, 83, SpringLayout.EAST, championPicLabel);
		appLayout.putConstraint(SpringLayout.EAST, titleLabel, 339, SpringLayout.EAST, championPicLabel);
		appLayout.putConstraint(SpringLayout.NORTH, nameLabel, 0, SpringLayout.NORTH, championPicLabel);
		appLayout.putConstraint(SpringLayout.NORTH, titleLabel, 1, SpringLayout.SOUTH, nameLabel);
		appLayout.putConstraint(SpringLayout.EAST, nameLabel, -179, SpringLayout.EAST, this);
	}
	
	private void updateInfo(Champion currentChampion, ArrayList<String> summonerSpells)
	{
		nameLabel.setText(currentChampion.getName());
		titleLabel.setText(currentChampion.getTitle());
		
		championPicLabel.setIcon(new ImageIcon(Panel.class.getResource("/raptor/view/images/" + currentChampion.getName() 
								 + "Picture.jpg")));
		
		summonerSpell1.setIcon(new ImageIcon(Panel.class.getResource("/raptor/view/images/" + summonerSpells.get(0) + "Picture.png")));
		summonerSpell2.setIcon(new ImageIcon(Panel.class.getResource("/raptor/view/images/" + summonerSpells.get(1) + "Picture.png")));
		
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
	
	private ArrayList<String> randomizeSummonerSpells()
	{
		ArrayList<String> currentSummonerSpellList = new ArrayList<String>();
		
		Random randomNum = new Random();
		
		currentSummonerSpellList.add(appController.getSummonerSpellList().get(randomNum.nextInt(appController.getSummonerSpellList().size())));
		
		currentSummonerSpellList.add(currentSummonerSpellList.get(0));
		
		//while (currentSummonerSpellList.get(0) == currentSummonerSpellList.get(1))
		//{
			//currentSummonerSpellList(1) = appController.getSummonerSpellList().get(randomNum.nextInt(appController.getSummonerSpellList().size()));
		//}
		
		return currentSummonerSpellList;
	}
	
	private void setupListeners()
	{
		randomizeButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				updateInfo(randomizeChampion(), randomizeSummonerSpells());
			}
		});
	}
}
