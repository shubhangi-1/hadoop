/**
 * 
 */
package io.gojek.parkinglot.model.strategy;

public interface ParkingStrategy
{
	public void add(int i);
	
	public int getSlot();
	
	public void removeSlot(int slot);
}
