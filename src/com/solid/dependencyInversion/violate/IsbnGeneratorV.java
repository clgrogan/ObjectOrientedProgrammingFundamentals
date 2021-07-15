package com.solid.dependencyInversion.violate;

import java.util.Random;

public class IsbnGeneratorV {
	public String generateNumber() {
        return "13-84356-" + Math.abs(new Random().nextInt());
	}
}
