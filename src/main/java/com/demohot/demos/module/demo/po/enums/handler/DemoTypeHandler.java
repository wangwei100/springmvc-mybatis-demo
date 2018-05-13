package com.demohot.demos.module.demo.po.enums.handler;

import org.apache.ibatis.type.EnumOrdinalTypeHandler;

import com.demohot.demos.module.demo.po.enums.DemoType;

public class DemoTypeHandler extends EnumOrdinalTypeHandler<DemoType> {

	public DemoTypeHandler() {
		super(DemoType.class);
	}

}
