package raptor.controller;

import raptor.model.*;
import raptor.view.Frame;

import java.util.List;

import java.awt.Image;
import java.awt.Toolkit;
import java.util.ArrayList;

public class Controller
{
	private List<Champion> championList;
	private List<String> summonerSpellList;
	private List<String> precisionRunesList;
	private List<String> dominationRunesList;
	private List<String> sorceryRunesList;
	private List<String> resolveRunesList;
	private List<String> inspirationRunesList;
	private List<List> runesList;
	private Frame appFrame;
	
	public Controller()
	{
		championList = new ArrayList<Champion>();
		summonerSpellList = new ArrayList<String>();
		precisionRunesList = new ArrayList<String>();
		dominationRunesList = new ArrayList<String>();
		sorceryRunesList = new ArrayList<String>();
		resolveRunesList = new ArrayList<String>();
		inspirationRunesList = new ArrayList<String>();
		runesList = new ArrayList<List>();
		appFrame = new Frame(this);
		
		buildChampionList();
		buildSummonerSpellList();
		buildPrecisionList();
		buildDominationList();
		buildSorceryList();
		buildResolveList();
		buildInspirationList();
		buildRunesList();
		
		//Image icon = Toolkit.getDefaultToolkit().getImage("/raptor/view/images/AppIcon.png");
	    //appFrame.setIconImage(icon);        Trying to get this to work
	}
	
	public void buildChampionList()
	{
		championList.add(new Aatrox());
		championList.add(new Ahri());
		championList.add(new Akali());
		championList.add(new Alistar());
		championList.add(new Amumu());
		championList.add(new Anivia());
		championList.add(new Annie());
		championList.add(new Ashe());
		championList.add(new AurelionSol());
		championList.add(new Azir());
		championList.add(new Bard());
		championList.add(new Blitzcrank());
		championList.add(new Brand());
		championList.add(new Braum());
		championList.add(new Caitlyn());
		championList.add(new Camille());
		championList.add(new Cassiopeia());
		championList.add(new ChoGath());
		championList.add(new Corki());
		championList.add(new Darius());
		championList.add(new Diana());
		championList.add(new Draven());
		championList.add(new DrMundo());
		championList.add(new Ekko());
		championList.add(new Elise());
		championList.add(new Evelynn());
		championList.add(new Ezreal());
		championList.add(new Fiddlesticks());
		championList.add(new Fiora());
		championList.add(new Fizz());
		championList.add(new Galio());
		championList.add(new Gangplank());
		championList.add(new Garen());
		championList.add(new Gnar());
		championList.add(new Gragas());
		championList.add(new Graves());
		championList.add(new Hecarim());
		championList.add(new Heimerdinger());
		championList.add(new Illaoi());
		championList.add(new Irelia());
		championList.add(new Ivern());
		championList.add(new Janna());
		championList.add(new JarvanIV());
		championList.add(new Jax());
		championList.add(new Jayce());
		championList.add(new Jhin());
		championList.add(new Jinx());
		championList.add(new KaiSa());
		championList.add(new Kalista());
		championList.add(new Karma());
		championList.add(new Karthus());
		championList.add(new Kassadin());
		championList.add(new Katarina());
		championList.add(new Kayle());
		championList.add(new Kayn());
		championList.add(new Kennen());
		championList.add(new KhaZix());
		
	}
	
	public void buildSummonerSpellList()
	{
		summonerSpellList.add("Barrier");
		summonerSpellList.add("Cleanse");
		summonerSpellList.add("Exhaust");
		summonerSpellList.add("Flash");
		summonerSpellList.add("Ghost");
		summonerSpellList.add("Heal");
		summonerSpellList.add("Ignite");
		summonerSpellList.add("Teleport");
		summonerSpellList.add("Smite");
	}
	
	public void buildPrecisionList()
	{
		precisionRunesList.add("PressTheAttack");
		precisionRunesList.add("LethalTempo");
		precisionRunesList.add("FleetFootwork");
		precisionRunesList.add("Overheal");
		precisionRunesList.add("Triumph");
		precisionRunesList.add("PresenceOfMind");
		precisionRunesList.add("LegendAlacrity");
		precisionRunesList.add("LegendTenacity");
		precisionRunesList.add("LegendBloodline");
		precisionRunesList.add("CoupDeGrace");
		precisionRunesList.add("CutDown");
		precisionRunesList.add("LastStand");
	}
	
