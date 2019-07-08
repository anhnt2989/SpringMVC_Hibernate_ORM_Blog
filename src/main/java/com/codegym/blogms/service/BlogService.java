package com.codegym.blogms.service;

import com.codegym.blogms.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


public interface BlogService {
    Page<Blog> findAll(Pageable pageable);

    Page<Blog> findAllByTitleAndWriterAndContent(String title, String writer, String content, Pageable pageable);

    Blog findById(Long id);

    void save(Blog blog);

    void remove(Long id);
}
