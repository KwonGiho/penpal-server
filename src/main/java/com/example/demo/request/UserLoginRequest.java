package com.example.demo.request;

import lombok.Data;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * Created by kwongiho on 2018. 1. 15..
 */
@Data
public class UserLoginRequest {
    private String email;
    private String password;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(ToStringStyle.MULTI_LINE_STYLE);
    }
}
