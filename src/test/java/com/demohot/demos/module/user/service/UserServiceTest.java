package com.demohot.demos.module.user.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.demohot.demos.module.user.po.User;
import com.demohot.demos.module.user.po.enums.UserType;
import com.demohot.demos.module.util.Pagin;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:beans-test.xml" })
public class UserServiceTest {
	private static final Log log = LogFactory.getLog(UserServiceTest.class);
	@Autowired
	private UserService userService;

	@Test
	public void insert() {
		User po = new User();
		po.setUsername("tom");
		po.setAge(18);
		po.setUser_type(UserType.normal);
		userService.insert(po);
	}

	@Test
	public void delete() {
		Long id = 1L;
		userService.delete(id);
	}

	@Test
	public void update() {
		User po = new User();
		po.setUser_id(1L);
		po.setUsername("jim");
		po.setAge(19);
		po.setUser_type(UserType.vip);
		userService.update(po);
	}

	@Test
	public void get() {
		Long id = 1L;
		User po = userService.get(id);
		log.info("\r\n\r\npo=" + po + "\r\n\r\n");
	}

	@Test
	public void find() {
		Pagin<User> pagin = userService.find();
		log.info("\r\n\r\npagin=" + pagin + "\r\n\r\n");
	}

}
