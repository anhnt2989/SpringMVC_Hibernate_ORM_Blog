package com.codegym.blogms.repository;

import com.codegym.blogms.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface BlogRepository extends PagingAndSortingRepository<Blog, Long> {
    Page<Blog> findAllByTitleAndWriterAndContent(String title, String writer, String content, Pageable pageable);
}
