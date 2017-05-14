package appraisers;

import appraisers.AppraisedWork;

import org.testng.Assert;
import org.testng.annotations.Test;

/** Tests for AppraisedWork class. */
public class AppraisedWorkTest {

  /** Tests regular constructor. */
  @Test
  public void testAppraisedWorkConstructor() {
    final AppraisedWork testWork = new AppraisedWork(0L, Long.MAX_VALUE, "test");
    Assert.assertEquals(testWork.getFromTimestamp(), 0L);
    Assert.assertEquals(testWork.getToTimestamp(), Long.MAX_VALUE);
    Assert.assertEquals(testWork.getSearchTerm(), "test");
  }

  /** Tests passing various illegal arguments to the constructor. */
  @Test
  public void testAppraisedWorkConstructorIllegalArguments() throws Exception {
    // Tests fromTimestamp that is larger then toTimestamp
    try {
      new AppraisedWork(100L, 10L, "test");
      Assert.fail("Should've failed by now.");
    } catch (final IllegalArgumentException e) { // NOPMD
      // All is good.
    }

    // Tests null searchTerm
    try {
      new AppraisedWork(10L, 100L, null);
      Assert.fail("Should've failed by now.");
    } catch (final IllegalArgumentException e) { // NOPMD
      // All is good.
    }

    // Tests empty searchTerm
    try {
      new AppraisedWork(10L, 100L, "");
      Assert.fail("Should've failed by now.");
    } catch (final IllegalArgumentException e) { // NOPMD
      // All is good.
    }
  }
}
