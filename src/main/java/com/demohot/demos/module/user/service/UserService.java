package com.demohot.demos.module.user.service;

import com.demohot.demos.module.user.po.User;
import com.demohot.demos.module.util.Pagin;

public interface UserService {

	void insert(User po);

	void delete(Long id);

	void update(User po);

	Pagin<User> find();

	Pagin<User> find(Integer page, Integer size);

	User get(Long id);

}
