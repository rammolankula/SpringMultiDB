package ram.learn.dbconfig.customer;

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
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(entityManagerFactoryRef = "db2EntiityManagerFactory",
                       transactionManagerRef ="db2TransactionManager",
                       basePackages = "ram.learn.customerrepo")
@EntityScan("ram.learn.model")
public class DBtwoconfig {
	//data source
		@Bean
		@ConfigurationProperties(prefix = "db2.datasource")
		public DataSource db2Datasource() {
			return DataSourceBuilder.create().build();
			
		}
		
		//Entity ManagerFactory
		@Bean
		public LocalContainerEntityManagerFactoryBean db2EntiityManagerFactory(EntityManagerFactoryBuilder emfb) {
			HashMap<String,Object> properties= new HashMap<>();
			properties.put("hibernate.hbm2ddl.auto", "create");
			properties.putIfAbsent("hibernate.dialect", "org.hibernate.dialect.MySQL5Dialect");
			
			return emfb.dataSource(db2Datasource())
					.packages("ram.learn.model.customer")
					.properties(properties)
					.persistenceUnit("db2")
					.build();

	}
	   //TxnMager	
		@Bean
		public PlatformTransactionManager db2TransactionManager(
				@Qualifier("db2EntiityManagerFactory") EntityManagerFactory enityManagerFactory) {
			return new JpaTransactionManager(enityManagerFactory);

		}
	}
