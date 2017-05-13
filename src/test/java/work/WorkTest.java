package work;

import org.testng.Assert;
import org.testng.annotations.Test;

/** Tests for Work class. */
public class WorkTest {

	/** Tests regular constructor. */
	@Test
	public void testConstructor() {
		final Work testWork = new Work(0L, Long.MAX_VALUE, "test");
		Assert.assertEquals(testWork.getFromTimestamp(), 0L);
		Assert.assertEquals(testWork.getToTimestamp(), Long.MAX_VALUE);
		Assert.assertEquals(testWork.getSearchTerm(), "test");
	}

	/** Tests passing various illegal arguments to the constructor. */
	@Test
	public void testIllegalArguments() throws Exception {
		// Tests fromTimestamp that is larger then toTimestamp
		try {
			new Work(100L, 10L, "test");
			throw new Exception("Should've failed by now.");
		} catch (final IllegalArgumentException e) {
			// All is good.
		}

		// Tests null searchTerm
		try {
			new Work(10L, 100L, null);
			throw new Exception("Should've failed by now.");
		} catch (final IllegalArgumentException e) {
			// All is good.
		}

		// Tests empty searchTerm
		try {
			new Work(10L, 100L, "");
			throw new Exception("Should've failed by now.");
		} catch (final IllegalArgumentException e) {
			// All is good.
		}
	}
}
