package jp.co.pds.PJ0001;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
@Configuration
public class DatasourceConfig {
	@Bean
    public DataSource datasource(){
        DataSource ds = new org.apache.tomcat.jdbc.pool.DataSource();
        ds.setDriverClassName("com.mysql.jdbc.Driver");
        ds.setUrl("jdbc:mysql://localhost:3306/PJ0001?useSSL=false&amp;useUnicode=true&amp;characterEncoding=utf8");
        ds.setUsername("pj0001");
        ds.setPassword("p@ssw0rd");
        return ds;
    }
}
