package org.avinash;

import java.text.CharacterIterator;
import java.text.StringCharacterIterator;

public class CharIterator {
	public static void main(String... strings) {
		// This is code to practice
		String args = "avinash";
		CharacterIterator iter = new StringCharacterIterator(args);

		while (iter.current() != CharacterIterator.DONE) {
			System.out.println(iter.current());
			iter.next();
		}
	}
}
