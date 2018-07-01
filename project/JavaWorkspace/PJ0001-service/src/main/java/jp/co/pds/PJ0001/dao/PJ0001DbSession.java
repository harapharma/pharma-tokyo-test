package jp.co.pds.PJ0001.dao;

import java.io.FileInputStream;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class PJ0001DbSession {

	private String config = "mybatis-config.xml";

	private String environment = "pj0001";

	private SqlSession session = null;

	/**
	 * コンストラクタ
	 * @param config
	 */
	public PJ0001DbSession() {
		this.session = null;
	}

	/**
	 * コンストラクタ
	 * @param config
	 */
	public PJ0001DbSession(String config) {
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
		this.session.close();
	}
}