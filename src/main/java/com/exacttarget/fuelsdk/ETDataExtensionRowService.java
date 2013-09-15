package com.exacttarget.fuelsdk;

import java.util.List;

import com.exacttarget.fuelsdk.filter.ETFilter;
import com.exacttarget.fuelsdk.model.ETDataExtensionRow;

public interface ETDataExtensionRowService extends ETCrudService {

	public ETServiceResponse<ETDataExtensionRow> get(ETClient client, String dataExtensionCustomerKey, List<String> columns)
			throws ETSdkException;
	
	public ETServiceResponse<ETDataExtensionRow> get(ETClient client, String dataExtensionCustomerKey, List<String> columns, ETFilter filter)
	        throws ETSdkException;
	
	public ETServiceResponse<ETDataExtensionRow> post(ETClient client, ETDataExtensionRow row)
	    	throws ETSdkException;
	
    public ETServiceResponse<ETDataExtensionRow> patch(ETClient client, ETDataExtensionRow row)
    		throws ETSdkException;
    
    public ETServiceResponse<ETDataExtensionRow> delete(ETClient client, ETDataExtensionRow row)
	    	throws ETSdkException;
}
