package com.poly.bee.server.core.admin.model.request;

import com.poly.bee.server.core.common.base.PageableRequest;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AdminSoleHeightRequest extends PageableRequest {

    private String search;

}
