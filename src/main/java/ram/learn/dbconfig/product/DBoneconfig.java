package ram.learn.dbconfig.product;

import java.util.HashMap;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(entityManagerFactoryRef = "db1EntiityManagerFactory",
                       transactionManagerRef ="db1TransactionManager",
                       basePackages = "ram.learn.productrepo")
@EntityScan("ram.learn.model")
public class DBoneconfig {
	
	//data source
	@Primary
	@Bean
	@ConfigurationProperties(prefix = "db1.datasource")
	public DataSource dblDatasource() {
		return DataSourceBuilder.create().build();
		
	}
	
	//Entity ManagerFactory
	@Primary
	@Bean
	public LocalContainerEntityManagerFactoryBean db1EntiityManagerFactory(EntityManagerFactoryBuilder emfb) {
		HashMap<String,Object> properties= new HashMap<String, Object>();
		properties.put("hibernate.hbm2ddl.auto", "create");
		properties.putIfAbsent("hibernate.dialect", "org.hibernate.dialect.PostgreSQLDialect");
		
		return emfb.dataSource(dblDatasource())
				.packages("ram.learn.model.product")
				.properties(properties)
				.persistenceUnit("db1")
				.build();

}
   //TxnMager	
	@Primary
	@Bean
	public PlatformTransactionManager db1TransactionManager(
			@Qualifier("db1EntiityManagerFactory") EntityManagerFactory enityManagerFactory) {
		return new JpaTransactionManager(enityManagerFactory);

	}
}
