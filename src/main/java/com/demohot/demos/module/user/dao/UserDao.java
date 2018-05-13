package com.demohot.demos.module.user.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.demohot.demos.module.user.po.User;

public interface UserDao {

	void insert(User po);

	void delete(@Param("id") Long id);

	void update(User po);

	User get(@Param("id") Long id);

	List<User> select(@Param("offset") Integer offset, @Param("limit") Integer limit);

	Long count();

}
