package appraisers;

import com.google.common.base.Strings;

import lombok.Getter;

/**
 * Describes appraised chunk of work for service to process.
 */
public class AppraisedWork {

  @Getter private final long fromTimestamp;
  @Getter private final long toTimestamp;
  @Getter private final String searchTerm;

  /**
   * Constructs AppraisedWork via search term and from and to timestamp.
   *
   * @param fromTimestamp From timestamp range bound.
   * @param toTimestamp To timestamp range bound.
   * @param searchTerm Term to search for.
   */
  public AppraisedWork(final long fromTimestamp, final long toTimestamp, final String searchTerm) {
    if (fromTimestamp >= toTimestamp) {
      throw new IllegalArgumentException("fromTimestamp must be strictly less then toTimestamp.");
    }

    if (Strings.isNullOrEmpty(searchTerm)) {
      throw new IllegalArgumentException("searchTerm must not be null or empty.");
    }

    this.fromTimestamp = fromTimestamp;
    this.toTimestamp = toTimestamp;
    this.searchTerm = searchTerm;
  }

}
