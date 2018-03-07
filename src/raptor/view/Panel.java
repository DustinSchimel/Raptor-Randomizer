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
	private JLabel runes1Keystone;
	private JLabel runes1Slot1;
	private JLabel runes1Slot2;
	private JLabel runes1Slot3;
	private JLabel runes2Slot1;
	private JLabel runes2Slot2;
	
	
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
		
		runes1Keystone = new JLabel("");
		
		runes1Slot1 = new JLabel("");
		
		runes1Slot2 = new JLabel("");
		
		runes1Slot3 = new JLabel("");
		
		runes2Slot1 = new JLabel("");
		
		runes2Slot2 = new JLabel("");
		
		randomizeButton = new JButton("Randomize");
		randomizeButton.setFont(new Font("Serif", Font.PLAIN, 15));
		randomizeButton.setFocusPainted(false);
		
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
		appLayout.putConstraint(SpringLayout.SOUTH, randomizeButton, 0, SpringLayout.SOUTH, championPicLabel);
		appLayout.putConstraint(SpringLayout.WEST, summonerSpell1, 8, SpringLayout.EAST, championPicLabel);
		appLayout.putConstraint(SpringLayout.SOUTH, summonerSpell1, -219, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.EAST, summonerSpell1, -359, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.NORTH, nameLabel, 0, SpringLayout.NORTH, championPicLabel);
		appLayout.putConstraint(SpringLayout.NORTH, titleLabel, 1, SpringLayout.SOUTH, nameLabel);
		appLayout.putConstraint(SpringLayout.WEST, nameLabel, 0, SpringLayout.WEST, titleLabel);
		appLayout.putConstraint(SpringLayout.EAST, nameLabel, 0, SpringLayout.EAST, titleLabel);
		appLayout.putConstraint(SpringLayout.WEST, randomizeButton, 161, SpringLayout.EAST, championPicLabel);
		appLayout.putConstraint(SpringLayout.EAST, randomizeButton, -179, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.NORTH, summonerSpell2, 20, SpringLayout.SOUTH, titleLabel);
		appLayout.putConstraint(SpringLayout.WEST, summonerSpell2, 2, SpringLayout.EAST, summonerSpell1);
		appLayout.putConstraint(SpringLayout.SOUTH, summonerSpell2, -219, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.EAST, summonerSpell2, -284, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.WEST, titleLabel, 6, SpringLayout.EAST, championPicLabel);
		appLayout.putConstraint(SpringLayout.EAST, titleLabel, 430, SpringLayout.EAST, championPicLabel);
		appLayout.putConstraint(SpringLayout.NORTH, titleLabel, 1, SpringLayout.SOUTH, nameLabel);
		appLayout.putConstraint(SpringLayout.WEST, nameLabel, 0, SpringLayout.WEST, titleLabel);
		appLayout.putConstraint(SpringLayout.EAST, nameLabel, 0, SpringLayout.EAST, titleLabel);
		appLayout.putConstraint(SpringLayout.NORTH, summonerSpell1, 20, SpringLayout.SOUTH, titleLabel);
	}
	
	private void updateInfo(Champion currentChampion, ArrayList<String> summonerSpells)
	{
		nameLabel.setText(currentChampion.getName());
		titleLabel.setText(currentChampion.getTitle());
		
		championPicLabel.setIcon(new ImageIcon(Panel.class.getResource("/raptor/view/images/" + currentChampion.getNameForFile() 
								 + "Picture.jpg")));
		
		summonerSpell1.setIcon(new ImageIcon(Panel.class.getResource("/raptor/view/images/" + summonerSpells.get(0) 
							   + "Picture.png")));
		
		summonerSpell2.setIcon(new ImageIcon(Panel.class.getResource("/raptor/view/images/" 
							   + summonerSpells.get(summonerSpells.size() - 1) + "Picture.png")));
		
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
		int secondSpellindex = 0;
		
		currentSummonerSpellList.add(appController.getSummonerSpellList().get(randomNum.nextInt(appController.getSummonerSpellList().size())));
		
		while (currentSummonerSpellList.get(0).equals(currentSummonerSpellList.get(secondSpellindex)))
		{
			secondSpellindex++;
			currentSummonerSpellList.add(appController.getSummonerSpellList().get(randomNum.nextInt(appController.getSummonerSpellList().size())));
		}
		
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
