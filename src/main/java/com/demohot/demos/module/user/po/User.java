package com.demohot.demos.module.user.po;

import com.demohot.demos.module.user.po.enums.UserType;
import com.demohot.demos.module.util.JsonUtils;

public class User {
	private Long user_id;
	private String username;
	private Integer age;
	private UserType user_type;

	@Override
	public String toString() {
		return JsonUtils.toJsonString(this);
	}

	public Long getUser_id() {
		return user_id;
	}

	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public UserType getUser_type() {
		return user_type;
	}

	public void setUser_type(UserType user_type) {
		this.user_type = user_type;
	}

}