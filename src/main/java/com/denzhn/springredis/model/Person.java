package com.denzhn.springredis.model;

import com.redis.om.spring.annotations.Document;
import com.redis.om.spring.annotations.Indexed;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import javax.validation.constraints.NotNull;

@Getter
@Setter
@NoArgsConstructor
@Document
@ApiModel(description = "Person model")
public class Person {
    @Id
    @Indexed
    @ApiModelProperty(value = "Id of the Person Entry")
    private String id;

    @Indexed @NotNull
    @ApiModelProperty(value = "First name of the Person Entry")
    private String firstName;

    @Indexed @NotNull
    @ApiModelProperty(value = "Last name of the Person Entry")
    private String lastName;

    @Indexed @NotNull
    @ApiModelProperty(value = "Age of the Person Entry")
    private Integer age;

    @Indexed @NotNull
    @ApiModelProperty(value = "Address of the Person Entry")
    private Address address;
}
