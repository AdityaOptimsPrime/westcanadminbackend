package com.example.westcanbackend.controller;

import com.example.westcanbackend.dto.BlogResponse;
import com.example.westcanbackend.service.Blog;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/blogs")
public class BlogController {

    private final Blog blog;

    public BlogController (Blog blog) {
        this.blog = blog;
    }

    @RequestMapping(value = "",method = RequestMethod.GET)
    public ResponseEntity<List<BlogResponse>> fetchAllBlogs(){
        List<BlogResponse> blogResponseList=blog.fetchAllBlog();
        return ResponseEntity.ok().body(blogResponseList);
    }
}
