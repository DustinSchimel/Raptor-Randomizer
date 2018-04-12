package raptor.view;

import raptor.controller.Controller;
import raptor.model.Champion;

import javax.swing.*;
import java.awt.Color;
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
		nameLabel.setFont(new Font("Serif", Font.PLAIN, 26));
		
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
		this.add(nameLabel);
		this.add(titleLabel);
		this.add(championPicLabel);
		
		this.add(summonerSpell1);
		this.add(summonerSpell2);
		
		this.add(runesKeystone);
		this.add(runes1Slot1);
		this.add(runes1Slot2);
		this.add(runes1Slot3);
		this.add(runes2Slot1);
		this.add(runes2Slot2);
		
		this.add(item1);
		this.add(item2);
		this.add(item3);
		this.add(item4);
		this.add(item5);
		this.add(item6);
		
		this.add(randomizeButton);
	}
	
	private void setupLayout()
	{
		this.setLayout(appLayout);
		appLayout.putConstraint(SpringLayout.WEST, randomizeButton, 0, SpringLayout.WEST, summonerSpell1);
		appLayout.putConstraint(SpringLayout.EAST, randomizeButton, 0, SpringLayout.EAST, summonerSpell2);
		appLayout.putConstraint(SpringLayout.NORTH, summonerSpell2, 0, SpringLayout.NORTH, summonerSpell1);
		appLayout.putConstraint(SpringLayout.WEST, summonerSpell2, 18, SpringLayout.EAST, summonerSpell1);
		appLayout.putConstraint(SpringLayout.SOUTH, summonerSpell1, -16, SpringLayout.NORTH, item1);
		appLayout.putConstraint(SpringLayout.SOUTH, item1, 2, SpringLayout.SOUTH, item3);
		appLayout.putConstraint(SpringLayout.NORTH, item3, 104, SpringLayout.SOUTH, titleLabel);
		appLayout.putConstraint(SpringLayout.SOUTH, item2, 0, SpringLayout.SOUTH, item1);
		appLayout.putConstraint(SpringLayout.EAST, item2, 0, SpringLayout.EAST, item5);
		appLayout.putConstraint(SpringLayout.WEST, item1, 0, SpringLayout.WEST, item4);
		appLayout.putConstraint(SpringLayout.SOUTH, item4, 0, SpringLayout.SOUTH, runes1Slot3);
		appLayout.putConstraint(SpringLayout.NORTH, item5, 0, SpringLayout.NORTH, runes1Slot3);
		appLayout.putConstraint(SpringLayout.EAST, item3, 0, SpringLayout.EAST, item6);
		appLayout.putConstraint(SpringLayout.WEST, nameLabel, 0, SpringLayout.WEST, titleLabel);
		appLayout.putConstraint(SpringLayout.SOUTH, nameLabel, -6, SpringLayout.NORTH, titleLabel);
		appLayout.putConstraint(SpringLayout.WEST, titleLabel, 0, SpringLayout.EAST, championPicLabel);
		appLayout.putConstraint(SpringLayout.EAST, nameLabel, -144, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.SOUTH, item6, 0, SpringLayout.SOUTH, runes1Slot3);
		appLayout.putConstraint(SpringLayout.EAST, titleLabel, 0, SpringLayout.WEST, runesKeystone);
		appLayout.putConstraint(SpringLayout.EAST, runesKeystone, -80, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.NORTH, titleLabel, 63, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.SOUTH, randomizeButton, 0, SpringLayout.SOUTH, championPicLabel);
		appLayout.putConstraint(SpringLayout.SOUTH, runesKeystone, -273, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.NORTH, runes2Slot2, 0, SpringLayout.NORTH, runes1Slot2);
		appLayout.putConstraint(SpringLayout.WEST, runes2Slot2, 6, SpringLayout.EAST, runes1Slot2);
		appLayout.putConstraint(SpringLayout.NORTH, runes2Slot1, 0, SpringLayout.NORTH, runes1Slot1);
		appLayout.putConstraint(SpringLayout.WEST, runes2Slot1, 6, SpringLayout.EAST, runes1Slot1);
		appLayout.putConstraint(SpringLayout.NORTH, runes1Slot3, 6, SpringLayout.SOUTH, runes1Slot2);
		appLayout.putConstraint(SpringLayout.EAST, runes1Slot3, 0, SpringLayout.EAST, runesKeystone);
		appLayout.putConstraint(SpringLayout.NORTH, runes1Slot2, 6, SpringLayout.SOUTH, runes1Slot1);
		appLayout.putConstraint(SpringLayout.EAST, runes1Slot2, 0, SpringLayout.EAST, runesKeystone);
		appLayout.putConstraint(SpringLayout.NORTH, runes1Slot1, 6, SpringLayout.SOUTH, runesKeystone);
		appLayout.putConstraint(SpringLayout.WEST, runes1Slot1, 0, SpringLayout.WEST, runesKeystone);
		appLayout.putConstraint(SpringLayout.NORTH, championPicLabel, 10, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.WEST, championPicLabel, 10, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.EAST, item5, -260, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.EAST, summonerSpell1, -301, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.EAST, item6, -33, SpringLayout.WEST, runes1Slot3);
		appLayout.putConstraint(SpringLayout.EAST, item4, -343, SpringLayout.EAST, this);
	}
	
	
	
	
	//startComplexity
	//startAbstraction
	private void updateInfo()
	{
		Champion currentChampion = randomizeChampion();								//All these methods pick components from lists based on conditions as well as randomization
		ArrayList<String> summonerSpells = randomizeSummonerSpells();
		ArrayList<String> runes = randomizeRunes();
		ArrayList<String> items = randomizeItems(currentChampion, summonerSpells);	//Items are randomly chosen based on current champion as well as summoner spells
		String boot = randomizeBoot();
		
		//endAbstraction
		
		//The code below displays certain images depending on what's in the lists
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
								 + runes.get(1) + "Picture.png")));
		
		runes1Slot2.setIcon(new ImageIcon(Panel.class.getResource("/raptor/view/images/runes/" 
								 + runes.get(2) + "Picture.png")));
		
		runes1Slot3.setIcon(new ImageIcon(Panel.class.getResource("/raptor/view/images/runes/" 
							 	 + runes.get(3) + "Picture.png")));
		
		runes2Slot1.setIcon(new ImageIcon(Panel.class.getResource("/raptor/view/images/runes/" 
								 + runes.get(4) + "Picture.png")));
		
		runes2Slot2.setIcon(new ImageIcon(Panel.class.getResource("/raptor/view/images/runes/" 
								 + runes.get(5) + "Picture.png")));
		
		
		//This section uses logic by checking if the currently selected champion is "Viktor" and if it is, it displays a certain image for them
		if (currentChampion.getName().equals("Viktor"))
		{
			item1.setIcon(new ImageIcon(Panel.class.getResource("/raptor/view/images/items/" 
				 + "PerfectHexCorePicture.png")));
		}
		else
		{
			item1.setIcon(new ImageIcon(Panel.class.getResource("/raptor/view/images/items/" 
				 + items.get(0) + "Picture.png")));
		}
		
		item2.setIcon(new ImageIcon(Panel.class.getResource("/raptor/view/images/items/" 
				 + items.get(1) + "Picture.png")));
		
		item3.setIcon(new ImageIcon(Panel.class.getResource("/raptor/view/images/items/" 
				 + items.get(2) + "Picture.png")));
		
		item4.setIcon(new ImageIcon(Panel.class.getResource("/raptor/view/images/items/" 
				 + items.get(3) + "Picture.png")));
		
		item5.setIcon(new ImageIcon(Panel.class.getResource("/raptor/view/images/items/" 
				 + items.get(4) + "Picture.png")));
		
		//This section uses logic by checking if the currently selected champion is "Cassiopeia" and if it is, it then takes another item for the lists instead of boots
		if (currentChampion.getName().equals("Cassiopeia"))
		{
			item6.setIcon(new ImageIcon(Panel.class.getResource("/raptor/view/images/items/"
					 + items.get(5) + "Picture.png")));
		}
		else
		{
			item6.setIcon(new ImageIcon(Panel.class.getResource("/raptor/view/images/items/" 
					 + boot + "Picture.png")));
		}
		
		repaint();
	}
	//endComplexity
	
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
		
		if (keystonePath.equals("Precision"))							//Adds the keystone to the list
		{
			allRunes.add(appController.getSpecificList(keystonePath)
					.get(randomNum.nextInt(4)));
			
			allRunes.add(appController.getSpecificList(keystonePath)	//Adds the three minor runes
					.get(randomNum.nextInt(3) + 4));
			
			allRunes.add(appController.getSpecificList(keystonePath)
					.get(randomNum.nextInt(3) + 7));
			
			allRunes.add(appController.getSpecificList(keystonePath)
					.get(randomNum.nextInt(3) + 10));
		}
		else
		{
			allRunes.add(appController.getSpecificList(keystonePath)
					.get(randomNum.nextInt(3)));
			
			for (int index = 0, addition = 3; index < 3; index++, addition = addition + 3)	//Adds the three minor runes
			{
				allRunes.add(appController.getSpecificList(keystonePath)
						.get(randomNum.nextInt(3) + addition));
			}
		}
			
		int randomRow = randomNum.nextInt(3);
		int randomNextRow = randomNum.nextInt(2);
		
		if (secondPath.equals("Precision"))
		{
			if (randomRow == 0)
			{
				allRunes.add(appController.getSpecificList(secondPath)
						.get(randomNum.nextInt(3) + 4));
				
				if (randomNextRow == 0)
				{
					allRunes.add(appController.getSpecificList(secondPath)
							.get(randomNum.nextInt(3) + 7));
				}
				else if (randomNextRow == 1)
				{
					allRunes.add(appController.getSpecificList(secondPath)
							.get(randomNum.nextInt(3) + 10));
				}
			}
			else if (randomRow == 1)
			{
				allRunes.add(appController.getSpecificList(secondPath)
						.get(randomNum.nextInt(3) + 7));
				
				if (randomNextRow == 0)
				{
					allRunes.add(appController.getSpecificList(secondPath)
							.get(randomNum.nextInt(3) + 4));
				}
				else if (randomNextRow == 1)
				{
					allRunes.add(appController.getSpecificList(secondPath)
							.get(randomNum.nextInt(3) + 10));
				}
			}
			else if (randomRow == 2)
			{
				allRunes.add(appController.getSpecificList(secondPath)
						.get(randomNum.nextInt(3) + 10));
				
				if (randomNextRow == 0)
				{
					allRunes.add(appController.getSpecificList(secondPath)
							.get(randomNum.nextInt(3) + 4));
				}
				else if (randomNextRow == 1)
				{
					allRunes.add(appController.getSpecificList(secondPath)
							.get(randomNum.nextInt(3) + 7));
				}
			}
		}
		else
		{
			if (randomRow == 0)
			{
				allRunes.add(appController.getSpecificList(secondPath)
						.get(randomNum.nextInt(3) + 3));
				
				if (randomNextRow == 0)
				{
					allRunes.add(appController.getSpecificList(secondPath)
							.get(randomNum.nextInt(3) + 6));
				}
				else if (randomNextRow == 1)
				{
					allRunes.add(appController.getSpecificList(secondPath)
							.get(randomNum.nextInt(3) + 9));
				}
			}
			else if (randomRow == 1)
			{
				allRunes.add(appController.getSpecificList(secondPath)
						.get(randomNum.nextInt(3) + 6));
				
				if (randomNextRow == 0)
				{
					allRunes.add(appController.getSpecificList(secondPath)
							.get(randomNum.nextInt(3) + 3));
				}
				else if (randomNextRow == 1)
				{
					allRunes.add(appController.getSpecificList(secondPath)
							.get(randomNum.nextInt(3) + 9));
				}
			}
			else if (randomRow == 2)
			{
				allRunes.add(appController.getSpecificList(secondPath)
						.get(randomNum.nextInt(3) + 9));
				
				if (randomNextRow == 0)
				{
					allRunes.add(appController.getSpecificList(secondPath)
							.get(randomNum.nextInt(3) + 3));
				}
				else if (randomNextRow == 1)
				{
					allRunes.add(appController.getSpecificList(secondPath)
							.get(randomNum.nextInt(3) + 6));
				}
			}
			
		}
		
		return allRunes;
	}
	
	private String randomizeBoot()
	{
		Random randomNum = new Random();
		
		String boot = "";
		int selectedBootIndex = -1;
		
		selectedBootIndex = randomNum.nextInt(appController.getBootsList().size());
		boot = appController.getBootsList().get(selectedBootIndex);
		
		return boot;
	}
	
	private ArrayList<String> randomizeItems(Champion currentChampion, ArrayList summonerSpells)
	{
		ArrayList<String> allItems = new ArrayList<String>();
		List<String> availableItems = new ArrayList<String>(appController.getItemsList());
		
		if (currentChampion.isChampionMelee() == true)	//If champion is melee
		{
			if (currentChampion.isFormChanger() == false)
			{
				availableItems.remove(appController.findItemLocation("RunaansHurricane", availableItems));
			}
		}
		else if (currentChampion.isChampionMelee() == false)	//If champion is ranged
		{
			if (currentChampion.isFormChanger() == false)
			{
				availableItems.remove(appController.findItemLocation("RavenousHydra", availableItems));	//May have to make it so both hydra and ravenous cannot both be bought
				availableItems.remove(appController.findItemLocation("TitanicHydra", availableItems));
				availableItems.remove(appController.findItemLocation("SteraksGage", availableItems));
			}
		}
		
		if (!summonerSpells.get(0).equals("Smite") && !summonerSpells.get(1).equals("Smite"))
		{
			availableItems.remove(appController.findItemLocation("SkirmishersSabreBloodrazor", availableItems));
			availableItems.remove(appController.findItemLocation("SkirmishersSabreCinderhulk", availableItems));
			availableItems.remove(appController.findItemLocation("SkirmishersSabreRunicEchoes", availableItems));
			availableItems.remove(appController.findItemLocation("SkirmishersSabreWarrior", availableItems));
			availableItems.remove(appController.findItemLocation("StalkersBladeBloodrazor", availableItems));
			availableItems.remove(appController.findItemLocation("StalkersBladeCinderhulk", availableItems));
			availableItems.remove(appController.findItemLocation("StalkersBladeRunicEchoes", availableItems));
			availableItems.remove(appController.findItemLocation("StalkersBladeWarrior", availableItems));
		}
		
		Random randomNum = new Random();
		
		for (int index = 0; index < 6; index++)
		{
			int itemToAddIndex = randomNum.nextInt(availableItems.size());
			
			if (availableItems.get(itemToAddIndex).equals("RemnantOfTheAscended") || availableItems.get(itemToAddIndex).equals("RemnantOfTheAspect")
					|| availableItems.get(itemToAddIndex).equals("RemnantOfTheWatchers"))
			{
				allItems.add(availableItems.get(itemToAddIndex));
				availableItems.remove(appController.findItemLocation("RemnantOfTheAscended", availableItems));
				availableItems.remove(appController.findItemLocation("RemnantOfTheAspect", availableItems));
				availableItems.remove(appController.findItemLocation("RemnantOfTheWatchers", availableItems));
			}
			else if (availableItems.get(itemToAddIndex).equals("SkirmishersSabreBloodrazor")  || availableItems.get(itemToAddIndex).equals("SkirmishersSabreCinderhulk")
				  || availableItems.get(itemToAddIndex).equals("SkirmishersSabreRunicEchoes") || availableItems.get(itemToAddIndex).equals("SkirmishersSabreWarrior")
				  || availableItems.get(itemToAddIndex).equals("StalkersBladeBloodrazor")     || availableItems.get(itemToAddIndex).equals("StalkersBladeCinderhulk")
				  || availableItems.get(itemToAddIndex).equals("StalkersBladeRunicEchoes")    || availableItems.get(itemToAddIndex).equals("StalkersBladeWarrior"))
			{
				allItems.add(availableItems.get(itemToAddIndex));
				availableItems.remove(appController.findItemLocation("SkirmishersSabreBloodrazor", availableItems));
				availableItems.remove(appController.findItemLocation("SkirmishersSabreCinderhulk", availableItems));
				availableItems.remove(appController.findItemLocation("SkirmishersSabreRunicEchoes", availableItems));
				availableItems.remove(appController.findItemLocation("SkirmishersSabreWarrior", availableItems));
				availableItems.remove(appController.findItemLocation("StalkersBladeBloodrazor", availableItems));
				availableItems.remove(appController.findItemLocation("StalkersBladeCinderhulk", availableItems));
				availableItems.remove(appController.findItemLocation("StalkersBladeRunicEchoes", availableItems));
				availableItems.remove(appController.findItemLocation("StalkersBladeWarrior", availableItems));
			}
			else
			{
				allItems.add(availableItems.get(itemToAddIndex));	//Items with no conditions
				availableItems.remove(itemToAddIndex);
			}
		}
		
		return allItems;
	}
	
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
