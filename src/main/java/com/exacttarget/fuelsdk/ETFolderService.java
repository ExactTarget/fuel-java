package com.exacttarget.fuelsdk;

import com.exacttarget.fuelsdk.filter.ETFilter;
import com.exacttarget.fuelsdk.model.ETFolder;

public interface ETFolderService extends ETCrudService {

	public ETServiceResponse<ETFolder> get(ETClient client)
	        throws ETSdkException;
	
	public ETServiceResponse<ETFolder> get(ETClient client, ETFilter filter)
	        throws ETSdkException;
	
	public ETServiceResponse<ETFolder> post(ETClient client, ETFolder folder)
	    	throws ETSdkException;
	
	public ETServiceResponse<ETFolder> patch(ETClient client, ETFolder folder)
			throws ETSdkException;
	
	public ETServiceResponse<ETFolder> delete(ETClient client, ETFolder folder)
	    	throws ETSdkException;

}
