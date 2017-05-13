package work;

import com.google.common.base.Strings;

import lombok.Getter;

/**
 * Describes a chunk of work for service to process.
 */
public class Work {

	@Getter private final long fromTimestamp;
	@Getter private final long toTimestamp;
	@Getter private final String searchTerm;

	public Work(final long fromTimestamp, final long toTimestamp, final String searchTerm) {
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
