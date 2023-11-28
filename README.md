# SpringMultiDB
Connection Mutiple Databases by single project
###### Spring Boot DataJPA by default supports connecting with one DataBase connection configuration (AutoConfigured) is given by spring boot only
###### We need to pass inputs using either properties (or) application.yml
###### Example: Driver Class URL and there credentials

###### This time i am implementing the Multiple Databases
###### we need below Objects in order:
&#8594;   DataSource <br>&#8594
&#8594;   EntityManagerFactory <br>&#8594
&#8594;   TransactionManager  <br>&#8594
###### above all need to implement by using beans
###### Required Multiple DataBase Credentials
##### PostgresDB
<pre>
&#8594;  db1.datasource.driver-class-name=org.postgresql.Driver <br>&#8594
&#8594;  db1.datasource.jdbc-url=jdbc:postgresql://localhost:5432/Learning <br>&#8594
&#8594;  db1.datasource.username=postgres <br>&#8594
&#8594;  db1.datasource.password=root <br>&#8594
</pre>

##### MySQL
&#8594; db2.datasource.driver-class-name=com.mysql.cj.jdbc.Driver <br>&#8594
&#8594; db2.datasource.jdbc-url=jdbc:mysql://localhost:3306/Learning <br>&#8594
&#8594; db2.datasource.username=root <br>&#8594
&#8594; db2.datasource.password=root<br>&#8594

### Code Flow
&#8594; Created a spring boot starter project <br>&#8594
&#8594; Created a application.properties <br>&#8594
&#8594; Created a two different model classes <br>&#8594
&#8594; Written a Repo classes for above model classes <br>&#8594
&#8594; Written a configuration class for two databases<br>&#8594
&#8594; Written a service to insert the data <br>&#8594


###### Hit below URL to check
&#8594; http://localhost:8080/getAllProducts <br>&#8594
&#8594; http://localhost:8080/getAllCustomers <br>&#8594





