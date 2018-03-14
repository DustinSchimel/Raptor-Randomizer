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
	private Frame appFrame;
	
	public Controller()
	{
		championList = new ArrayList<Champion>();
		summonerSpellList = new ArrayList<String>();
		appFrame = new Frame(this);
		
		buildChampionList();
		buildSummonerSpellList();
		
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
	
	public void start()
	{
		
	}
}
