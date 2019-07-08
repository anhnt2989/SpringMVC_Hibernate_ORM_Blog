package com.codegym.blogms.service.impl;

import com.codegym.blogms.model.Blog;
import com.codegym.blogms.repository.BlogRepository;
import com.codegym.blogms.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


public class BlogServiceImpl implements BlogService {
    @Autowired
    private BlogRepository blogRepository;

    @Override
    public Page<Blog> findAllByTitleAndWriterAndContent(String title, String writer, String content, Pageable pageable) {
        return blogRepository.findAllByTitleAndWriterAndContent(title, writer, content, pageable);
    }

    @Override
    public Page<Blog> findAll(Pageable pageable) {
        return blogRepository.findAll(pageable);
    }

    @Override
    public Blog findById(Long id) {
        return blogRepository.findOne(id);
    }

    @Override
    public void save(Blog blog) {
        blogRepository.save(blog);
    }

    @Override
    public void remove(Long id) {
        blogRepository.delete(id);
    }
}
