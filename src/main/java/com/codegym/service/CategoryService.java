package com.codegym.service;


import com.codegym.models.Blogs;
import com.codegym.models.Category;
import com.codegym.repository.IBlogRepo;
import com.codegym.repository.ICategoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {
    @Autowired
    ICategoryRepo iCategoryRepo;

    public List<Category> getAll(){
        return (List<Category>) iCategoryRepo.findAll();
    }
    public Category findById(long id){
        return iCategoryRepo.findById(id).get();
    }

    @Repository
    public static class BlogService {
        @Autowired
        IBlogRepo iBlogRepo;

        public Page<Blogs> getAll(Pageable pageable) {
            return  iBlogRepo.findAll(pageable);
        }
        public Page<Blogs> getAllByTitle(Pageable pageable, String title) {
            return  iBlogRepo.findByTitleContaining(pageable,title);
        }

        public void save(Blogs blogs) {
            iBlogRepo.save(blogs);
        }

        public void delete(long id) {
            iBlogRepo.deleteById(id);
        }

        public Optional<Blogs> findById(long id) {
            return iBlogRepo.findById(id);
        }

        public Optional<Blogs> findByTitle(String title) {
            return iBlogRepo.findByTitle(title);
        }

    }
}