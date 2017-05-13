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
