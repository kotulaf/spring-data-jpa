Spring Data JPA - Java Persistence API

THIS IS A SIMPLE PROGRAM THAT COULD BE USED AS AN INTRODUCTION INTO SPRING BOOT AND WORKING WITH BASIC DATABASE FUNCTIONALITY

implementations:
	hibernate - most popular one, takes a java object and maps java classes (ORM {object relational mapping}) to databases as tables, so we can perform
		    various operations

Reduces the amount of code that has to be written, gives us a lot of generated queries and access to our databases without having to write a single line of code
The implementation with Spring Boot applications is very simple and intuitive 

First we are starting with a bare Spring Boot project
pom.xml is a maven configuration file with e.g. dependencies, the only ones that i care about are org.springframework.boot and org.postgresql

in application.properties we have already some things set up for us, so that makes it easier:
spring.datasource.url - the url of the server
spring.datasource.username - username to connect to the database, no need to specify
spring.datasource.password - the password to the database account, no need to specify
spring.jpa.hibernate.ddl-auto=create-drop - when the program's stopped everything's dropped
spring.jpa.show-sql=true - about the sql statements that hibernate will generate
spring.jpa.properties.hibernate.dialect = the dialect used, which is Postgres in our case
spring.jpa.properties.hibernate.format_sql=true - we want the SQL to be formatted

We've created a class with some properties, we aren't using Spring Data JPA yet, we'll map it as a table with these annotations: @Entity, @Table
More about these annotations in my first spring boot project

The program is not going to work yet, as we need to determine a primary key, which we can do by using the @Id annotation
we want a BIG SERIAL data for the primary key/id, that's why we will use sequence (in more detail at github/spring-boot-first)  

We can also annotate columns and they have properties too, for example name, updatable, nullable, columnDefinition (what type the variables are)

Inside my @Table annotation I created a uniqueCoinstrant, which takes an array, in which we write e.g. @UniqueConstraint(name="example", columnNames="exampleColumns")
when we create unique constraints we can also do so by typing @Column(name="name", unique=true), however, we used the first method as it gives us reassurance that the 
variable will be named correctly in the table


Spring Data JPA Repository
a concept, which helps us realize our own queries, and use already pre-existing ones such as put, delete and edit
the repository is simply a Data Access Layer, which we will create
there are a few repositories you can extend from, we will use JPARepository, which already extends a couple more
our interface will extend JPARepository, so we can apply our own queries to the existing ones

After confirming that the database works, we can use any of the methods already provided in existing Repos and interact with our database

