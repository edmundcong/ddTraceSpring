(Assuming that the dd java APM tracing client is under lib/)
`./gradlew build && java -javaagent:lib/dd-java-agent-0.<major version number>.<minor version number>.jar -Ddd.trace.analytics.enabled=true -jar build/libs/gs-rest-service-0.1.0.jar`

Make sure your Datadog Agent is running and if <6.10 make sure your trace agent is running too. Should be accessible via http://localhost:8080

## Caveats:

* Make sure you have gs-rest-service-/<version number/> inside build/libs/ -- i've included this *on purpose*
* also make sure that build.gradle has the necessary dependencies to compile (dd-trace-api, dd-trace-ot, and opentracing-api, opentracing-util)
