package com.example.demo.repository;

import com.example.demo.dto.Post;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;


/**
 * Created by kwongiho on 2018. 1. 13..
 */
@Service
public interface PostRepository extends CrudRepository<Post,Integer> {
}
