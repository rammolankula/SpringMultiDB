# SpringMultiDB
Connection Mutiple Databases by single project
###### Spring Boot DataJPA by default supports connecting with one DataBase connection configuration (AutoConfigured) is given by spring boot only
###### We need to pass inputs using either properties (or) application.yml
###### Example: Driver Class URL and there credentials

###### This time i am implementing the Multiple Databases
###### we need below Objects in order:
<pre>
&#8594;   DataSource
&#8594;   EntityManagerFactory 
&#8594;   TransactionManager  
  </pre>
###### above all need to implement by using beans
###### Required Multiple DataBase Credentials
##### PostgresDB
<pre>
&#8594;  db1.datasource.driver-class-name=org.postgresql.Driver
&#8594;  db1.datasource.jdbc-url=jdbc:postgresql://localhost:5432/Learning 
&#8594;  db1.datasource.username=postgres 
&#8594;  db1.datasource.password=root 
</pre>

##### MySQL
<pre>
&#8594; db2.datasource.driver-class-name=com.mysql.cj.jdbc.Driver 
&#8594; db2.datasource.jdbc-url=jdbc:mysql://localhost:3306/Learning 
&#8594; db2.datasource.username=root 
&#8594; db2.datasource.password=root
</pre>

### Code Flow
<pre>
&#8594; Created a spring boot starter project 
&#8594; Created a application.properties 
&#8594; Created a two different model classes 
&#8594; Written a Repo classes for above model classes 
&#8594; Written a configuration class for two databases
&#8594; Written a service to insert the data 
</pre>


###### Hit below URL to check
<pre>
&#8594; http://localhost:8080/getAllProducts <br>&#8594
&#8594; http://localhost:8080/getAllCustomers <br>&#8594
</pre>





