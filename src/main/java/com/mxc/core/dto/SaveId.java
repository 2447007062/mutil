package com.mxc.core.dto;

import io.swagger.annotations.ApiModelProperty;

public class SaveId {
    @ApiModelProperty(value = "ID（编辑用）",dataType = "from")
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
