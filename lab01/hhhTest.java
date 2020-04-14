package st3017218090;


import org.junit.Assert;
import org.junit.Test;

public class hhhTest {

	@Test
	public void test() {
		Assert.assertEquals("yes", hhh.jud(1));
		Assert.assertEquals("yes", hhh.jud(2));
		Assert.assertEquals("yes", hhh.jud(3));
		Assert.assertEquals("no",  hhh.jud(4));
		Assert.assertEquals("yes", hhh.jud(5));
		Assert.assertEquals("yes", hhh.jud(6));
		Assert.assertEquals("yes", hhh.jud(7));
		Assert.assertEquals("yes", hhh.jud(50));
	}

	

	
}
