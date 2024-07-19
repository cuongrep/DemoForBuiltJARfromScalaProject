# DemoForBuiltJARfromScalaProject
This is a basis project to demo how to build JAR file using sbt tool for a Scala project

## Note:
1. You have created a new project without any framework. 
By the command below to compile source code, you can make sure that everything in the src/resources will be included 
in the classpath (./target/scala-2.13/classes)

```bash
sbt clean compile package
```

## References:
https://www.baeldung.com/scala/sbt-fat-jar
https://www.oreilly.com/library/view/scala-cookbook/9781449340292/ch18s03.html#:~:text=Solution,project%20as%20a%20JAR%20file.&text=Unlike%20Java%2C%20in%20Scala%2C%20the,to%20match%20the%20directory%20name.
