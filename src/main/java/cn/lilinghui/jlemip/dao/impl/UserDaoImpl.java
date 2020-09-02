package cn.lilinghui.jlemip.dao.impl;

import cn.lilinghui.jlemip.bean.User;
import cn.lilinghui.jlemip.dao.UserDao;

public class UserDaoImpl implements UserDao {

	public void save() {
		User user = new User();
		user.setName("llh");
		System.out.println("save..." + user.getName());
	}

}
