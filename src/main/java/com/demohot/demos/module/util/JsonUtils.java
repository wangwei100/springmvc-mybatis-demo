package com.demohot.demos.module.util;

import java.util.List;

import com.alibaba.fastjson.JSON;

public class JsonUtils {

	public static <T> T parseObject(String text, Class<T> clazz) {
		return JSON.parseObject(text, clazz);
	}

	public static <T> List<T> parseArray(String text, Class<T> clazz) {
		return JSON.parseArray(text, clazz);
	}

	public static String toJsonString(Object object) {
		return JSON.toJSONString(object);
	}

}
