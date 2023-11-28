# SpringMultiDB
Connection Mutiple Databases by single project
###### Spring Boot DataJPA by default supports connecting with one DataBase connection configuration (AutoConfigured) is given by spring boot only
###### We need to pass inputs using either properties (or) application.yml
###### Example: Driver Class URL and there credentials

###### This time i am implementing the Multiple Databases
###### we need below Objects in order:
&#8594; DataSource
&#8594; EntityManagerFactory
&#8594; TransactionManager 
###### above all need to implement by using beans
###### Required Multiple DataBase Credentials
##### PostgresDB
&#8594; db1.datasource.driver-class-name=org.postgresql.Driver
&#8594; db1.datasource.jdbc-url=jdbc:postgresql://localhost:5432/Learning
&#8594; db1.datasource.username=postgres
&#8594; db1.datasource.password=root


##### MySQL
<br>&#8594; db2.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
&#8594; db2.datasource.jdbc-url=jdbc:mysql://localhost:3306/Learning
&#8594; db2.datasource.username=root
&#8594; db2.datasource.password=root

### Code Flow
&#8594; Created a spring boot starter project
&#8594; Created a application.properties 
&#8594; Created a two different model classes 
&#8594; Written a Repo classes for above model classes
&#8594; Written a configuration class for two databases
&#8594; Written a service to insert the data


###### Hit below URL to check
&#8594; http://localhost:8080/getAllProducts
&#8594; http://localhost:8080/getAllCustomers





