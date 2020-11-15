# DataCombiner

Program that combines random numbers from two sources and prints the result. 
The first source is ThreadLocalRandom Java class and the second source is www.random.org service.

Application is targeted to run on systems with Java 11 and Maven installed.

Before trying to run application open terminal window from the main folder of the project and type:
```
mvn compile && mvn package
```

And then to run it:
```
java -jar target/DataCombinerClient-1.0-SNAPSHOT-jar-with-dependencies.jar
```
