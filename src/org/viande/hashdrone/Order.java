package org.viande.hashdrone;

import java.util.ArrayList;
import java.util.List;

public class Order {
	public Integer id;
	public Point dest;
	public List<Integer> orders;
	
	public Order(Integer id, Point point) {
		this.id = id;
		this.dest = point;
		this.orders = new ArrayList<Integer>();
	}
}
