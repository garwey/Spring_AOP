package service;


/**
 * Description: <br/>
 * 网站: <a href="http://www.crazyit.org">疯狂Java联盟</a> <br/>
 * Copyright (C), 2001-2016, Yeeku.H.Lee <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name: <br/>
 * Date:
 * 
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 1.0
 */
public class HelloImpl implements Hello {
	public void foo() {
		System.out.println("执行Hello组件的foo()方法");
	}

	public int addUser(String name, String pass) {
		System.out.println("执行Hello组件的addUser添加用户：" + name);
		if (name.length() < 3 || name.length() > 10) {
			throw new IllegalArgumentException(
					"the length of name must be longer than 3 and shorter than 10!");
		}
		return 20;
	}
}
