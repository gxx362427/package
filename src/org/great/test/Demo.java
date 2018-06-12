package org.great.test;

import org.apache.ibatis.session.SqlSession;
import org.great.bean.User;
import org.great.util.MyUtil;
import org.junit.Test;

public class Demo {

	@Test // 添加用户
	public void addUser() {

		SqlSession session = MyUtil.getSession();

		User u = new User(3, "李四");

		session.insert("addUser", u);

		// 提交
		session.commit();
		// 关闭
		session.close();
	}

	@Test
	public void delUser() {

		SqlSession session = MyUtil.getSession();
		session.delete("byID", 2);
		// 提交
		session.commit();
		// 关闭
		session.close();
	}

	@Test // 查询
	public void fandAllUser() {

		SqlSession session = MyUtil.getSession();
		
		System.out.println(session);
		/*User user=(User) session.selectList("findID",2);
		System.out.println("user"+user);
		// 提交
		session.commit();
		// 关闭
		session.close();*/
	}

}
