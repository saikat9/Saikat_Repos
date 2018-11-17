package com.ecomm.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableTransactionManagement
@ComponentScan("com.ecomm")
public class DBConfig {

	
	//Method which will return H2 data source to be used as bean
	@Bean(name="dataSource")
	public DataSource getH2DataSource()
	{
		DriverManagerDataSource dataSource=new DriverManagerDataSource();
		dataSource.setDriverClassName("org.h2.Driver");
		dataSource.setUrl("jdbc:h2:tcp://localhost/~/S190127");
		dataSource.setUsername("root");
		System.out.println("--Data source object created--");
		return dataSource;
	}
	
	//Method which will create local session factory builder  to be used as bean
	@Bean(name="sessionFactory")
	public SessionFactory getSessionFactory()
	{
		Properties hibernateProp = new Properties();
		hibernateProp.put("hibernate.hbm2ddl.auto","update");
		hibernateProp.put("hibernate.dialect","org.hibernate.dialect.H2Dialect");
		LocalSessionFactoryBuilder factory = new LocalSessionFactoryBuilder(getH2DataSource());
		factory.addProperties(hibernateProp);
		System.out.println("--Session factory object created--");
		return factory.buildSessionFactory();
		
		
	}
	
	//Method to create transaction manager to be used as bean
	@Bean(name="txManager")
	public HibernateTransactionManager getTransactionManager(SessionFactory sessionFactory)
	{
	System.out.println("--Transaction manager object created--");	
	return new HibernateTransactionManager(sessionFactory);
	}
}
