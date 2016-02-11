package org.viande.hashdrone;

import java.util.ArrayList;
import java.util.List;

public class Warehouse {
	public Point place;
	public List<Integer> productsList;
	public Integer id = 0;
	
	public Warehouse(Integer id, Point position)
	{
		this.productsList = new ArrayList<Integer>();
		this.id = id;
		this.place = position;
	}
}
