package numbers;

import org.junit.Test;

import org.junit.Assert;

public class BiggerAndSmallerTest {

	@Test
	public void numbersInIncreaseOrder() {
		BiggerAndSmaller algotrithm = new BiggerAndSmaller();

		algotrithm.find(new int[] { 1, 3, 4, 6, 8, 12, 19 });
		Assert.assertEquals(19, algotrithm.getBigger());
		Assert.assertEquals(1, algotrithm.getSmaller());
	}

	@Test
	public void numbersInDecreasingOrder() {
		BiggerAndSmaller algotrithm = new BiggerAndSmaller();

		algotrithm.find(new int[] { 19, 12, 8, 6, 4, 3, 1 });
		Assert.assertEquals(19, algotrithm.getBigger());
		Assert.assertEquals(1, algotrithm.getSmaller());
	}

	@Test
	public void numbersInAnyOrder() {
		BiggerAndSmaller algotrithm = new BiggerAndSmaller();

		algotrithm.find(new int[] { 3, 4, 6, 7, 1, 19, 7 });
		Assert.assertEquals(19, algotrithm.getBigger());
		Assert.assertEquals(1, algotrithm.getSmaller());
	}

	@Test
	public void onlyOneNumber() {
		BiggerAndSmaller algotrithm = new BiggerAndSmaller();

		algotrithm.find(new int[] { 19 });
		Assert.assertEquals(19, algotrithm.getBigger());
		Assert.assertEquals(19, algotrithm.getSmaller());
	}
	
	@Test
	public void repeatedNumbers(){
BiggerAndSmaller algotrithm = new BiggerAndSmaller();
		
		algotrithm.find(new int[]{3,4,1,6,8,1,2,19,9,19});
		Assert.assertEquals(19, algotrithm.getBigger());
		Assert.assertEquals(1, algotrithm.getSmaller());
		
	}
}
