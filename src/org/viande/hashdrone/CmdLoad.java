package org.viande.hashdrone;

public class CmdLoad extends Command {

	public Integer warehouse_id;
	public Integer product;
	public Integer qty;

	CmdLoad() {
		this.cmd = Command.LOAD;
	}
	
	public String print() {
		
		return this.drone_id.toString() 
				+ " " + this.cmd 
				+ " " + this.warehouse_id.toString() 
				+ " " + this.product.toString()
				+ " " + this.qty;
	}
}
