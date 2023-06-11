package com.poly.bee.server.core.admin.model.request;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AdminUpdateMaterialRequest {

    @NotEmpty
    @Size(min = 0, max = 250)
    private String name;
}
