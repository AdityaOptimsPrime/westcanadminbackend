package com.example.westcanbackend.service.Implementation;

import com.example.westcanbackend.dto.BlogResponse;
import com.example.westcanbackend.entity.BlogDocument;
import com.example.westcanbackend.repository.BlogRepository;
import com.example.westcanbackend.service.Blog;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BlogImpl implements Blog {

    private final BlogRepository blogRepository;

    public BlogImpl (BlogDocument blogDocument, BlogRepository blogRepository) {
        this.blogRepository = blogRepository;
    }

    @Override
    public List<BlogResponse> fetchAllBlog () {
        List<BlogDocument> blogDocData=blogRepository.findAll();
        List<BlogResponse> blogResponseList=new ArrayList<>();
        for(BlogDocument bg:blogDocData){
            BlogResponse bgRes=new BlogResponse();
            bgRes.setId(bg.getId());
            bgRes.setTitle(bg.getTitle());
            bgRes.setContent(bg.getContent());
            bgRes.setImageUrl(bg.getImageUrl());
            bgRes.setCategories(bg.getCategories());
            bgRes.setTags(bg.getTags());
            bgRes.setAuthorName(bg.getAuthorName());
            bgRes.setAuthorLinkedin(bg.getAuthorLinkedin());
            bgRes.setCreatedAt(bg.getCreatedAt());
            bgRes.setFeatured(bg.isFeatured());
            bgRes.setNewBlog(bg.isNewBlog());
            blogResponseList.add(bgRes);
        }
        return blogResponseList;
    }
}
