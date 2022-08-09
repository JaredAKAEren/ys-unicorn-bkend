package com.origami.unicorn.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel("用户实体类")
public class User {
    @ApiModelProperty(value = "姓名", required = true, example = "王小美")
    private String name;

    @ApiModelProperty(value = "年龄", required = true, example = "22")
    private Integer age;
}
