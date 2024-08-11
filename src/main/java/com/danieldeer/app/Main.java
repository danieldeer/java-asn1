package com.danieldeer.app;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Main
{
	public static void main(String[] args) throws FileNotFoundException
	{
		if (args.length != 1)
		{
			System.err.println("No input file specified");
			return;
		}
		System.out.println("Provided input file: " + args[0]);
		String filename = args[0];
		Scanner sc = new Scanner(new File(filename));
		
		String moduleName = sc.next();
		System.out.println(moduleName);
		// From the parsed file, create a module
		Module module = new Module();
		module.setName(moduleName);
		System.out.println(module);

		String next = sc.next();
		if(next.equals("DEFINITIONS"))
		{
			// DEFINITIONS-mode -> parse names of definitions
			if(sc.next().equals("::="))
			{
				System.out.println("Expected assignment operator detected.");
			}
			if(sc.next().equals("BEGIN"))
			{
				System.out.println("Expected BEGIN operator detected.");
			}
			// moving into DEFINITIONS mode
			List<Definition> definitions = parseDefinitions();
			module.setDefinitions(definitions);
		}

		// complete parsed ASN.1 result: module
		module.toString();	
	}

	public static List<Definition> parseDefinitions(Scanner sc)
	{
		// Check which types of definitions exist and parse them
		// Start with names again, then check if types (e.g. SEQUENCE should be inherited classes of parent type DEFINITION or just a DEFINITION with specific attributes
	}
}
