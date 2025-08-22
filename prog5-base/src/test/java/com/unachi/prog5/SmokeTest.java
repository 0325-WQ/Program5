package com.unachi.prog5;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;


class SmokeTest {
	@Test
	void environmentlsOK() {
		assertTrue(System.getProperty("java.version").startsWith("17"));
	}

}
