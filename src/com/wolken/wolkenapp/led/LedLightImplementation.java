package com.wolken.wolkenapp.led;

import com.wolken.wolkenapp.iswitch.ISwitch;

public class LedLightImplementation implements ISwitch{

	@Override
	public void sOn() {
		// TODO Auto-generated method stub
		System.out.println("Led light is turned on");
	}

	@Override
	public void sOff() {
		// TODO Auto-generated method stub
		System.out.println("Led light is turned off");
	}
	

}
