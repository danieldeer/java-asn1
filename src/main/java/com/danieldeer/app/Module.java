package com.danieldeer.app;

import java.util.List;

public class Module
{
	public String name;

	public List<Definition> definitions;

	public Module()
	{

	}


	public void setName(String name)
	{
		this.name = name;
	}

	public void setDefinitions(List<Definition> definitions)
	{
		this.definitions = definitions;
	}

	public String toString()
	{
		return "name = " + this.name + ", definitions = " + this.definitions;
	}
}
