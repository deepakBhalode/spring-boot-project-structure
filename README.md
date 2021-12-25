# spring-boot-project-structure
This project comprises of the structure required to develop an application based on Monolithic Architecture using Maven, Spring Boot and Spring Data JPA. 
When I started using Spring boot for developing my side projects. I often used to look for a project structure which can help me to keep codebase clean, readable and maintainable. This motivated me to create this structure.

The developed project structure makes it easy for a complete beginner to get started with application development. It comprises of following layers.
1. config: To keep configuration files like JWT configurations, web security configurations, etc.
2. controller: To keep APIs logic
3. service: To keep business logic
4. repository: To keep database interaction logic
5. exception: To keep custom exceptions. 
6. entity: To keep entities (classes which will persist in the database)
7. dto: To keep DTO's. DTO (Data Transfer Object) are used to tranfer the data from client end to server end. This data is mapped to entity.
8. utility: To keep stuffs which are shared among the various classes.

Still have queries ?
Then feel free to reach me out on LinkedIn or you can email me at deepak.bhalode.sbg@gmail.com
