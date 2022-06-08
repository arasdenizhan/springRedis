package com.denzhn.springredis.model;

import com.redis.om.spring.annotations.Indexed;
import com.redis.om.spring.annotations.Searchable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@ApiModel(description = "Address Embedded Model")
public class Address {
    @Indexed @Searchable
    @ApiModelProperty(value = "City of the Address Embedded Model, it is searchable.")
    private String city;

    @Indexed
    @ApiModelProperty(value = "PostalCode of the Address Embedded Model")
    private String postalCode;

    @Indexed
    @ApiModelProperty(value = "Country of the Address Embedded Model")
    private String country;
}
