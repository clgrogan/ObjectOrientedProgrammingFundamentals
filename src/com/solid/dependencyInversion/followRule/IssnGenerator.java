package com.solid.dependencyInversion.followRule;

import java.util.Random;

public class IssnGenerator implements NumberGenerator {

	@Override
	public String generateNumber() {
        return "8-" + Math.abs(new Random().nextInt());
	}

}
