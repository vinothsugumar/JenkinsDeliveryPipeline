package javaApp;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ArrayFactSumTest {

	@Test
	public void positivetest() {
		int output = ArrayFactSum.sum(new int[] {1,2});
		assertEquals(3, output);
	}
	@Test
	public void negativetest() {
		int output = ArrayFactSum.sum(new int[] {-1,-2});
		assertEquals(0, output);
	}
	@Test
	public void zerotest() {
		int output = ArrayFactSum.sum(new int[] {0});
		assertEquals(1, output);
	}
}
