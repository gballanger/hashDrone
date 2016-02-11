package org.viande.hashdrone;

public class CmdWait extends Command {

	public Integer time;

	CmdWait() {
		this.cmd = Command.LOAD;
	}
	
	public String print() {
		
		return this.drone_id.toString() 
				+ " " + this.cmd 
				+ " " + this.time.toString(); 
	}
}
