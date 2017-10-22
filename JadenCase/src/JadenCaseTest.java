import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class JadenCaseTest {

	/*
	 * " We Could Be Never Endless " -Syre
	 * I've Been Telling Everyone That I'm Legally Crazy And That I'm Obligated To Tell Them.
	 * London MSFTSmeetUp Was On Another Level, Remember Everything I Said Guys Until Next Time
	 * October 1st MSFTSmeetUp Paris
	 * That Moment When You, "Whip" So Hard, You Tear A Ligament In Your Neck.
	 * That moment when you, "whip" so hard, you tear a ligament in your neck.
	 */
	JadenCase jadenCase = new JadenCase();
	
	public static final String NOT_EQUAL = 
			"toJadenCase doesn't return a valide JadenCase String! try again please :)";
	
	@Test
	public void test() {
		assertEquals(NOT_EQUAL, jadenCase.toJadenCase("most trees are blue"), "Most Trees Are Blue");
	}
	
	@Test
	public void testNullArg() {
		assertNull("Must return null when the arg is null", jadenCase.toJadenCase(null));
	}
	
	@Test
	public void testEmptyArg() {
		assertNull("Must return null when the arg is null", jadenCase.toJadenCase(""));
	}
	
	@Test
	public void testQuotes() {
		assertEquals(NOT_EQUAL,
				jadenCase.toJadenCase(
				"That moment when you, \"whip\" so hard, you tear a ligament in your neck."),
				"That Moment When You, \"Whip\" So Hard, You Tear A Ligament In Your Neck.");
	}

	@Test
	public void testCapsNums() {
		assertEquals(NOT_EQUAL,
				jadenCase.toJadenCase(
				"october 1st mSFTSmeetUp paris"),
				"October 1st MSFTSmeetUp Paris");
	}

}
