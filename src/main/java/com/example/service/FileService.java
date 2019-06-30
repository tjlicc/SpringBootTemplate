package com.example.service;

import com.example.dao.FileDao;
import com.example.model.File;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author licc 
 */
@Service
public class FileService {
    
    @Autowired
    private FileDao fileDao;
    
    public List<File> getFileList() {
        return fileDao.queryFileList();
    }
    
}
