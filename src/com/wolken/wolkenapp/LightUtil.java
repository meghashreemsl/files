package com.wolken.wolkenapp;

import java.util.*;

import com.wolken.wolkenapp.factory.LightFactory;
import com.wolken.wolkenapp.iswitch.ISwitch;
import com.wolken.wolkenapp.led.LedLightImplementation;
import com.wolken.wolkenapp.tubelight.TubeLightImplementation;

public class LightUtil {
	public static void main(String[] args) {
		
		/*//Abstraction without factory
		ISwitch iSwitch = new LedLightImplementation();
		iSwitch.sOn();
		iSwitch.sOff();
		ISwitch iSwitch1 = new TubeLightImplementation();//TubeLightImpl 
		iSwitch1.sOn();
		iSwitch1.sOff();*/
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the type of light");
		String type = scanner.next();
		ISwitch iSwitch = LightFactory.getLight(type);
		if(iSwitch != null) {
			iSwitch.sOn();
			iSwitch.sOff();
		}
		
	}

}
