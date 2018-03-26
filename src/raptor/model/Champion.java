package raptor.model;

import java.util.ArrayList;

public abstract class Champion
{
	private String name;
	private String title;
	private boolean isMelee;
	
	
	public Champion (String title, String name, boolean isMelee)
	{
		this.name = name;
		this.title = title;
		this.isMelee = isMelee;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getNameForFile()
	{
		if (name.indexOf(". ") != -1)
		{
			return name.replaceAll(". ", "");
		}
		
		else if (name.indexOf("'") != -1)
		{
			return name.replaceAll("'", "");
		}
		
		else if (name.indexOf(" ") != -1)
		{
			return name.replaceAll(" ", "");
		}
		
		else
		{
			return name;
		}
	}
	
	public String getTitle()
	{
		return title;
	}
	
	public boolean isChampionMelee()
	{
		return isMelee;
	}
}
