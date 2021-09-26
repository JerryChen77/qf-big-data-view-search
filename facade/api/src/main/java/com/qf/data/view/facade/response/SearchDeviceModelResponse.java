package com.qf.data.view.facade.response;

import lombok.Data;

import java.io.Serializable;

/**
 * @author Cjl
 * @date 2021/9/1 20:17
 */
@Data
public class SearchDeviceModelResponse implements Serializable {

    private Long deviceId;
    private String deviceName;
    private String lastActiveTime;

}
