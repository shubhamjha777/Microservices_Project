# Microservices_Project
This is backend of an ecommerce application which is in the form of microservices architecture. 
It has three main microservices 
1) Product Service
2) Order Service 
3) Inventory Service
Product service use mongoDB as the database whereas order and inventory service use MySQL database. WebClient is used as the HTTP client to communicate between microservices, order service and Inventory service talks with each other synchronously. Netflix Eureka is used as the discovery server to avoid hardcoding the uri to locate services. This app also has an API gateway which is build by using spring cloud API gateway and Keycloak is used as a tool for authorization.


![application](https://user-images.githubusercontent.com/67336957/216161473-55ba494b-dc5d-4628-af0d-088cb068dc17.png)


![Untitled drawing](https://user-images.githubusercontent.com/67336957/215351528-4b274ae7-ad8a-4896-9871-a29756dd157c.jpg)
