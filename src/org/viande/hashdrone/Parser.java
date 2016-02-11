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
			String res[];			
			Integer iter = 0;
			Integer jter = 0;
			Point pos;

			while ((line = reader.readLine()) != null)
			{
				switch (state) {
				case "begin":
					state = "product";
					res = line.split(" ");
					context.rows = Integer.parseInt(res[0]);
					context.columns = Integer.parseInt(res[1]);
					context.droneNumber = Integer.parseInt(res[2]);
					context.turnNumber = Integer.parseInt(res[3]);
					context.maxPayload = Integer.parseInt(res[4]);
					break;
				case "product" :
					if (context.typeNumber == 0)
						context.typeNumber = Integer.parseInt(line);
					else
					{
						state = "warehouse";
						res = line.split(" ");
						for (iter = 0; iter != res.length; iter++ )
							context.goodWeight.add(Integer.parseInt(res[iter]));
					}
					break;
				case "warehouse" :
					if (context.warehouseNumber == 0)
						{
							context.warehouseNumber = Integer.parseInt(line);
							iter = 0;
						}
					else if (iter != context.warehouseNumber)
					{
						pos = new Point();
						res = line.split(" ");
						pos.r = Integer.parseInt(res[0]);
						pos.c = Integer.parseInt(res[1]);
						Warehouse w = new Warehouse(iter, pos);
								
						line = reader.readLine();
						res = line.split(" ");
						for (jter = 0; jter != context.typeNumber; jter++)
							w.productsList.set(jter, Integer.parseInt(res[jter]));
						context.listWharehouse.add(w);
					}
					else
						state = "orders";
					break;
				case "orders" :
					if (context.orderNumber == 0)
					{
						context.orderNumber = Integer.parseInt(line);
						iter = 0;
					}
					else if (iter != context.orderNumber)
					{
						pos = new Point();
						res = line.split(" ");
						pos.r = Integer.parseInt(res[0]);
						pos.c = Integer.parseInt(res[1]);
						Order o = new Order(iter, pos);
						
						line = reader.readLine();
						res = line.split(" ");
						for (jter = 0; jter != context.typeNumber; jter++)
							o.orders.set(jter, Integer.parseInt(res[jter]));
					}
					break;
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
