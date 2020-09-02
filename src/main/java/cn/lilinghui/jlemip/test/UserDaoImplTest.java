package cn.lilinghui.jlemip.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.lilinghui.jlemip.dao.UserDao;
import cn.lilinghui.jlemip.dao.impl.UserDaoImpl;

public class UserDaoImplTest {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserDao userDao = applicationContext.getBean(UserDaoImpl.class);
		userDao.save();
	}
}