	public void buildDominationList()
	{
		dominationRunesList.add("Electrocute");
		dominationRunesList.add("Predator");
		dominationRunesList.add("DarkHarvest");
		dominationRunesList.add("CheapShot");
		dominationRunesList.add("TasteOfBlood");
		dominationRunesList.add("SuddenImpact");
		dominationRunesList.add("ZombieWard");
		dominationRunesList.add("GhostPoro");
		dominationRunesList.add("EyeballCollection");
		dominationRunesList.add("RavenousHunter");
		dominationRunesList.add("IngeniousHunter");
		dominationRunesList.add("RelentlessHunter");
	}
	
	public void buildSorceryList()
	{
		sorceryRunesList.add("SummonAery");
		sorceryRunesList.add("ArcaneComet");
		sorceryRunesList.add("PhaseRush");
		sorceryRunesList.add("NullifyingOrb");
		sorceryRunesList.add("ManaflowBand");
		sorceryRunesList.add("TheUltimateHat");
		sorceryRunesList.add("Transcendence");
		sorceryRunesList.add("Celerity");
		sorceryRunesList.add("AbsoluteFocus");
		sorceryRunesList.add("Scorch");
		sorceryRunesList.add("Waterwalking");
		sorceryRunesList.add("GatheringStorm");
	}
	
	public void buildResolveList()
	{
		resolveRunesList.add("GraspOfTheUndying");
		resolveRunesList.add("Aftershock");
		resolveRunesList.add("Guardian");
		resolveRunesList.add("Demolish");
		resolveRunesList.add("FontOfLife");
		resolveRunesList.add("BonePlating");
		resolveRunesList.add("IronSkin");
		resolveRunesList.add("MirrorShell");
		resolveRunesList.add("Conditioning");
		resolveRunesList.add("SecondWind");
		resolveRunesList.add("Overgrowth");
		resolveRunesList.add("Revitalize");
		resolveRunesList.add("Unflinching");
	}
	
	public void buildInspirationList()
	{
		inspirationRunesList.add("UnsealedSpellbook");
		inspirationRunesList.add("GlacialAugment");
		inspirationRunesList.add("Kleptomancy");
		inspirationRunesList.add("HextechFlashtraption");
		inspirationRunesList.add("MagicalFootwear");
		inspirationRunesList.add("PerfectTiming");
		inspirationRunesList.add("FuturesMarket");
		inspirationRunesList.add("MinionDematerializer");
		inspirationRunesList.add("BiscuitDelivery");
		inspirationRunesList.add("CosmicInsight");
		inspirationRunesList.add("ApproachVelocity");
		inspirationRunesList.add("TimeWarpTonic");
	}
	
	public void buildRunesList()
	{
		runesList.add(precisionRunesList);
		runesList.add(dominationRunesList);
		runesList.add(sorceryRunesList);
		runesList.add(resolveRunesList);
		runesList.add(inspirationRunesList);
	}
	
	public String [] convertChampionList()
	{
		String [] names = new String [championList.size()];
		
		for (int index = 0; index < championList.size(); index++)
		{
			names[index] = championList.get(index).getName();
		}
		
		return names;
	}
	
	public List<Champion> getChampionList()
	{
		return championList;
	}
	
	public List<String> getSummonerSpellList()
	{
		return summonerSpellList;
	}
	
	public List<String> getPrecisionRunesList()
	{
		return precisionRunesList;
	}
	
	public List<String> getDominationRunesList()
	{
		return dominationRunesList;
	}
	
	public List<String> getSorceryRunesList()
	{
		return sorceryRunesList;
	}
	
	public List<String> getResolveRunesList()
	{
		return resolveRunesList;
	}
	
	public List<String> getInspirationRunesList()
	{
		return inspirationRunesList;
	}
	
	public List<List> getRunesList()
	{
		return runesList;
	}
	
	public void start()
	{
		
	}
}
