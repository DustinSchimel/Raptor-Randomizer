package raptor.controller;

import raptor.model.*;
import raptor.view.Frame;

import java.util.List;
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
	private List<String> runesWithoutPrecision;
	private List<String> runesWithoutDomination;
	private List<String> runesWithoutSorcery;
	private List<String> runesWithoutResolve;
	private List<String> runesWithoutInspiration;
	private List<String> itemsList;
	private List<String> bootsList;
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
		runesWithoutPrecision = new ArrayList<String>();
		runesWithoutDomination = new ArrayList<String>();
		runesWithoutSorcery = new ArrayList<String>();
		runesWithoutResolve = new ArrayList<String>();
		runesWithoutInspiration = new ArrayList<String>();
		bootsList = new ArrayList<String>();
		itemsList = new ArrayList<String>();
		appFrame = new Frame(this);
		
		buildChampionList();
		buildSummonerSpellList();
		
		buildPrecisionList();
		buildDominationList();
		buildSorceryList();
		buildResolveList();
		buildInspirationList();
		
		buildRunesWithoutPrecision();
		buildRunesWithoutDomination();
		buildRunesWithoutSorcery();
		buildRunesWithoutResolve();
		buildRunesWithoutInspiration();
		
		buildItemsList();
		buildBootsList();
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
		championList.add(new Kindred());
		championList.add(new Kled());
		championList.add(new KogMaw());
		championList.add(new LeBlanc());
		championList.add(new LeeSin());
		championList.add(new Leona());
		championList.add(new Lissandra());
		championList.add(new Lucian());
		championList.add(new Lulu());
		championList.add(new Lux());
		championList.add(new Malphite());
		championList.add(new Malzahar());
		championList.add(new Maokai());
		championList.add(new MasterYi());
		championList.add(new MissFortune());
		championList.add(new Mordekaiser());
		championList.add(new Morgana());
		championList.add(new Nami());
		championList.add(new Nasus());
		championList.add(new Nautilus());
		championList.add(new Nidalee());
		championList.add(new Nocturne());
		championList.add(new Nunu());
		championList.add(new Olaf());
		championList.add(new Orianna());
		championList.add(new Ornn());
		championList.add(new Pantheon());
		championList.add(new Poppy());
		championList.add(new Quinn());
		championList.add(new Rakan());
		championList.add(new Rammus());
		championList.add(new RekSai());
		championList.add(new Renekton());
		championList.add(new Rengar());
		championList.add(new Riven());
		championList.add(new Rumble());
		championList.add(new Ryze());
		championList.add(new Sejuani());
		championList.add(new Shaco());
		championList.add(new Shen());
		championList.add(new Shyvana());
		championList.add(new Singed());
		championList.add(new Sion());
		championList.add(new Sivir());
		championList.add(new Skarner());
		championList.add(new Sona());
		championList.add(new Soraka());
		championList.add(new Swain());
		championList.add(new Syndra());
		championList.add(new TahmKench());
		championList.add(new Taliyah());
		championList.add(new Talon());
		championList.add(new Taric());
		championList.add(new Teemo());
		championList.add(new Thresh());
		championList.add(new Tristana());
		championList.add(new Trundle());
		championList.add(new Tryndamere());
		championList.add(new TwistedFate());
		championList.add(new Twitch());
		championList.add(new Udyr());
		championList.add(new Urgot());
		championList.add(new Varus());
		championList.add(new Vayne());
		championList.add(new Veigar());
		championList.add(new VelKoz());
		championList.add(new Vi());
		championList.add(new Viktor());
		championList.add(new Vladimir());
		championList.add(new Volibear());
		championList.add(new Warwick());
		championList.add(new Wukong());
		championList.add(new Xayah());
		championList.add(new Xerath());
		championList.add(new XinZhao());
		championList.add(new Yasuo());
		championList.add(new Yorick());
		championList.add(new Zac());
		championList.add(new Zed());
		championList.add(new Ziggs());
		championList.add(new Zilean());
		championList.add(new Zoe());
		championList.add(new Zyra());
		
		//Test multiform
		//championList.add(new Jayce());
		//championList.add(new Jayce());
		
		//Test melee
		//championList.add(new Poppy());
		//championList.add(new Poppy());
		
		//Test ranged
		//championList.add(new Nami());
		//championList.add(new Nami());
		
		//Test Cassiopeia
		//championList.add(new Cassiopeia());
		//championList.add(new Cassiopeia());
		
		//Test Viktor
		//championList.add(new Viktor());
		//championList.add(new Viktor());
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
		precisionRunesList.add("Conqueror");
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
		resolveRunesList.add("Conditioning");
		resolveRunesList.add("SecondWind");
		resolveRunesList.add("Chrysalis");
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
	
	public void buildRunesWithoutPrecision()
	{
		runesWithoutPrecision.add("Domination");
		runesWithoutPrecision.add("Sorcery");
		runesWithoutPrecision.add("Resolve");
		runesWithoutPrecision.add("Inspiration");
	}
	
	public void buildRunesWithoutDomination()
	{
		runesWithoutDomination.add("Precision");
		runesWithoutDomination.add("Sorcery");
		runesWithoutDomination.add("Resolve");
		runesWithoutDomination.add("Inspiration");
	}
	
	public void buildRunesWithoutSorcery()
	{
		runesWithoutSorcery.add("Precision");
		runesWithoutSorcery.add("Domination");
		runesWithoutSorcery.add("Resolve");
		runesWithoutSorcery.add("Inspiration");
	}
	
	public void buildRunesWithoutResolve()
	{
		runesWithoutResolve.add("Precision");
		runesWithoutResolve.add("Domination");
		runesWithoutResolve.add("Sorcery");
		runesWithoutResolve.add("Inspiration");
	}
	
	public void buildRunesWithoutInspiration()
	{
		runesWithoutInspiration.add("Precision");
		runesWithoutInspiration.add("Domination");
		runesWithoutInspiration.add("Sorcery");
		runesWithoutInspiration.add("Resolve");
	}
	
	public void buildItemsList()
	{
		itemsList.add("AbyssalMask");	//Normal items	|| Hexcore isn't added due to it not needing to be
		itemsList.add("AdaptiveHelm");
		itemsList.add("ArchangelsStaff");
		itemsList.add("ArdentCenser");
		itemsList.add("AthenesUnholyGrail");
		itemsList.add("BannerOfCommand");
		itemsList.add("BansheesVeil");
		itemsList.add("BladeOfTheRuinedKing");
		itemsList.add("DeadMansPlate");
		itemsList.add("DeathsDance");
		itemsList.add("DuskbladeOfDraktharr");
		itemsList.add("EdgeOfNight");
		itemsList.add("EssenceReaver");
		itemsList.add("FrozenHeart");
		itemsList.add("FrozenMallet");
		itemsList.add("GargoyleStoneplate");
		itemsList.add("GuardianAngel");
		itemsList.add("GuinsoosRageblade");
		itemsList.add("HextechGLP-800");
		itemsList.add("HextechGunblade");
		itemsList.add("HextechProtobelt-01");
		itemsList.add("IcebornGauntlet");
		itemsList.add("InfinityEdge");
		itemsList.add("KnightsVow");
		itemsList.add("LiandrysTorment");
		itemsList.add("LichBane");
		itemsList.add("LocketOfTheIronSolari");
		itemsList.add("LordDominiksRegards");
		itemsList.add("LudensEcho");
		itemsList.add("Manamune");
		itemsList.add("MawOfMalmortius");
		itemsList.add("MejaisSoulstealer");
		itemsList.add("MercurialScimitar");
		itemsList.add("MikaelsCrucible");
		itemsList.add("Morellonomicon");
		itemsList.add("MortalReminder");
		itemsList.add("NashorsTooth");
		itemsList.add("Ohmwrecker");
		itemsList.add("PhantomDancer");
		itemsList.add("RabadonsDeathcap");
		itemsList.add("RanduinsOmen");
		itemsList.add("RapidFirecannon");
		itemsList.add("Redemption");
		itemsList.add("RighteousGlory");
		itemsList.add("RodOfAges");
		itemsList.add("RylaisCrystalScepter");
		itemsList.add("ShurelyasReverie");
		itemsList.add("Spellbinder");
		itemsList.add("SpiritVisage");
		itemsList.add("StatikkShiv");
		itemsList.add("SunfireCape");
		itemsList.add("TheBlackCleaver");
		itemsList.add("TheBloodthirster");
		itemsList.add("Thornmail");
		itemsList.add("TrinityForce");
		itemsList.add("TwinShadows");
		itemsList.add("VoidStaff");
		itemsList.add("WarmogsArmor");
		itemsList.add("WitsEnd");
		itemsList.add("YoumuusGhostblade");
		itemsList.add("ZekesConvergence");
		itemsList.add("ZhonyasHourglass");
		itemsList.add("ZzRotPortal");
		
		itemsList.add("RunaansHurricane");	//Ranged only
		
		itemsList.add("RavenousHydra");		//Melee only
		itemsList.add("TitanicHydra");
		itemsList.add("SteraksGage");
		
		itemsList.add("RemnantOfTheAscended");	//One only
		itemsList.add("RemnantOfTheAspect");
		itemsList.add("RemnantOfTheWatchers");
		
		itemsList.add("SkirmishersSabreBloodrazor");	//One only && Smite only
		itemsList.add("SkirmishersSabreCinderhulk");
		itemsList.add("SkirmishersSabreRunicEchoes");
		itemsList.add("SkirmishersSabreWarrior");
		itemsList.add("StalkersBladeBloodrazor");
		itemsList.add("StalkersBladeCinderhulk");
		itemsList.add("StalkersBladeRunicEchoes");
		itemsList.add("StalkersBladeWarrior");
	}
	
	public void buildBootsList()
	{
		bootsList.add("BerserkersGreaves");
		bootsList.add("BootsOfMobility");
		bootsList.add("BootsOfSwiftness");
		bootsList.add("IonianBootsOfLucidity");
		bootsList.add("MercurysTreads");
		bootsList.add("NinjaTabi");
		bootsList.add("SorcerersShoes");
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
	
	public int findItemLocation(String itemToFind, List availableItemsList)
	{    
	    for (int index = 0; index < availableItemsList.size(); index++)
	    {
	    	if (availableItemsList.get(index).equals(itemToFind))
	    	{
	    		return index;
	    	}
	    }
	    return -1;
	}
	
	public List<String> getSpecificList(String keystonePath)
	{
		if (keystonePath.equals("Precision"))
		{
			return precisionRunesList;
		}
		else if (keystonePath.equals("Domination"))
		{
			return dominationRunesList;
		}
		else if (keystonePath.equals("Sorcery"))
		{
			return sorceryRunesList;
		}
		else if (keystonePath.equals("Resolve"))
		{
			return resolveRunesList;
		}
		else if (keystonePath.equals("Inspiration"))
		{
			return inspirationRunesList;
		}
		else
		{
			return null;
		}
	}
	
	public List<String> getSpecificListWithout(String keystonePath)
	{
		if (keystonePath.equals("Precision"))
		{
			return runesWithoutPrecision;
		}
		else if (keystonePath.equals("Domination"))
		{
			return runesWithoutDomination;
		}
		else if (keystonePath.equals("Sorcery"))
		{
			return runesWithoutSorcery;
		}
		else if (keystonePath.equals("Resolve"))
		{
			return runesWithoutResolve;
		}
		else if (keystonePath.equals("Inspiration"))
		{
			return runesWithoutInspiration;
		}
		else
		{
			return null;
		}
	}
	
	public List<Champion> getChampionList()
	{
		return championList;
	}
	
	public List<String> getSummonerSpellList()
	{
		return summonerSpellList;
	}
	
	public List<String> getItemsList()
	{
		return itemsList;
	}
	
	public List<String> getBootsList()
	{
		return bootsList;
	}
	
	public void start()
	{
		
	}
}
