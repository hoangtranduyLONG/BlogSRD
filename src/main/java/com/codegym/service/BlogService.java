package com.codegym.service;

import com.codegym.models.Blogs;
import com.codegym.repository.IBlogRepo;
import com.codegym.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class BlogService implements IBlogService {
    @Autowired
    IBlogRepo iBlogRepo;

    @Override
    public Page<Blogs> findAll(Pageable pageable) {
        return iBlogRepo.findAll(pageable);
    }

    @Override
    public ArrayList<Blogs> findAllByCategoryId(long id) {
        return (ArrayList<Blogs>) iBlogRepo.findAllByCategoryId(id);
    }

    @Override
    public Blogs findById(long id) {
        return iBlogRepo.findById(id).get();
    }

    @Override
    public Blogs save(Blogs blog) {
        return iBlogRepo.save(blog);
    }

    @Override
    public void remove(long id) {
        iBlogRepo.deleteById(id);
    }

    @Override
    public Page<Blogs> findAllByTitle(String title, Pageable pageable) {
        return iBlogRepo.findAllByTitleContaining(title,pageable);
    }
}