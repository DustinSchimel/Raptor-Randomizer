package raptor.model;

import java.util.ArrayList;

public abstract class Champion
{
	private String name;
	private String title;
	
	
	public Champion (String name, String title)
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
	
	public String getTitle()
	{
		return title;
	}
}
