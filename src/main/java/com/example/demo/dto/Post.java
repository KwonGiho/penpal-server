package com.example.demo.dto;

import lombok.Data;


/**
 * Created by kwongiho on 2018. 1. 13..
 */
@Data
public class Post {
    private int postId;
    private String title;
    private String content;
    private long writtenDate;
    private String userId;
}
