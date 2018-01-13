package com.example.demo.response;

import lombok.*;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * Created by kwongiho on 2018. 1. 13..
 */

@Getter
@Setter
public class PenpalResponse<T> {
    private int code;
    private String status;
    private T data;

    public PenpalResponse() {
    }

    public PenpalResponse(int code, String status) {
        this.code = code;
        this.status = status;
    }

    public PenpalResponse(int code, String status, T data) {
        this.code = code;
        this.status = status;
        this.data = data;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(ToStringStyle.MULTI_LINE_STYLE);
    }
}
