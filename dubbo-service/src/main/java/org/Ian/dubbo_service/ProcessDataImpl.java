package org.Ian.dubbo_service;

public class ProcessDataImpl implements IProcessData {

	public String hello(String name) {
		System.out.println(name);
		return "hello : " + name;
	}

}
