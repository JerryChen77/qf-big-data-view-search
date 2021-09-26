package com.qf.data.view.facade.api;

import com.qf.data.view.core.model.result.ResultModel;
import com.qf.data.view.facade.request.SearchDeviceModelRequest;

/**
 * @author Cjl
 * @date 2021/9/1 20:06
 */
public interface SearchFacade {

    ResultModel searchDevice(SearchDeviceModelRequest request);

}
