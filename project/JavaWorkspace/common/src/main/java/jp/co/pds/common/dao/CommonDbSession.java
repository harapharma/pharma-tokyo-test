package jp.co.pds.common.dao;

import java.io.FileInputStream;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class CommonDbSession {

	private String config = "mybatis-config.xml";

	private String environment = "common";

	private SqlSession session = null;

	/**
	 * コンストラクタ
	 * @param config
	 */
	public CommonDbSession() {
		this.session = null;
	}

	/**
	 * コンストラクタ
	 * @param config
	 */
	public CommonDbSession(String config) {
		this();
		this.config = config;
	}

	public SqlSession open() {
		try {
			InputStream is = Resources.getResourceAsStream(this.config);
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is, this.environment);
			this.session = sqlSessionFactory.openSession();
			return this.session;
		} catch (Exception e) {
			this.session = null;
			e.printStackTrace();
		}
		return null;
	}

	public void close() {
		if (this.session != null) {
			this.session.close();
		}
	}
}