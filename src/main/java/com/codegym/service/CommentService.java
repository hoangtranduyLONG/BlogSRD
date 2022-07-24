package com.codegym.service;
import com.codegym.models.Comment;
import com.codegym.repository.ICommentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService implements ICommentService {
    @Autowired
    ICommentRepo iCommentRepo;

    @Override
    public List<Comment> findAllByBlogId(long id) {
        return iCommentRepo.findAllByBlogId(id);
    }
}