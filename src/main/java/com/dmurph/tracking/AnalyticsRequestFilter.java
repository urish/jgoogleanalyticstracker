package com.dmurph.tracking;

public interface AnalyticsRequestFilter {
	/**
	 * Filters the given analytics request.
	 * @param request The request to filter. You may modify the passed request.
	 * @return true if the request should continue, false to cancel it.
	 */
	public boolean filterRequest(AnalyticsRequestData request);
}
