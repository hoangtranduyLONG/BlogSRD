package com.codegym.service;


import com.codegym.models.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ICategoryService {
    public List<Category> findAll();

    public Category findById(long id);
}