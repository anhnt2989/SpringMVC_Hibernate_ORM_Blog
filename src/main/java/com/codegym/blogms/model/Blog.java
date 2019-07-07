package com.codegym.blogms.model;

import javax.persistence.*;

@Entity
@Table(name = "blogs")
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;
    private String writer;
    private String title;
    private String content;

    public Blog() {

    }

    public Blog(String writer, String title, String content) {
        this.writer = writer;
        this.title = title;
        this.content = content;
    }

    @Override
    public String toString() {
        return String.format("Blog[id=%d, writer='%w', title='%t', content='%c']", id, writer, title, content);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
