package com.qf.bigdata.view.web.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.qf.bigdata.view.web.service.SearchService;
import com.qf.data.view.core.model.request.SearchDeviceRequest;
import com.qf.data.view.core.model.result.ResultModel;
import com.qf.data.view.facade.api.SearchFacade;
import com.qf.data.view.facade.request.SearchDeviceModelRequest;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

/**
 * @author Cjl
 * @date 2021/9/1 20:01
 */
@Service
public class SearchServiceImpl implements SearchService {

    @Reference
    private SearchFacade searchFacade;


    @Override
    public ResultModel searchDevice(SearchDeviceRequest request) {
        SearchDeviceModelRequest searchDeviceModelRequest = new SearchDeviceModelRequest();
        BeanUtils.copyProperties(request,searchDeviceModelRequest);
        ResultModel resultModel = searchFacade.searchDevice(searchDeviceModelRequest);
        return resultModel;
    }
}
