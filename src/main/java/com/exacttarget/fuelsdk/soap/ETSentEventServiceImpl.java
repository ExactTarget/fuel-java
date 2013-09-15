package com.exacttarget.fuelsdk.soap;

import com.exacttarget.fuelsdk.ETClient;
import com.exacttarget.fuelsdk.ETSdkException;
import com.exacttarget.fuelsdk.ETSentEventService;
import com.exacttarget.fuelsdk.ETServiceResponse;
import com.exacttarget.fuelsdk.filter.ETFilter;
import com.exacttarget.fuelsdk.model.ETSentEvent;

public class ETSentEventServiceImpl extends ETGetServiceImpl implements
		ETSentEventService {

	public ETServiceResponse<ETSentEvent> get(ETClient client)
			throws ETSdkException {
		return super.get(client, ETSentEvent.class);
	}

	public ETServiceResponse<ETSentEvent> get(ETClient client, ETFilter filter)
			throws ETSdkException {
		return super.get(client, ETSentEvent.class, filter);
	}

}
