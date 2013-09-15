package com.exacttarget.fuelsdk.soap;

import com.exacttarget.fuelsdk.ETClient;
import com.exacttarget.fuelsdk.ETContentAreaService;
import com.exacttarget.fuelsdk.ETSdkException;
import com.exacttarget.fuelsdk.ETServiceResponse;
import com.exacttarget.fuelsdk.filter.ETFilter;
import com.exacttarget.fuelsdk.model.ETContentArea;

public class ETContentAreaServiceImpl extends ETCrudServiceImpl implements
		ETContentAreaService {

	public ETServiceResponse<ETContentArea> get(ETClient client)
			throws ETSdkException {
		return super.get(client,  ETContentArea.class);
	}

	public ETServiceResponse<ETContentArea> get(ETClient client, ETFilter filter)
			throws ETSdkException {
		return super.get(client, ETContentArea.class, filter);
	}

	public ETServiceResponse<ETContentArea> post(ETClient client,
			ETContentArea contentArea) throws ETSdkException {
		return super.post(client, contentArea);
	}

	public ETServiceResponse<ETContentArea> patch(ETClient client,
			ETContentArea contentArea) throws ETSdkException {
		return super.patch(client, contentArea);
	}

	public ETServiceResponse<ETContentArea> delete(ETClient client,
			ETContentArea contentArea) throws ETSdkException {
		return super.delete(client, contentArea);
	}

}
