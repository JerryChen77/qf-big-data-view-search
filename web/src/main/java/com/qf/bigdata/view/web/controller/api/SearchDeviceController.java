package com.qf.bigdata.view.web.controller.api;

import com.qf.bigdata.view.web.service.SearchService;
import com.qf.data.view.core.model.request.SearchDeviceRequest;
import com.qf.data.view.core.model.result.ResultModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Cjl
 * @date 2021/9/1 19:56
 */
@RestController
@RequestMapping("/search")
public class SearchDeviceController {

    @Autowired
    private SearchService searchService;

    @RequestMapping("/device")
    public ResultModel searchDevice(@RequestBody SearchDeviceRequest request){
        ResultModel resultModel = searchService.searchDevice(request);
        System.out.println("resultModel.getData().toString() = " + resultModel.getData().toString());
        return searchService.searchDevice(request);
    }

}
