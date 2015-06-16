package com.cqupt.leetcode.convert;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AtoiTest {

	private Atoi atoi;

	@Before
	public void setUp() throws Exception {
		atoi = new Atoi();
	}

	@Test
	public void testMyAtoi() {
		assertEquals(10, atoi.myAtoi("  010"));
		assertEquals(2147483647, atoi.myAtoi("2147483647"));
		assertEquals(-10, atoi.myAtoi("  -10"));
		assertEquals(2147483646, atoi.myAtoi("2147483646"));
	}

}
