package com.wolken.wolkenapp.tubelight;

import com.wolken.wolkenapp.iswitch.ISwitch;
// implementation class - implementation logic

// data - dto, validations- service, logic - Dao
public class TubeLightImplementation implements ISwitch{

	@Override
	public void sOn() {
		// TODO Auto-generated method stub
		System.out.println("Tube Light is turned On");
	}

	@Override
	public void sOff() {
		// TODO Auto-generated method stub
		System.out.println("Tube Light is turned off");
		
	}

}
