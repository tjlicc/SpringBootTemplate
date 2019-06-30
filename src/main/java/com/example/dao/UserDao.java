package com.example.dao;

import java.util.List;

import com.example.model.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author licc
 */
@Mapper
public interface UserDao {

	/**
	 * 获取用户列表
	 * @author licc
	 * @since 2019-06-30
	 * @return
	 */
	List<User> queryBySelective();
	
}
