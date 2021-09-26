package com.qf.data.view.facade.request;

import lombok.Data;

import java.io.Serializable;

/**
 * @author Cjl
 * @date 2021/9/1 20:04
 */
@Data
public class SearchDeviceModelRequest implements Serializable {


    private Long deviceId;
    private String deviceName;

}
