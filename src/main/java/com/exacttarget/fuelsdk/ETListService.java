//
// ETListService.java -
//
//      x
//
// Copyright (C) 2013 ExactTarget
//
// Author(s): Ian Murdock <imurdock@exacttarget.com>
//

package com.exacttarget.fuelsdk;

import com.exacttarget.fuelsdk.model.ETList;

public interface ETListService extends ETCrudService
{
    public ETServiceResponse<ETList> get(ETClient client)
        throws ETSdkException;
}
