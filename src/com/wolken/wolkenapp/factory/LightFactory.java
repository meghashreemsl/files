package com.wolken.wolkenapp.factory;

import com.wolken.wolkenapp.iswitch.ISwitch;
import com.wolken.wolkenapp.led.LedLightImplementation;
import com.wolken.wolkenapp.tubelight.TubeLightImplementation;

// Factory class---Object  creation logic
// Factory design pattern- one of the design patterns
public class LightFactory {

	public static ISwitch getLight(String type) {

		if (type.equalsIgnoreCase("tubelight")) {
			return new TubeLightImplementation();
		} else if (type.equalsIgnoreCase("ledlight")) {
			return new LedLightImplementation();
		} else {
			System.out.println("No light found");
		}

		return null;

	}
}