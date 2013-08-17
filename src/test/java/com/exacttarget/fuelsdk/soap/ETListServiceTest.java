package com.exacttarget.fuelsdk.soap;

import org.junit.Before;

import com.exacttarget.fuelsdk.ETSdkException;
import com.exacttarget.fuelsdk.ETServiceTest;
import com.exacttarget.fuelsdk.filter.ETFilterOperators;
import com.exacttarget.fuelsdk.filter.ETSimpleFilter;
import com.exacttarget.fuelsdk.model.ETList;
import com.exacttarget.fuelsdk.model.ETListType;

public class ETListServiceTest extends ETServiceTest<ETList> {
	
	@Before
	public void setUp()
	        throws ETSdkException
    {
		super.setUp();
		service = new ETContentAreaServiceImpl();
		filter = new ETSimpleFilter("listName", ETFilterOperators.EQUALS, "TEST LIST FROM SDK");
		filterUpdated = new ETSimpleFilter("listName", ETFilterOperators.EQUALS, "TEST LIST FROM SDK UPDATED");
		etObject = new ETList();
		etObject.setName("TEST LIST FROM SDK");
		etObject.setListType(ETListType.PUBLIC);
	}

	@Override
	protected void TestPatch(ETList found) throws ETSdkException {
		found.setName("TEST LIST FROM SDK UPDATED");
		
		service.patch(client, found);
		
	}
}
