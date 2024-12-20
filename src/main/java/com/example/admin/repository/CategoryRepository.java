package com.example.admin.repository;

import com.example.admin.entity.CategoryDocument;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CategoryRepository extends MongoRepository<CategoryDocument,String> {

}
