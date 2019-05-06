(Assuming that the dd java APM tracing client is under lib/)
`./gradlew build && java -javaagent:lib/dd-java-agent-0.<major version number>.<minor version number>.jar -Ddd.trace.analytics.enabled=true -jar build/libs/gs-rest-service-0.1.0.jar`
