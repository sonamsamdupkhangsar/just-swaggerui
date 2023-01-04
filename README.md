# swaggerui
This is my swaggerui app for cataloging OpenApi specs for my rest services.

## Run locally
```
mvn spring-boot:run
```
 
 
## Build Docker image
Build docker image using included Dockerfile.
```
docker build -t imageregistry/swaggerui:1.0 .
``` 

## Push Docker image to repository
```
docker push imageregistry/swaggerui:1.0
```

## Deploy Docker image locally

```
docker run --publish 8080:8080 imageregistry/project-rest-service:1.0
 ```

See swaggerui running at http://localhost:8080 locally.


## Installation on Kubernetes
Use a Helm chart from here @ [sonam-helm-chart](https://github.com/sonamsamdupkhangsar/sonam-helm-chart):

```helm install swaggerui sonam/mychart -f values.yaml --version 0.1.21 --namespace=yournamespace```

