package com.demohot.demos.module.user.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.demohot.demos.module.user.dao.UserDao;
import com.demohot.demos.module.user.po.User;
import com.demohot.demos.module.user.service.UserService;
import com.demohot.demos.module.util.Pagin;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;

	@Override
	@Transactional // 此注解用于配置数据库事务
	public void insert(User po) {
		userDao.insert(po);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		userDao.delete(id);
	}

	@Override
	@Transactional
	public void update(User po) {
		userDao.update(po);
	}

	@Override
	public User get(Long id) {
		return userDao.get(id);
	}

	@Override
	public Pagin<User> find() {
		return find(null, null);
	}

	@Override
	public Pagin<User> find(Integer page, Integer size) {
		Integer offset = null;
		if (null != page && null != size && page > 0 && size > 0) {
			offset = (page - 1) * size;
		}
		List<User> rows = userDao.select(offset, size);
		Long count = userDao.count();
		return Pagin.parse(rows, page, size, count);
	}

}
