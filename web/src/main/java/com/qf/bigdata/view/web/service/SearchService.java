package com.qf.bigdata.view.web.service;

import com.qf.data.view.core.model.request.SearchDeviceRequest;
import com.qf.data.view.core.model.result.ResultModel;

/**
 * @author Cjl
 * @date 2021/9/1 19:59
 */
public interface SearchService {
    ResultModel searchDevice(SearchDeviceRequest request);
}
