package com.kortaggio.crystalball;

import java.util.Random;

public class CrystalBall {
	public String[] mAnswers = {
			"It is certain",
			"It is decidedly so",
			"All signs say YES",
			"The stars are not aligned",
			"My reply is no",
			"It is doubtful",
			"Better not tell you now",
			"Concentrate and ask again",
			"Unable to answer now",
			"It is hard to say"
	};
	
	public String getAnAnswer() {
		// Update the answer label with an answer
		Random randomGenerator = new Random();
		int randomNumber = randomGenerator.nextInt(mAnswers.length);
		return mAnswers[randomNumber];
	}
}
