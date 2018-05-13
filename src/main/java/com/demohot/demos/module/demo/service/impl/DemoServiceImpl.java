package com.demohot.demos.module.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.demohot.demos.module.demo.dao.DemoDao;
import com.demohot.demos.module.demo.po.Demo;
import com.demohot.demos.module.demo.service.DemoService;
import com.demohot.demos.module.util.Pagin;

@Service
public class DemoServiceImpl implements DemoService {

	@Autowired
	private DemoDao userDao;

	@Override
	@Transactional // 此注解用于配置数据库事务
	public void insert(Demo po) {
		userDao.insert(po);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		userDao.delete(id);
	}

	@Override
	@Transactional
	public void update(Demo po) {
		userDao.update(po);
	}

	@Override
	public Demo get(Long id) {
		return userDao.get(id);
	}

	@Override
	public Pagin<Demo> find() {
		return find(null, null);
	}

	@Override
	public Pagin<Demo> find(Integer page, Integer size) {
		Integer offset = null;
		if (null != page && null != size && page > 0 && size > 0) {
			offset = (page - 1) * size;
		}
		List<Demo> rows = userDao.select(offset, size);
		Long count = userDao.count();
		return Pagin.parse(rows, page, size, count);
	}
}
