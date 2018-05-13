package com.demohot.demos.module.demo.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.demohot.demos.module.demo.po.Demo;
import com.demohot.demos.module.demo.po.enums.DemoType;
import com.demohot.demos.module.util.Pagin;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:beans-test.xml" })
public class DemoServiceTest {
	private static final Log log = LogFactory.getLog(DemoServiceTest.class);
	@Autowired
	private DemoService userService;

	@Test
	public void insert() {
		Demo po = new Demo();
		po.setTitle("demo001");
		po.setContent("content001");
		po.setDemo_type(DemoType.normal);
		userService.insert(po);
	}

	@Test
	public void delete() {
		Long id = 1L;
		userService.delete(id);
	}

	@Test
	public void update() {
		Demo po = new Demo();
		po.setDemo_id(1L);
		po.setTitle("demo002");
		po.setContent("content002");
		po.setDemo_type(DemoType.vip);
		userService.update(po);
	}

	@Test
	public void get() {
		Long id = 1L;
		Demo po = userService.get(id);
		log.info("\r\n\r\npo=" + po + "\r\n\r\n");
	}

	@Test
	public void find() {
		Pagin<Demo> pagin = userService.find();
		log.info("\r\n\r\npagin=" + pagin + "\r\n\r\n");
	}

}
