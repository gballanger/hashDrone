package org.viande.hashdrone;

import java.io.BufferedReader;
import java.io.FileReader;

public class Parser {
	public FileReader inputFile;
	public BufferedReader reader;
	public String state = "Begin";
	public Context context;
	
	public Parser(String fileName)
	{
		try 
		{
			String line;
			inputFile = new FileReader(fileName);
			reader = new BufferedReader(inputFile);
			

			while ((line = reader.readLine()) != null)
			{
				switch (state) {
				
				
				case "begin":
					String res[];
					state = "product";
					res = line.split(" ");
					context.rows = Integer.parseInt(res[0]);
					context.columns = Integer.parseInt(res[1]);
					context.droneNumber = Integer.parseInt(res[2]);
					context.turnNumber = Integer.parseInt(res[3]);
					context.maxPayload = Integer.parseInt(res[4]);
					break;
				case "product" :
					
				default:
					break;
				}
			}
		}
		catch (Exception e)
		{
			System.out.println("Error while reading file :" + e.getMessage());
		}
	}
}
