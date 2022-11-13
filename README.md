# spring-testng-openapi
Demo project for Spring+TestNG setup, with model and FeignClient generated based on target system's API

# What's in the box
Target System contains a simple spring boot (web) application, with open API support to generate a specification of its API. It exposes only one endpoint that will be the target of the test
Test System contains a spring boot app with swagger codegen and testNG. This app can generate a client of the Target System API using code generation, then use it in tests.

# How it works
Start up Target System (default on localhost 8080)
- it will expose its API on /v3/api-docs
- it will expose the test endpoint
- if you want, you can generate the API spec in a file instead, using ```mvn integration-test```

In Test System
- first, run ```mvn compile```; beside compiling the code, this will use swagger codegen to generate DTOs and a feign client API for server calls
- see pom.xml for codegen config, and ./target/generated-sources/ for the code generated
- run SampleAPITest.java to see the code in effect
