package org.viande.hashdrone;

import java.util.ArrayList;
import java.util.List;

public class Context {
	public Integer rows;
	public Integer columns;
	public Integer turnNumber;
	public Integer orderNumber;
	public Integer maxPayload;
	public Integer droneNumber;
	public Integer typeNumber;
	public Integer warehouseNumber;
	public List<Integer> goodWeight;
	public List<Warehouse> listWharehouse;
	public List<Drone> listDrone;
	public List<Order> listOrder;
	
	public Context()
	{
		this.listDrone = new ArrayList<Drone>();
		this.listWharehouse = new ArrayList<Warehouse>();
		this.listOrder = new ArrayList<Order>();
		this.goodWeight = new ArrayList<Integer>();
		this.typeNumber = 0;
		this.warehouseNumber = 0;
		this.orderNumber = 0;
	}
	
}
