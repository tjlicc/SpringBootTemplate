package com.example.dao;

import com.example.model.File;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author licc 
 */
@Component
public class FileDao {
    
    @Autowired
    private MongoTemplate mongoTemplate;
    
    private String COLLECTION_NAME = "file";
    
    public List<File> queryFileList() {
        Query query =  new Query();
        return mongoTemplate.find(query, File.class, COLLECTION_NAME);
    }
    
}
