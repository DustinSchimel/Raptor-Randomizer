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
	private JLabel runes1Path;
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
		appLayout.putConstraint(SpringLayout.NORTH, nameLabel, 10, SpringLayout.NORTH, this);
		nameLabel.setFont(new Font("Serif", Font.PLAIN, 20));
		
		titleLabel = new JLabel("Title", SwingConstants.CENTER);
		appLayout.putConstraint(SpringLayout.WEST, titleLabel, 216, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.EAST, titleLabel, -10, SpringLayout.EAST, this);
		titleLabel.setFont(new Font("Serif", Font.PLAIN, 20));
		
		championPicLabel = new JLabel("");
		appLayout.putConstraint(SpringLayout.NORTH, championPicLabel, 0, SpringLayout.NORTH, nameLabel);
		championPicLabel.setPreferredSize(new Dimension(200, 380));
		
		summonerSpell1 = new JLabel("");
		appLayout.putConstraint(SpringLayout.NORTH, summonerSpell1, 6, SpringLayout.SOUTH, titleLabel);
		appLayout.putConstraint(SpringLayout.WEST, summonerSpell1, 216, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.SOUTH, summonerSpell1, -233, SpringLayout.SOUTH, this);
		summonerSpell1.setPreferredSize(new Dimension(64, 64));
		
		summonerSpell2 = new JLabel("");
		appLayout.putConstraint(SpringLayout.WEST, summonerSpell2, 292, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.EAST, summonerSpell2, -285, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.EAST, summonerSpell1, -3, SpringLayout.WEST, summonerSpell2);
		appLayout.putConstraint(SpringLayout.NORTH, summonerSpell2, 6, SpringLayout.SOUTH, titleLabel);
		appLayout.putConstraint(SpringLayout.SOUTH, summonerSpell2, 0, SpringLayout.SOUTH, summonerSpell1);
		summonerSpell2.setPreferredSize(new Dimension(64, 64));
		
		runes1Keystone = new JLabel("");
		appLayout.putConstraint(SpringLayout.NORTH, runes1Keystone, 127, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.EAST, runes1Keystone, -80, SpringLayout.EAST, this);
		runes1Keystone.setPreferredSize(new Dimension(64, 64));
		runes1Keystone.setIcon(new ImageIcon(Panel.class.getResource("/raptor/view/images/PressTheAttackPicture.png")));
		
		runes1Slot1 = new JLabel("");
		appLayout.putConstraint(SpringLayout.NORTH, runes1Slot1, 6, SpringLayout.SOUTH, runes1Keystone);
		appLayout.putConstraint(SpringLayout.WEST, runes1Slot1, 0, SpringLayout.WEST, runes1Keystone);
		runes1Slot1.setPreferredSize(new Dimension(64, 64));
		runes1Slot1.setIcon(new ImageIcon(Panel.class.getResource("/raptor/view/images/PressTheAttackPicture.png")));
		
		runes1Slot2 = new JLabel("");
		appLayout.putConstraint(SpringLayout.NORTH, runes1Slot2, 6, SpringLayout.SOUTH, runes1Slot1);
		appLayout.putConstraint(SpringLayout.WEST, runes1Slot2, 0, SpringLayout.WEST, runes1Keystone);
		runes1Slot2.setPreferredSize(new Dimension(64, 64));
		runes1Slot2.setIcon(new ImageIcon(Panel.class.getResource("/raptor/view/images/PressTheAttackPicture.png")));
		
		runes1Slot3 = new JLabel("");
		appLayout.putConstraint(SpringLayout.NORTH, runes1Slot3, 6, SpringLayout.SOUTH, titleLabel);
		appLayout.putConstraint(SpringLayout.WEST, runes1Slot3, 0, SpringLayout.WEST, runes1Keystone);
		runes1Slot3.setPreferredSize(new Dimension(64, 64));
		runes1Slot3.setIcon(new ImageIcon(Panel.class.getResource("/raptor/view/images/PressTheAttackPicture.png")));
		
		runes2Slot1 = new JLabel("");
		appLayout.putConstraint(SpringLayout.WEST, runes2Slot1, 6, SpringLayout.EAST, runes1Slot1);
		appLayout.putConstraint(SpringLayout.SOUTH, runes2Slot1, 0, SpringLayout.SOUTH, runes1Slot1);
		runes2Slot1.setPreferredSize(new Dimension(64, 64));
		runes2Slot1.setIcon(new ImageIcon(Panel.class.getResource("/raptor/view/images/ElectrocutePicture.png")));
		
		runes2Slot2 = new JLabel("");
		appLayout.putConstraint(SpringLayout.NORTH, runes2Slot2, 117, SpringLayout.NORTH, nameLabel);
		appLayout.putConstraint(SpringLayout.SOUTH, runes2Slot2, 0, SpringLayout.SOUTH, runes1Keystone);
		appLayout.putConstraint(SpringLayout.EAST, runes2Slot2, 0, SpringLayout.EAST, nameLabel);
		runes2Slot2.setPreferredSize(new Dimension(64, 64));
		runes2Slot2.setIcon(new ImageIcon(Panel.class.getResource("/raptor/view/images/ElectrocutePicture.png")));
		
		randomizeButton = new JButton("Randomize");
		appLayout.putConstraint(SpringLayout.WEST, randomizeButton, 371, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.SOUTH, randomizeButton, -10, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.EAST, randomizeButton, -179, SpringLayout.EAST, this);
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
		this.add(runes1Keystone); 	//Testing
		this.add(runes1Slot1); 		//Testing
		this.add(runes1Slot2); 		//Testing
		this.add(runes1Slot3); 		//Testing
		this.add(runes2Slot1);	    //Testing
		this.add(runes2Slot2);		//Testing
	}
	
	private void setupLayout()
	{
		appLayout.putConstraint(SpringLayout.EAST, championPicLabel, -440, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.WEST, championPicLabel, 10, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.SOUTH, championPicLabel, -10, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.NORTH, titleLabel, 1, SpringLayout.SOUTH, nameLabel);
		appLayout.putConstraint(SpringLayout.WEST, nameLabel, 0, SpringLayout.WEST, titleLabel);
		appLayout.putConstraint(SpringLayout.EAST, nameLabel, 0, SpringLayout.EAST, titleLabel);
		appLayout.putConstraint(SpringLayout.NORTH, titleLabel, 1, SpringLayout.SOUTH, nameLabel);
		appLayout.putConstraint(SpringLayout.WEST, nameLabel, 0, SpringLayout.WEST, titleLabel);
		appLayout.putConstraint(SpringLayout.EAST, nameLabel, 0, SpringLayout.EAST, titleLabel);
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
		
		runes1Path.setIcon(new ImageIcon(Panel.class.getResource("/raptor/view/images/" 
				   			   + randomizeRunes().get(0) + "Picture.png")));
		
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
	
	private ArrayList<String> randomizeRunes()
	{
		ArrayList<String> allRunes = new ArrayList<String>();
		Random randomNum = new Random();
		
		int runesPath = randomNum.nextInt(5);	//Need to update as more paths are added
		
		switch (runesPath)
		{
        case 0:  allRunes.add("Precision");
                 break;
        case 1:  allRunes.add("Domination");
                 break;
        case 2:  allRunes.add("Sorcery");
                 break;
        case 3:  allRunes.add("Resolve");
                 break;
        case 4:  allRunes.add("Inspiration");
                 break;
        default: allRunes.add("InvalidPath");
        			 break;
		}
		
		return allRunes;
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
