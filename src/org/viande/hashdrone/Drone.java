package org.viande.hashdrone;

import java.util.ArrayList;
import java.util.List;

public class Drone {
	public Point position;
	public Integer id;
	public Integer max_weight;
	public List<Integer> productList;
	
	public Drone(Integer id, Integer max_weight)
	{
		this.id = id;
		this.max_weight = max_weight;
		this.productList = new ArrayList<Integer>();
	}
}
