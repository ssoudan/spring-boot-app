# spring-boot-app

Skeleton for a Spring Boot App with few extra: 
- info endpoint with git info
- docker packaging
- swagger
- example of HealthIndicator(s)

## Import to Intellij IDEA

	~ $ gradle idea

	then open project from IDEA.

## Build and Run

As a Docker container:

    ~ $ gradle distDocker
    :compileJava UP-TO-DATE
    :processResources UP-TO-DATE
    :classes UP-TO-DATE
    :jar UP-TO-DATE
    :findMainClass
    :startScripts UP-TO-DATE
    :distTar UP-TO-DATE
    :distDocker
    Sending build context to Docker daemon 18.32 MB
    Step 0 : FROM java:8
    ---> 49ebfec495e1
    Step 1 : MAINTAINER Sebastien Soudan <sebastien.soudan@gmail.com>
    ---> Using cache
    ---> d8c50175b0d4
    Step 2 : EXPOSE 8080
    ---> Using cache
    ---> 94747ee1de67
    Step 3 : ADD spring-boot-app-0.1.0.tar /
    ---> 9d308b495c33
    Removing intermediate container 7fb29f40b2dc
    Step 4 : ENTRYPOINT /spring-boot-app-0.1.0/bin/spring-boot-app
    ---> Running in d5dd27466ab9
    ---> 157853a45fbb
    Removing intermediate container d5dd27466ab9
    Successfully built 157853a45fbb
    
    
    BUILD SUCCESSFUL
    
    Total time: 8.775 secs
    
    This build could be faster, please consider using the Gradle Daemon: https://docs.gradle.org/2.6/userguide/ gradle_daemon.html
    ~ $ docker images
    REPOSITORY                      TAG                 IMAGE ID            CREATED             VIRTUAL SIZE
    ssoudan/spring-boot-app         0.1.0               157853a45fbb        10 seconds ago      834.7 MB
    [snip]
    ~ $ docker run -ti -p 8080:8080 ssoudan/spring-boot-app:0.1.0

      .   ____          _            __ _ _
     /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
    ( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
     \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
      '  |____| .__|_| |_|_| |_\__, | / / / /
     =========|_|==============|___/=/_/_/_/
     :: Spring Boot ::        (v1.2.5.RELEASE)

    2015-08-19 18:57:19.228  INFO 1 --- [           main] hello.Application                        : Starting Application on 0475dd9e7d7c with PID 1 (/spring-boot-app-0.1.0/lib/spring-boot-app-0.1.0.jar started by root in /)
    2015-08-19 18:57:19.293  INFO 1 --- [           main] ationConfigEmbeddedWebApplicationContext : Refreshing org.springframework.boot.context.embedded.AnnotationConfigEmbeddedWebApplicationContext@61009542: startup date [Wed Aug 19 18:57:19 UTC 2015]; root of context hierarchy
    [snip]
