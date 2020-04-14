import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class BubbleSortTest {

	@Test
	public void test() {
		    
			Assert.assertArrayEquals(new int[] {1,2,2,5,6}, BubbleSort.BubbleSort(new int[]{1,6,2,2,5}));
			Assert.assertArrayEquals(new int[] {1,2,3,4,5}, BubbleSort.BubbleSort(new int[]{5,4,3,2,1}));
			Assert.assertArrayEquals(new int[] {1,2,2,2,2}, BubbleSort.BubbleSort(new int[]{2,2,2,2,1}));
	}

}
