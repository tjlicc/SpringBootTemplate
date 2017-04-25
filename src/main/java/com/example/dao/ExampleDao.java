package com.example.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.model.Example;

@Mapper
public interface ExampleDao {
	
	List<Example> queryBySelective();
	
}
