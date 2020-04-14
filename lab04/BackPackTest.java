

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class BackPackTest {

	@Test
	public void test() {
		Assert.assertArrayEquals(new int[][] {{0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,4,4,4,4,4,4,4,4},
			{0,0,0,4,5,5,5,9,9,9,9},
			{0,0,0,4,5,6,6,9,10,11,11}},BackPack.BackPack_Solution(10, 3, new int[] {3, 4, 5}, new int[] {4, 5, 6}));
	}

}
