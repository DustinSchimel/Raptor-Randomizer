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
	private Frame appFrame;
	
	public Controller()
	{
		championList = new ArrayList<Champion>();
		buildChampionList();
		
		appFrame = new Frame(this);
		
		//Image icon = Toolkit.getDefaultToolkit().getImage("/raptor/view/images/AppIcon.png");
	    //appFrame.setIconImage(icon);        Trying to get this to work
	}
	
	public void buildChampionList()
	{
		championList.add(new Aatrox());
		championList.add(new Ahri());
	}
	
	public List<Champion> getChampionList()
	{
		return championList;
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
	
	public void start()
	{
		
	}
}
