package com.codegym.service;

import com.codegym.models.Comment;

import java.util.List;

public interface ICommentService {
    public List<Comment> findAllByBlogId(long id);
}