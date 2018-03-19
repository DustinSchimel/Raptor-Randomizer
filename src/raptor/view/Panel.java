package raptor.view;

import raptor.controller.Controller;
import raptor.model.Champion;

import javax.swing.*;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
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
	
	private JLabel runesKeystone;
	private JLabel runes1Slot1;
	private JLabel runes1Slot2;
	private JLabel runes1Slot3;
	private JLabel runes2Slot1;
	private JLabel runes2Slot2;
	
	private JLabel item1;
	private JLabel item2;
	private JLabel item3;
	private JLabel item4;
	private JLabel item5;
	private JLabel item6;
	
	private JButton randomizeButton;
	
	public Panel(Controller appController)
	{
		super();
		
		this.appController = appController;
		appLayout = new SpringLayout();
		
		nameLabel = new JLabel("Name", SwingConstants.CENTER);
		nameLabel.setForeground(Color.WHITE);
		nameLabel.setFont(new Font("Serif", Font.PLAIN, 20));
		
		titleLabel = new JLabel("Title", SwingConstants.CENTER);
		titleLabel.setForeground(Color.WHITE);
		titleLabel.setFont(new Font("Serif", Font.PLAIN, 20));
		
		championPicLabel = new JLabel("");
		championPicLabel.setIcon(new ImageIcon(Panel.class.getResource("/raptor/view/images/200x380Box.jpg")));
		championPicLabel.setHorizontalAlignment(JLabel.CENTER);
		
		summonerSpell1 = new JLabel("");
		summonerSpell1.setIcon(new ImageIcon(Panel.class.getResource("/raptor/view/images/64x64Box.png")));
		summonerSpell1.setHorizontalAlignment(JLabel.CENTER);
		
		summonerSpell2 = new JLabel("");
		summonerSpell2.setIcon(new ImageIcon(Panel.class.getResource("/raptor/view/images/64x64Box.png")));
		summonerSpell2.setHorizontalAlignment(JLabel.CENTER);

		
		runesKeystone = new JLabel("");
		runesKeystone.setIcon(new ImageIcon(Panel.class.getResource("/raptor/view/images/64x64Box.png")));
		runesKeystone.setHorizontalAlignment(SwingConstants.CENTER);
		
		runes1Slot1 = new JLabel("");
		runes1Slot1.setIcon(new ImageIcon(Panel.class.getResource("/raptor/view/images/64x64Box.png")));
		runes1Slot1.setHorizontalAlignment(JLabel.CENTER);
		
		runes1Slot2 = new JLabel("");
		runes1Slot2.setIcon(new ImageIcon(Panel.class.getResource("/raptor/view/images/64x64Box.png")));
		runes1Slot2.setHorizontalAlignment(JLabel.CENTER);
		
		runes1Slot3 = new JLabel("");
		runes1Slot3.setIcon(new ImageIcon(Panel.class.getResource("/raptor/view/images/64x64Box.png")));
		runes1Slot3.setHorizontalAlignment(JLabel.CENTER);
		
		runes2Slot1 = new JLabel("");
		runes2Slot1.setIcon(new ImageIcon(Panel.class.getResource("/raptor/view/images/64x64Box.png")));
		runes2Slot1.setHorizontalAlignment(JLabel.CENTER);
		
		runes2Slot2 = new JLabel("");
		runes2Slot2.setIcon(new ImageIcon(Panel.class.getResource("/raptor/view/images/64x64Box.png")));
		runes2Slot2.setHorizontalAlignment(JLabel.CENTER);
		
		
		item1 = new JLabel("");
		item1.setIcon(new ImageIcon(Panel.class.getResource("/raptor/view/images/64x64Box.png")));
		item1.setHorizontalAlignment(JLabel.CENTER);
		
		item2 = new JLabel("");
		item2.setIcon(new ImageIcon(Panel.class.getResource("/raptor/view/images/64x64Box.png")));
		item2.setHorizontalAlignment(JLabel.CENTER);
		
		item3 = new JLabel("");
		item3.setIcon(new ImageIcon(Panel.class.getResource("/raptor/view/images/64x64Box.png")));
		item3.setHorizontalAlignment(JLabel.CENTER);
		
		item4 = new JLabel("");
		item4.setIcon(new ImageIcon(Panel.class.getResource("/raptor/view/images/64x64Box.png")));
		item4.setHorizontalAlignment(JLabel.CENTER);
		
		item5 = new JLabel("");
		item5.setIcon(new ImageIcon(Panel.class.getResource("/raptor/view/images/64x64Box.png")));
		item5.setHorizontalAlignment(JLabel.CENTER);
		
		item6 = new JLabel("");
		item6.setIcon(new ImageIcon(Panel.class.getResource("/raptor/view/images/64x64Box.png")));
		item6.setHorizontalAlignment(JLabel.CENTER);
		
		
		randomizeButton = new JButton("Randomize");
		randomizeButton.setFont(new Font("Serif", Font.PLAIN, 15));
		randomizeButton.setFocusPainted(false);
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.setLayout(appLayout);
		
		this.add(nameLabel);
		this.add(titleLabel);
		this.add(championPicLabel);
		
		this.add(summonerSpell1);
		this.add(summonerSpell2);
		
		this.add(runesKeystone);		//testing
		this.add(runes1Slot1); 			//Testing
		this.add(runes1Slot2); 			//Testing
		this.add(runes1Slot3); 			//Testing
		this.add(runes2Slot1);	      	//Testing
		this.add(runes2Slot2);			//Testing
		
		this.add(item1);					//Testing
		this.add(item2);					//Testing
		this.add(item3);					//Testing
		this.add(item4);					//Testing
		this.add(item5);					//Testing
		this.add(item6);					//Testing
		
		this.add(randomizeButton);
		
	}
	
	private void setupLayout()
	{
		appLayout.putConstraint(SpringLayout.EAST, championPicLabel, -440, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.WEST, championPicLabel, 10, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.SOUTH, nameLabel, -6, SpringLayout.NORTH, titleLabel);
		appLayout.putConstraint(SpringLayout.EAST, nameLabel, 0, SpringLayout.EAST, titleLabel);
		appLayout.putConstraint(SpringLayout.NORTH, titleLabel, 52, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.NORTH, nameLabel, 20, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.WEST, titleLabel, 11, SpringLayout.EAST, championPicLabel);
		appLayout.putConstraint(SpringLayout.WEST, nameLabel, 11, SpringLayout.EAST, championPicLabel);
		appLayout.putConstraint(SpringLayout.NORTH, championPicLabel, 10, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.SOUTH, championPicLabel, -10, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.NORTH, summonerSpell2, 17, SpringLayout.SOUTH, titleLabel);
		appLayout.putConstraint(SpringLayout.WEST, summonerSpell2, 357, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.SOUTH, summonerSpell1, 0, SpringLayout.SOUTH, summonerSpell2);
		appLayout.putConstraint(SpringLayout.EAST, summonerSpell1, -27, SpringLayout.WEST, summonerSpell2);
		appLayout.putConstraint(SpringLayout.EAST, runes1Slot1, -80, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.WEST, runesKeystone, 0, SpringLayout.WEST, runes1Slot1);
		appLayout.putConstraint(SpringLayout.SOUTH, runesKeystone, -6, SpringLayout.NORTH, runes1Slot1);
		appLayout.putConstraint(SpringLayout.WEST, item6, 26, SpringLayout.EAST, item5);
		appLayout.putConstraint(SpringLayout.WEST, item3, 0, SpringLayout.WEST, item6);
		appLayout.putConstraint(SpringLayout.NORTH, item6, 0, SpringLayout.NORTH, item4);
		appLayout.putConstraint(SpringLayout.NORTH, randomizeButton, 27, SpringLayout.SOUTH, item1);
		appLayout.putConstraint(SpringLayout.WEST, randomizeButton, 63, SpringLayout.EAST, championPicLabel);
		appLayout.putConstraint(SpringLayout.SOUTH, randomizeButton, -18, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.EAST, randomizeButton, -239, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.NORTH, item5, 0, SpringLayout.NORTH, item4);
		appLayout.putConstraint(SpringLayout.WEST, item5, 25, SpringLayout.EAST, item4);
		appLayout.putConstraint(SpringLayout.WEST, item4, 11, SpringLayout.EAST, championPicLabel);
		appLayout.putConstraint(SpringLayout.SOUTH, item4, -159, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.NORTH, item1, 24, SpringLayout.SOUTH, item4);
		appLayout.putConstraint(SpringLayout.WEST, runes1Slot3, 42, SpringLayout.EAST, item3);
		appLayout.putConstraint(SpringLayout.WEST, runes1Slot2, 42, SpringLayout.EAST, item3);
		appLayout.putConstraint(SpringLayout.EAST, titleLabel, 0, SpringLayout.EAST, item3);
		appLayout.putConstraint(SpringLayout.NORTH, item3, 0, SpringLayout.NORTH, item1);
		appLayout.putConstraint(SpringLayout.NORTH, item2, 0, SpringLayout.NORTH, item1);
		appLayout.putConstraint(SpringLayout.WEST, item2, 25, SpringLayout.EAST, item1);
		appLayout.putConstraint(SpringLayout.WEST, item1, 11, SpringLayout.EAST, championPicLabel);
		appLayout.putConstraint(SpringLayout.WEST, runes2Slot2, 6, SpringLayout.EAST, runes1Slot2);
		appLayout.putConstraint(SpringLayout.SOUTH, runes2Slot2, 0, SpringLayout.SOUTH, runes1Slot2);
		appLayout.putConstraint(SpringLayout.NORTH, runes1Slot3, 6, SpringLayout.SOUTH, runes1Slot2);
		appLayout.putConstraint(SpringLayout.WEST, runes2Slot1, 6, SpringLayout.EAST, runes1Slot1);
		appLayout.putConstraint(SpringLayout.SOUTH, runes2Slot1, 0, SpringLayout.SOUTH, runes1Slot1);
		appLayout.putConstraint(SpringLayout.SOUTH, runes1Slot1, -6, SpringLayout.NORTH, runes1Slot2);
		appLayout.putConstraint(SpringLayout.SOUTH, runes1Slot2, -104, SpringLayout.SOUTH, this);
	}
	
	private void updateInfo()
	{
		Champion currentChampion = randomizeChampion();
		ArrayList<String> summonerSpells = randomizeSummonerSpells();
		ArrayList<String> runes = randomizeRunes();
		
		nameLabel.setText(currentChampion.getName());
		titleLabel.setText(currentChampion.getTitle());
		
		championPicLabel.setIcon(new ImageIcon(Panel.class.getResource("/raptor/view/images/champions/" + currentChampion.getNameForFile() 
								 + "Picture.jpg")));
		
		summonerSpell1.setIcon(new ImageIcon(Panel.class.getResource("/raptor/view/images/spells/" + summonerSpells.get(0) 
							     + "Picture.png")));
		
		summonerSpell2.setIcon(new ImageIcon(Panel.class.getResource("/raptor/view/images/spells/" 
							     + summonerSpells.get(summonerSpells.size() - 1) + "Picture.png")));
		
		runesKeystone.setIcon(new ImageIcon(Panel.class.getResource("/raptor/view/images/runes/" 
				   			     + runes.get(0) + "Picture.png")));
		
		runes1Slot1.setIcon(new ImageIcon(Panel.class.getResource("/raptor/view/images/runes/"
								 + runes.get(1) + "Picture.png")));	//Change as runes are added
		
		runes1Slot2.setIcon(new ImageIcon(Panel.class.getResource("/raptor/view/images/runes/" 
								 + runes.get(2) + "Picture.png")));	//Change as runes are added
		
		runes1Slot3.setIcon(new ImageIcon(Panel.class.getResource("/raptor/view/images/runes/" 
							 	 + runes.get(3) + "Picture.png")));  //Change as runes are added
		
		runes2Slot1.setIcon(new ImageIcon(Panel.class.getResource("/raptor/view/images/runes/" 
								 + runes.get(4) + "Picture.png")));  //Change as runes are added
		
		//runes2Slot2.setIcon(new ImageIcon(Panel.class.getResource("/raptor/view/images/runes/" 
		//						 + runes.get(5) + "Picture.png")));  //Change as runes are added
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
		
		int runesPathIndex = randomNum.nextInt(5);
		String keystonePath;
		String secondPath;
		
		if(runesPathIndex == 0)
		{
			keystonePath = "Precision";
			secondPath = appController.getSpecificListWithout(keystonePath).get(randomNum.nextInt(4));
		}
		else if(runesPathIndex == 1)
		{
			keystonePath = "Domination";
			secondPath = appController.getSpecificListWithout(keystonePath).get(randomNum.nextInt(4));
		}
		else if(runesPathIndex == 2)
		{
			keystonePath = "Sorcery";
			secondPath = appController.getSpecificListWithout(keystonePath).get(randomNum.nextInt(4));
		}
		else if(runesPathIndex == 3)
		{
			keystonePath = "Resolve";
			secondPath = appController.getSpecificListWithout(keystonePath).get(randomNum.nextInt(4));
		}
		else if(runesPathIndex == 4)
		{
			keystonePath = "Inspiration";
			secondPath = appController.getSpecificListWithout(keystonePath).get(randomNum.nextInt(4));
		}
		else
		{
			keystonePath = "";
			secondPath = "";
		}
		
		
		allRunes.add(appController.getSpecificList(keystonePath)	//Adds the keystone to the list
				.get(randomNum.nextInt(3)));
		
		
		if (keystonePath.equals("Resolve"))
		{
			allRunes.add(appController.getSpecificList(keystonePath)
					.get(randomNum.nextInt(3) + 3));
			
			allRunes.add(appController.getSpecificList(keystonePath)
					.get(randomNum.nextInt(4) + 6));
			
			allRunes.add(appController.getSpecificList(keystonePath)
					.get(randomNum.nextInt(3) + 10));
		}
		else
		{
			for (int index = 0, addition = 3; index < 3; index++, addition = addition + 3)
			{
				allRunes.add(appController.getSpecificList(keystonePath)
						.get(randomNum.nextInt(3) + addition));
			}
		}
		
		int randomRow = randomNum.nextInt(3);
		
		if (secondPath.equals("Resolve"))
		{
			if (randomRow == 0)
			{
				allRunes.add(appController.getSpecificList(secondPath)
						.get(randomNum.nextInt(3) + 3));
			}
			else if (randomRow == 1)
			{
				allRunes.add(appController.getSpecificList(secondPath)
						.get(randomNum.nextInt(3) + 6));
			}
			else if (randomRow == 2)
			{
				allRunes.add(appController.getSpecificList(secondPath)
						.get(randomNum.nextInt(3) + 10));
			}
		}
		else
		{
			if (randomRow == 0)
			{
				allRunes.add(appController.getSpecificList(secondPath)
						.get(randomNum.nextInt(3) + 3));
			}
			else if (randomRow == 1)
			{
				allRunes.add(appController.getSpecificList(secondPath)
						.get(randomNum.nextInt(3) + 6));
			}
			else if (randomRow == 2)
			{
				allRunes.add(appController.getSpecificList(secondPath)
						.get(randomNum.nextInt(3) + 9));
			}
			
		}
		
		return allRunes;
	}
	
	/*
	private ArrayList<String> randomizeRunes()
	{
		ArrayList<String> allRunes = new ArrayList<String>();
		Random randomNum = new Random();
		
		int keystonePath = 0;
		
		boolean choosingRunes = true;
		boolean pickingSlot4and5 = false;
		
		while (choosingRunes == true)
		{
			int runesPath = randomNum.nextInt(5);	//Need to update as more paths are added
			
			if(pickingSlot4and5 == true && runesPath == keystonePath)
			{
				runesPath = randomNum.nextInt(5);
			}
			
			switch (runesPath)			//Picks the main rune path as well as the keystone and minor runes for that path
			{
	        case 0:  
	        	
    		if (pickingSlot4and5 == false)
    		{	
    			allRunes.add("Precision");
    			keystonePath = 0;
    		        
        		ArrayList<String> PrecisionKeystones = new ArrayList<>();
        		PrecisionKeystones.add("PressTheAttack");
        		PrecisionKeystones.add("LethalTempo");
        		PrecisionKeystones.add("FleetFootwork");
        		allRunes.add(PrecisionKeystones.get(randomNum.nextInt(PrecisionKeystones.size())));
        		 
        		int slot1Rune = randomNum.nextInt(3);
        		int slot2Rune = randomNum.nextInt(3);
        		int slot3Rune = randomNum.nextInt(3);
        		 
    			if(slot1Rune == 0)
    			{
    				allRunes.add("Overheal");
    			}
    			else if(slot1Rune == 1)
    			{
    				allRunes.add("Triumph");
    			}
    			else if(slot1Rune == 2)
    			{
    				allRunes.add("PresenceOfMind");
    			}
    		 
    		 	if(slot2Rune == 0)
    		 	{
    		 		allRunes.add("LegendAlacrity");
    		 	}
    		 	else if(slot2Rune == 1)
    		 	{
    		 		allRunes.add("LegendTenacity");
    		 	}
    		 	else if(slot2Rune == 2)
    		 	{
    		 		allRunes.add("LegendBloodline");
    		 	}
    		 
    		 	if(slot3Rune == 0)
    		 	{
    		 		allRunes.add("CoupDeGrace");
    		 	}
    		 	else if(slot3Rune == 1)
    		 	{
    		 		allRunes.add("CutDown");
    		 	}
    		 	else if(slot3Rune == 2)
    		 	{
    		 		allRunes.add("LastStand");
    		 	}
    		 	 
    		 	pickingSlot4and5 = true;
    		 }
    		 
    		 else
    		 {
    			int firstRow = 0;
    			int loop = 0;
    			 
    			for(int index = 0; index < 2; index++)
    			{ 
    				int runeRow = randomNum.nextInt(3);
    				int rune = randomNum.nextInt(3);				 
    				 
    				while (loop == 1 && runeRow == firstRow)
    				{
    					runeRow = randomNum.nextInt(3);
    				}
    				
    				loop++;
    				 
        			if (runeRow == 0)
        			{
        				firstRow = 0;
        				 
        				if(rune == 0)
	        			{
	        				allRunes.add("Overheal");
	        			}
	        			else if(rune == 1)
	        			{
	        				allRunes.add("Triumph");
	        			}
	        			else if(rune == 2)
	        			{
	        				allRunes.add("PresenceOfMind");
	        			}
        			}
        			else if (runeRow == 1)
        			{
        				firstRow = 1;
        				 
        				if(rune == 0)
	        		 	{
	        		 		allRunes.add("LegendAlacrity");
	        		 	}
	        		 	else if(rune == 1)
	        		 	{
	        		 		allRunes.add("LegendTenacity");
	        		 	}
	        		 	else if(rune == 2)
	        		 	{
	        		 		allRunes.add("LegendBloodline");
	        		 	}
        			}
        			else if (runeRow == 2)
        			{
        				firstRow = 2;
        				 
        				if(rune == 0)
	        		 	{
	        		 		allRunes.add("CoupDeGrace");
	        		 	}
	        		 	else if(rune == 1)
	        		 	{
	        		 		allRunes.add("CutDown");
	        		 	}
	        		 	else if(rune == 2)
	        		 	{
	        		 		allRunes.add("LastStand");
	        		 	}
        			}
    			}
    			 
    			choosingRunes = false;
    		}
    		break;
	        		 
	        case 1:  
	        	
       		if (pickingSlot4and5 == false)
       		{
       			allRunes.add("Domination");
   			 	keystonePath = 1;
   		        
        		ArrayList<String> DominationKeystones = new ArrayList<>();
        		DominationKeystones.add("Electrocute");
        		DominationKeystones.add("Predator");
        		DominationKeystones.add("DarkHarvest");
        		allRunes.add(DominationKeystones.get(randomNum.nextInt(DominationKeystones.size())));
        		 
        		int slot1Rune = randomNum.nextInt(3);
        		int slot2Rune = randomNum.nextInt(3);
        		int slot3Rune = randomNum.nextInt(3);
        		 
       			if(slot1Rune == 0)
       			{
       				allRunes.add("CheapShot");
       			}
       			else if(slot1Rune == 1)
       			{
       				allRunes.add("TasteOfBlood");
       			}
       			else if(slot1Rune == 2)
       			{
       				allRunes.add("SuddenImpact");
       			}
       		 
       		 	if(slot2Rune == 0)
       		 	{
       		 		allRunes.add("ZombieWard");
       		 	}
       		 	else if(slot2Rune == 1)
       		 	{
       		 		allRunes.add("GhostPoro");
       		 	}
       		 	else if(slot2Rune == 2)
       		 	{
       		 		allRunes.add("EyeballCollection");
       		 	}
       		 
       		 	if(slot3Rune == 0)
       		 	{
       		 		allRunes.add("RavenousHunter");
       		 	}
       		 	else if(slot3Rune == 1)
       		 	{
       		 		allRunes.add("IngeniousHunter");
       		 	}
       		 	else if(slot3Rune == 2)
       		 	{
       		 		allRunes.add("Relentless Hunter");
       		 	}
       		 	 
       		 	pickingSlot4and5 = true;
       		 }
       		 
       		 else
       		 {
       			int firstRow = 0;
       			int loop = 0;
       			 
       			for(int index = 0; index < 2; index++)
       			{ 
       				int runeRow = randomNum.nextInt(3);
       				int rune = randomNum.nextInt(3);	
       				 
       				while (loop == 1 && runeRow == firstRow)
       				{
       					runeRow = randomNum.nextInt(3);
       				}
       				
       				loop++;
       				 
        			if (runeRow == 0)
        			{
        				firstRow = 0;
        				 
        				if(rune == 0)
	        			{
	        				allRunes.add("CheapShot");
	        			}
	        			else if(rune == 1)
	        			{
	        				allRunes.add("TasteOfBlood");
	        			}
	        			else if(rune == 2)
	        			{
	        				allRunes.add("SuddenImpact");
	        			}
        			}
        			else if (runeRow == 1)
        			{
        				firstRow = 1;
        				 
        				if(rune == 0)
	        		 	{
	        		 		allRunes.add("ZombieWard");
	        		 	}
	        		 	else if(rune == 1)
	        		 	{
	        		 		allRunes.add("GhostPoro");
	        		 	}
	        		 	else if(rune == 2)
	        		 	{
	        		 		allRunes.add("EyeballCollection");
	        		 	}
        			}
        			else if (runeRow == 2)
        			{
        				firstRow = 2;
        				 
        				if(rune == 0)
	        		 	{
	        		 		allRunes.add("RavenousHunter");
	        		 	}
	        		 	else if(rune == 1)
	        		 	{
	        		 		allRunes.add("IngeniousHunter");
	        		 	}
	        		 	else if(rune == 2)
	        		 	{
	        		 		allRunes.add("RelentlessHunter");
	        		 	}
        			}
       			}
       			 
       			choosingRunes = false;
       		}
       		 
       		break;
	        
	        case 2:  
	        	
        	if (pickingSlot4and5 == false)
       		{
        		allRunes.add("Sorcery");
       			keystonePath = 2;
       		        
        		ArrayList<String> SorceryKeystones = new ArrayList<>();
        		SorceryKeystones.add("SummonAery");
        		SorceryKeystones.add("ArcaneComet");
        		SorceryKeystones.add("PhaseRush");
        		allRunes.add(SorceryKeystones.get(randomNum.nextInt(SorceryKeystones.size())));
        		 
        		int slot1Rune = randomNum.nextInt(3);
        		int slot2Rune = randomNum.nextInt(3);
        		int slot3Rune = randomNum.nextInt(3);
        		 
       			if(slot1Rune == 0)
       			{
       				allRunes.add("NullifyingOrb");
       			}
       			else if(slot1Rune == 1)
       			{
       				allRunes.add("ManaflowBand");
       			}
       			else if(slot1Rune == 2)
       			{
       				allRunes.add("TheUltimateHat");
       			}
       		 
       		 	if(slot2Rune == 0)
       		 	{
       		 		allRunes.add("Transcendence");
       		 	}
       		 	else if(slot2Rune == 1)
       		 	{
       		 		allRunes.add("Celerity");
       		 	}
       		 	else if(slot2Rune == 2)
       		 	{
       		 		allRunes.add("AbsoluteFocus");
       		 	}
       		 
       		 	if(slot3Rune == 0)
       		 	{
       		 		allRunes.add("Scorch");
       		 	}
       		 	else if(slot3Rune == 1)
       		 	{
       		 		allRunes.add("Waterwalking");
       		 	}
       		 	else if(slot3Rune == 2)
       		 	{
       		 		allRunes.add("GatheringStorm");
       		 	}
       		 	 
       		 	pickingSlot4and5 = true;
       		 }
	       		 
       		 else
       		 {
       			int firstRow = 0;
       			int loop = 0;
       			 
       			for(int index = 0; index < 2; index++)
       			{ 
       				int runeRow = randomNum.nextInt(3);
       				int rune = randomNum.nextInt(3);				 
       				 
       				while (loop == 1 && runeRow == firstRow)
       				{
       					runeRow = randomNum.nextInt(3);
       				}
       				
       				loop++;
       				 
       				if (runeRow == 0)
	        		{
       					firstRow = 0;
        				 
        				if(rune == 0)
	        			{
	        				allRunes.add("NullifyingOrb");
	        			}
	        			else if(rune == 1)
	        			{
	        				allRunes.add("ManaflowBand");
	        			}
	        			else if(rune == 2)
	        			{
	        				allRunes.add("TheUltimateHat");
	        			}
        			}
        			else if (runeRow == 1)
        			{
        				firstRow = 1;
        				 
        				if(rune == 0)
	        		 	{
	        		 		allRunes.add("Transcendence");
	        		 	}
	        		 	else if(rune == 1)
	        		 	{
	        		 		allRunes.add("Celerity");
	        		 	}
	        		 	else if(rune == 2)
	        		 	{
	        		 		allRunes.add("AbsoluteFocus");
	        		 	}
        			}
        			else if (runeRow == 2)
        			{
        				firstRow = 2;
        				 
        				if(rune == 0)
	        		 	{
	        		 		allRunes.add("Scorch");
	        		 	}
	        		 	else if(rune == 1)
	        		 	{
	        		 		allRunes.add("Waterwalking");
	        		 	}
	        		 	else if(rune == 2)
	        		 	{
	        		 		allRunes.add("GatheringStorm");
	        		 	}
        			}
       			}
       			 
       			choosingRunes = false;
       		}
       		 
       		break;	 
	       		 
	        case 3:  
	        	
       		if (pickingSlot4and5 == false)
       		{
       			allRunes.add("Resolve");
       			keystonePath = 3;
       		        
        		ArrayList<String> ResolveKeystones = new ArrayList<>();
        		ResolveKeystones.add("GraspOfTheUndying");
        		ResolveKeystones.add("Aftershock");
        		ResolveKeystones.add("Guardian");
        		allRunes.add(ResolveKeystones.get(randomNum.nextInt(ResolveKeystones.size())));
        		 
        		int slot1Rune = randomNum.nextInt(3);
        		int slot2Rune = randomNum.nextInt(4);
        		int slot3Rune = randomNum.nextInt(3);
        		 
       			if(slot1Rune == 0)
       			{
       				allRunes.add("Demolish");
       			}
       			else if(slot1Rune == 1)
       			{
       				allRunes.add("FontOfLife");
       			}
       			else if(slot1Rune == 2)
       			{
       				allRunes.add("BonePlating");
       			}
       		 
       		 	if(slot2Rune == 0)
       		 	{
       		 		allRunes.add("IronSkin");
       		 	}
       		 	else if(slot2Rune == 1)
       		 	{
       		 		allRunes.add("MirrorShell");
       		 	}
       		 	else if(slot2Rune == 2)
       		 	{
       		 		allRunes.add("Conditioning");
       		 	}
       		 	else if(slot2Rune == 3)
       		 	{
       		 		allRunes.add("SecondWind");
       		 	}
       		 
       		 	if(slot3Rune == 0)
       		 	{
       		 		allRunes.add("Overgrowth");
       		 	}
       		 	else if(slot3Rune == 1)
       		 	{
       		 		allRunes.add("Revitalize");
       		 	}
       		 	else if(slot3Rune == 2)
       		 	{
       		 		allRunes.add("Unflinching");
       		 	}
       		 	 
       		 	pickingSlot4and5 = true;
       		}
	       		 
       		else
       		{
       			int firstRow = 0;
       			int loop = 0;
       			 
       			for(int index = 0; index < 2; index++)
       			{ 
       				int runeRow = randomNum.nextInt(3);				 
       				 
       				while (loop == 1 && runeRow == firstRow)
       				{
       					runeRow = randomNum.nextInt(3);
       				}
       				
       				loop++;
       				 
        			if (runeRow == 0)
        			{
        				int rune = randomNum.nextInt(3);
        				firstRow = 0;
        				 
        				if(rune == 0)
	        			{
	        				allRunes.add("Demolish");
	        			}
	        			else if(rune == 1)
	        			{
	        				allRunes.add("FontOfLife");
	        			}
	        			else if(rune == 2)
	        			{
	        				allRunes.add("BonePlating");
	        			}
        			}
        			else if (runeRow == 1)
        			{
        				int rune = randomNum.nextInt(4);
        				firstRow = 1;
        				 
        				if(rune == 0)
	        		 	{
	        		 		allRunes.add("IronSkin");
	        		 	}
	        		 	else if(rune == 1)
	        		 	{
	        		 		allRunes.add("MirrorShell");
	        		 	}
	        		 	else if(rune == 2)
	        		 	{
	        		 		allRunes.add("Conditioning");
	        		 	}
	        		 	else if(rune == 3)
	        		 	{
	        		 		allRunes.add("SecondWind");
	        		 	}
        			}
        			else if (runeRow == 2)
        			{
        				int rune = randomNum.nextInt(3);
        				firstRow = 2;
        				 
        				if(rune == 0)
	        		 	{
	        		 		allRunes.add("Overgrowth");
	        		 	}
	        		 	else if(rune == 1)
	        		 	{
	        		 		allRunes.add("Revitalize");
	        		 	}
	        		 	else if(rune == 2)
	        		 	{
	        		 		allRunes.add("Unflinching");
	        		 	}
        			}
       			}
       			 
       			choosingRunes = false;
       		
       		}
       		 
       		break;
	       			 
	        case 4:  
	        	
	       		 if (pickingSlot4and5 == false)
	       		 {
	       			 allRunes.add("Inspiration");
	       			 keystonePath = 4;
	       		        
		        		 ArrayList<String> InspirationKeystones = new ArrayList<>();
		        		 InspirationKeystones.add("UnsealedSpellbook");
		        		 InspirationKeystones.add("GlacialAugment");
		        		 InspirationKeystones.add("Kleptomancy");
		        		 allRunes.add(InspirationKeystones.get(randomNum.nextInt(InspirationKeystones.size())));
		        		 
		        		 int slot1Rune = randomNum.nextInt(3);
		        		 int slot2Rune = randomNum.nextInt(3);
		        		 int slot3Rune = randomNum.nextInt(3);
		        		 
		       			 if(slot1Rune == 0)
		       			 {
		       				 allRunes.add("HextechFlashtraption");
		       			 }
		       			 else if(slot1Rune == 1)
		       			 {
		       				 allRunes.add("MagicalFootwear");
		       			 }
		       			 else if(slot1Rune == 2)
		       			 {
		       				 allRunes.add("PerfectTiming");
		       			 }
		       		 
		       		 	 if(slot2Rune == 0)
		       		 	 {
		       		 		 allRunes.add("FuturesMarket");
		       		 	 }
		       		 	 else if(slot2Rune == 1)
		       		 	 {
		       		 		 allRunes.add("MinionDematerializer");
		       		 	 }
		       		 	 else if(slot2Rune == 2)
		       		 	 {
		       		 		 allRunes.add("BiscuitDelivery");
		       		 	 }
		       		 
		       		 	 if(slot3Rune == 0)
		       		 	 {
		       		 		 allRunes.add("CosmicInsight");
		       		 	 }
		       		 	 else if(slot3Rune == 1)
		       		 	 {
		       		 		 allRunes.add("ApproachVelocity");
		       		 	 }
		       		 	 else if(slot3Rune == 2)
		       		 	 {
		       		 		 allRunes.add("TimeWarpTonic");
		       		 	 }
		       		 	 
		       		 	 pickingSlot4and5 = true;
		       		 }
		       		 
		       		 else
		       		 {
		       			 int firstRow = 0;
		       			 int loop = 0;
		       			 
		       			 for(int index = 0; index < 2; index++)
		       			 { 
		       				 int rune = randomNum.nextInt(3);
		       				 int runeRow = randomNum.nextInt(3);				 
		       				 
		       				 while (loop == 1 && runeRow == firstRow)
		       				 {
		       					 runeRow = randomNum.nextInt(3);
		       				 }
		       				 
		       				 loop++;
		       				 
			        			 if (runeRow == 0)
			        			 {
			        				 firstRow = 0;
			        				 
			        				 if(rune == 0)
				        			 {
				        				 allRunes.add("HextechFlashtraption");
				        			 }
				        			 else if(rune == 1)
				        			 {
				        				 allRunes.add("MagicalFootwear");
				        			 }
				        			 else if(rune == 2)
				        			 {
				        				 allRunes.add("PerfectTiming");
				        			 }
			        			 }
			        			 else if (runeRow == 1)
			        			 {
			        				 firstRow = 1;
			        				 
			        				 if(rune == 0)
				        		 	 {
				        		 		 allRunes.add("FuturesMarket");
				        		 	 }
				        		 	 else if(rune == 1)
				        		 	 {
				        		 		 allRunes.add("MinionDematerializer");
				        		 	 }
				        		 	 else if(rune == 2)
				        		 	 {
				        		 		 allRunes.add("BiscuitDelivery");
				        		 	 }
			        			 }
			        			 else if (runeRow == 2)
			        			 {
			        				 firstRow = 2;
			        				 
			        				 if(rune == 0)
				        		 	 {
				        		 		 allRunes.add("CosmicInsight");
				        		 	 }
				        		 	 else if(rune == 1)
				        		 	 {
				        		 		 allRunes.add("ApproachVelocity");
				        		 	 }
				        		 	 else if(rune == 2)
				        		 	 {
				        		 		 allRunes.add("TimeWarpTonic");
				        		 	 }
			        			 }
		       			 }
		       			 
		       			 choosingRunes = false;
		       		 }
		       		 
		       		 break;
	        
	        default: allRunes.add("InvalidPath");
	        
	        		 allRunes.add("InvalidKeystone");
	        		 break;
			}
		}
		return allRunes;
	}
	*/
	
	private void setupListeners()
	{
		randomizeButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				updateInfo();
			}
		});
	}
}
