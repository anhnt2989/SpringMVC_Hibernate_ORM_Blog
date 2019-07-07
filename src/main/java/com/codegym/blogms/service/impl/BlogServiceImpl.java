package com.codegym.blogms.service.impl;

import com.codegym.blogms.model.Blog;
import com.codegym.blogms.repository.BlogRepository;
import com.codegym.blogms.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BlogServiceImpl implements BlogService {
    @Autowired
    private BlogRepository blogRepository;

    @Override
    public List<Blog> findAll() {
        return blogRepository.findAll();
    }

    @Override
    public Blog findById(Long id) {
        return blogRepository.findById(id);
    }

    @Override
    public void save(Blog model) {
        blogRepository.save(model);
    }

    @Override
    public void remove(Long id) {
        blogRepository.remove(id);
    }
}
