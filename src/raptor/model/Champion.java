package raptor.model;

import java.util.ArrayList;

public abstract class Champion
{
	private String name;
	private String title;
	
	
	public Champion (String title, String name)
	{
		this.name = name;
		this.title = title;
	}
	
	public String toString()
	{
		String description = "Champion: " + name + " , Title: " + title;
		
		return description;
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
}
