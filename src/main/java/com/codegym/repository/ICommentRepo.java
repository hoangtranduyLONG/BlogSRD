package com.codegym.repository;


import com.codegym.models.Comment;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ICommentRepo extends CrudRepository<Comment,Long> {
    List<Comment> findAllByBlogId(long id);

}