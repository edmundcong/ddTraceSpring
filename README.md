(Assuming that the dd APM tracing client is under lib)
`➜ ./gradlew build && java -javaagent:lib/dd-java-agent-0.27.0.jar -jar build/libs/gs-rest-service-0.1.0.jar`
