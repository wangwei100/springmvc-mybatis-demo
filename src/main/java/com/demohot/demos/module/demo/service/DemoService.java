package com.demohot.demos.module.demo.service;

import com.demohot.demos.module.demo.po.Demo;
import com.demohot.demos.module.util.Pagin;

public interface DemoService {

	void insert(Demo po);

	void delete(Long id);

	void update(Demo po);

	Pagin<Demo> find();

	Pagin<Demo> find(Integer page, Integer size);

	Demo get(Long id);

}
