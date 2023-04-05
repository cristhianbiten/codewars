package sentenceArray;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class testes {
	@Test
	public void validate() {
		assertEquals("Bilal Djaghout", SentenceSmash.smash(new String[] { "Bilal", "Djaghout" }));
	}

	@Test
	public void validateEmpty() {
		assertEquals("", SentenceSmash.smash(new String[] {}));
	}

	@Test
	public void validateOneWord() {
		assertEquals("Bilal", SentenceSmash.smash(new String[] { "Bilal" }));
	}
}
