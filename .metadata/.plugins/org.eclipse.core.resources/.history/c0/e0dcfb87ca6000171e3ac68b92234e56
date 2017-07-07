package com.kaishengit.util;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisUtil {
	//单例
	private static SqlSessionFactory sqlSessionFactory = builderSessionFactory();

	private static SqlSessionFactory builderSessionFactory() {

		try {
			//加载配置文件
			Reader reader = Resources.getResourceAsReader("mybatis.xml");
			//创建sqlSessionFactory
			SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
			return sqlSessionFactoryBuilder.build(reader);
		} catch (IOException e) {
			throw new RuntimeException("读取myBatis配置文件异常",e);
		}
	}
	
	public static SqlSessionFactory getSqlSessionFactory(){
		return sqlSessionFactory;
	}
	
	public static SqlSession getSqlSession(){
		return getSqlSessionFactory().openSession();
	}
}
