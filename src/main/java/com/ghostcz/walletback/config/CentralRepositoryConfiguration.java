//package com.ghostcz.walletback.config;
//
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.boot.autoconfigure.domain.EntityScan;
//import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Primary;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
//import org.springframework.orm.jpa.JpaTransactionManager;
//import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
//import org.springframework.transaction.PlatformTransactionManager;
//import org.springframework.transaction.annotation.EnableTransactionManagement;
//
//import javax.sql.DataSource;
//
//@Configuration
//@EnableTransactionManagement
//@EntityScan("com.grupodellano.azsign.model")
//@EnableJpaRepositories(
//		basePackages = "com.ghostcz.walletback.repository",
//		entityManagerFactoryRef = "centralEntityManager",
//		transactionManagerRef = "TransactionManager"
//)
//public class CentralRepositoryConfiguration {
//
//	@Bean
//	@Primary
//	@ConfigurationProperties(prefix = "spring.datasource")
//	public DataSourceProperties centralDataSourceProperties() {
//		return new DataSourceProperties();
//	}
//
//	@Bean
//	@Primary
//	public DataSource centralDataSource() {
//		return centralDataSourceProperties().initializeDataSourceBuilder()
//				.type(BasicDataSource.class).build();
//	}
//
//	@Bean(name = "centralEntityManager")
//	@Primary
//	public LocalContainerEntityManagerFactoryBean centralEntityManagerFactory(
//			EntityManagerFactoryBuilder builder) {
//		return builder.dataSource(centralDataSource()).packages(AgreementModel.class)
//				.build();
//	}
//
//	@Bean(name = "TransactionManager")
//	@Primary
//	public PlatformTransactionManager centralTransactionManager(
//			@Qualifier("centralEntityManager") LocalContainerEntityManagerFactoryBean entityManagerFactoryBean) {
//		return new JpaTransactionManager(entityManagerFactoryBean.getObject());
//	}
//
//}
