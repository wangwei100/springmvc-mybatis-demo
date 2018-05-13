package com.demohot.demos.module.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.demohot.demos.module.demo.po.Demo;

public interface DemoDao {

	void insert(Demo po);

	void delete(@Param("id") Long id);

	void update(Demo po);

	Demo get(@Param("id") Long id);

	List<Demo> select(@Param("offset") Integer offset, @Param("limit") Integer limit);

	Long count();

}
