import static org.junit.Assert.*;

import org.junit.Test;

// n = 1, m = 1
// n = 2, m = 9
// n = 3, m = 36
// n = 4, m = 292


public class ASumTest {
	@Test
	public void test1() {
		assertEquals(2022, ASum.findNb(4183059834009L)); 
	}
	@Test
	public void test2() {
		assertEquals(-1, ASum.findNb(24723578342962L)); 
	}
//	@Test
//	public void test3() {
//		assertEquals(4824, ASum.findNb(135440716410000L)); 
//	}
//	@Test
//	public void test4() {
//		assertEquals(3568, ASum.findNb(40539911473216L)); 
//	}
	
	@Test
	public void test5() {
		assertEquals(1, ASum.findNb(1L)); 
	}
	@Test
	public void test6() {
		assertEquals(2, ASum.findNb(9L)); 
	}
	@Test
	public void test7() {
		assertEquals(3, ASum.findNb(36L)); 
	}
	@Test
	public void test8() {
		assertEquals(4, ASum.findNb(292L)); 
	}

}
