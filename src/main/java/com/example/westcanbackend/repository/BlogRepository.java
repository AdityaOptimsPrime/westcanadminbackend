package com.example.westcanbackend.repository;

import com.example.westcanbackend.entity.BlogDocument;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlogRepository extends MongoRepository<BlogDocument, ObjectId> {

}
