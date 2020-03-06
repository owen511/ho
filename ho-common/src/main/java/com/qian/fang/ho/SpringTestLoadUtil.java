/**
 * @Title: SpringTestLoadUtil.java
 * @Copyright (C) 2020 前坊软件
 * @Description:
 * @Revision History:
 * @Revision 1.0 2020年2月28日 下午3:46:59
 * @author owen
 */
 

package com.qian.fang.ho;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Srping测试加载工具类
 * @ClassName:SpringTestLoadUtil
 * @Description:
 * @author owen 于 2020年2月28日 下午3:46:59
 */

public class SpringTestLoadUtil {
	private static String conf = "classpath:applicationContext.xml";
	private static ApplicationContext context = null;
	//加载公共spring配置文件
	static {
		context = new ClassPathXmlApplicationContext(conf);
	}
	
	/**
	 * 获取上下文.
	 * @return
	 */
	public static ApplicationContext getAppContext() {
		return context;
	}
}
