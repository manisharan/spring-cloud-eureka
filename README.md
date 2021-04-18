# spring-cloud-eureka
Spring Cloud Eureka Test

1. Bring up the eureka server
2. Bring up the serivce where the service registers itself to the eureka server via the server connection configurations as mentioned in it's yml file
3. Bring up the client, the client also needs to register itself as a service in eureka server via same connection parameters. Once it's registered, it can talk to any other registered service via the serivce name
