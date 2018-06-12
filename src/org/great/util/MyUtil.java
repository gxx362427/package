package org.great.util;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyUtil {

	// 声明一个SqlSessionFactory对象
	private static SqlSessionFactory ssf;

	static {

		// 加载配置文件
		String config = "MyConfig.xml";
		Reader reader;

		try {
			reader = Resources.getResourceAsReader(config);
			// 创建SqlSessionFactoryBuilder实例
			SqlSessionFactoryBuilder ssfb = new SqlSessionFactoryBuilder();
			// 获取ssf的值
			ssf = ssfb.build(reader);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	// 建立 连接
	public static SqlSession getSession() {
		return ssf.openSession();
	}

	public static void main(String[] args) {
		System.out.println(MyUtil.getSession());
	}

}
