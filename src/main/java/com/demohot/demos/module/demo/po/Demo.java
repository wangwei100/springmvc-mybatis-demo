package com.demohot.demos.module.demo.po;

import com.demohot.demos.module.demo.po.enums.DemoType;
import com.demohot.demos.module.util.JsonUtils;

public class Demo {
	private Long demo_id;
	private String title;
	private String content;
	private DemoType demo_type;

	@Override
	public String toString() {
		return JsonUtils.toJsonString(this);
	}

	public Long getDemo_id() {
		return demo_id;
	}

	public void setDemo_id(Long demo_id) {
		this.demo_id = demo_id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public DemoType getDemo_type() {
		return demo_type;
	}

	public void setDemo_type(DemoType demo_type) {
		this.demo_type = demo_type;
	}

}
