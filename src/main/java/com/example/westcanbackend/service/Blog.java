package com.example.westcanbackend.service;

import com.example.westcanbackend.dto.BlogResponse;

import java.util.List;

public interface Blog {
    public List<BlogResponse> fetchAllBlog();
}
