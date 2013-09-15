package com.exacttarget.fuelsdk.soap;

import com.exacttarget.fuelsdk.ETClient;
import com.exacttarget.fuelsdk.ETSdkException;
import com.exacttarget.fuelsdk.ETBounceEventService;
import com.exacttarget.fuelsdk.ETServiceResponse;
import com.exacttarget.fuelsdk.filter.ETFilter;
import com.exacttarget.fuelsdk.model.ETBounceEvent;

public class ETBounceEventServiceImpl extends ETGetServiceImpl implements
		ETBounceEventService {

	public ETServiceResponse<ETBounceEvent> get(ETClient client)
			throws ETSdkException {
		return super.get(client, ETBounceEvent.class);
	}

	public ETServiceResponse<ETBounceEvent> get(ETClient client, ETFilter filter)
			throws ETSdkException {
		return super.get(client, ETBounceEvent.class, filter);
	}

}
