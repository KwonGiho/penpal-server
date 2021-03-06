package com.example.demo.request;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * Created by kwongiho on 2018. 1. 13..
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PostNewRequest {
    private String title;
    private String content;
    private String userId;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(ToStringStyle.MULTI_LINE_STYLE);
    }
}
