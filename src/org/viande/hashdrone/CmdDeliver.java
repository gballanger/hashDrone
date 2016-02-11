package org.viande.hashdrone;

public class CmdDeliver extends Command {

	public Integer order_id;
	public Integer product;
	public Integer qty;

	CmdDeliver() {
		this.cmd = Command.LOAD;
	}
	
	public String print() {
		
		return this.drone_id.toString() 
				+ " " + this.cmd 
				+ " " + this.order_id.toString() 
				+ " " + this.product.toString()
				+ " " + this.qty;
	}
}
