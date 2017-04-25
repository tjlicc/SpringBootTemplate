package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.ExampleDao;
import com.example.model.Example;

@Service
public class ExampleService {

	@Autowired
	private ExampleDao exampleDao;
	
	public List<Example> getExamples() {
		return exampleDao.queryBySelective();
	}
	
}
