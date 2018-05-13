package com.demohot.demos.module.user.po.enums.handler;

import org.apache.ibatis.type.EnumOrdinalTypeHandler;

import com.demohot.demos.module.user.po.enums.UserType;

public class UserTypeHandler extends EnumOrdinalTypeHandler<UserType> {

	public UserTypeHandler() {
		super(UserType.class);
	}

}
