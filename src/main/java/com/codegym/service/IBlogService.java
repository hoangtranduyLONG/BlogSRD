package com.codegym.service;


import com.codegym.models.Blogs;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.ArrayList;

public interface IBlogService {
    public Page<Blogs> findAll(Pageable pageable);

    public ArrayList<Blogs> findAllByCategoryId(long id);

    public Blogs findById(long id);

    public Blogs save(Blogs blog);

    public void remove(long id);

    public Page<Blogs> findAllByTitle(String title,Pageable pageable);


}