# Java Hero [![Codacy Badge](https://api.codacy.com/project/badge/Grade/dec313da3c1a4b7997c2f638738d8f53)](https://www.codacy.com/app/Sylhare/Java_hero?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=Sylhare/Java_hero&amp;utm_campaign=Badge_Grade)
[![forthebadge](http://forthebadge.com/images/badges/built-with-grammas-recipe.svg)](http://forthebadge.com) [![forthebadge](http://forthebadge.com/images/badges/you-didnt-ask-for-this.svg)](http://forthebadge.com)

Here is a little playground for Java development. 

## Some Java insight

The java language developped by Oracle is:

- Portbale, robust and dynamic
- Plateform independant
- Runs on the JVM (Java Virtual Machine) which is system dependant

With the JVM, you can write `.java` files, that get compiled into Java bytecodes into `.class` file. The `.class` files can be executed on the Java Virtual Machine.

## Environment set up

OS: Windows 7+

I first learned with the NetBeans Bundle: [here](http://www.oracle.com/technetwork/java/javase/downloads/jdk-netbeans-jsp-142931.html) which had the Oracle Jave SDK and the IDE.

### Get the SDK
SDK for Software Development Kit also called JDK - Java Development Kit.
You can get the Oracle Java SDK [here](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html). Choose the one for your system, here for windows. </br>
There's the Oracle JDK (Comercial, Stable with proprietary code from Oracle) and the Open JDK (Open source, maintained by Oracle).

The JDK includes, it can be called inside a command prompt:

- The Java compiler javac - **javac**
- The Java Archiving Tool - **jar**
- the Java Debugging Tool  - **jdb**

When installing the JDK, don't forget to add the JAVA_HOME (path to the JDK and JRE - Java Runtime Environment) as an environment variable. 
I have added `setPathJava.bat` script to update the JAVA_HOME. The path variable is only change for the current cmd session. (Need to update the key registry to make it definitive).

### Get an IDE
IDE for Integrated Development Environments. </br>
I'll be trying [IntelliJ: Community version](https://www.jetbrains.com/idea/#chooseYourEdition) by Jet Brain which has pro feature. 
IF you click on the link you should be able to download it (community version is free).

## Maven

#### What is maven

[Maven](http://maven.apache.org/what-is-maven.html) is a framework developped by Apache that add standards in Java projects. By having the same hierarchy it helps keep a consistent project, manage dependencies and falicitate the build. It is a good way to share information and JAR across multiple projects.

> "Maven, a Yiddish word meaning accumulator of knowledge"

Here is a getting startd from the Apache Maven website:

- [Maven getting started in 5 min](http://maven.apache.org/guides/getting-started/maven-in-five-minutes.html)
- [Maven getting started](http://maven.apache.org/guides/getting-started/index.html)

#### The pom.xml file

When using Maven a `pom.xml` file is created to manage the dependencies of the project. Here is a basic example of what it could look like:

```
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>
    <groupId>groupId</groupId>
    <artifactId>Java_hero</artifactId>
	<packaging>jar</packaging>
    <version>1.0-SNAPSHOT</version>

  <build>
        <plugins>
            <plugin>
                <artifactId>maven-compiler-plugin</artifactId>
            </plugin>
        </plugins>
    </build>

    <dependencies>
        <dependency>
            <groupId>com.google.guava</groupId>
            <artifactId>guava</artifactId>
            <version>22.0</version>
        </dependency>

        <dependency>
            <groupId>org.apache.commons</groupId>
            <artifactId>commons-lang3</artifactId>
            <version>3.6</version>
        </dependency>
    </dependencies>

</project>

```
Here are some [details](https://spring.io/guides/gs/maven/) on all of the shown tags:

- `<modelVersion>`: POM model version (always 4.0.0).
- `<groupId>`: Group or organization that the project belongs to. Often expressed as an inverted domain name.
- `<artifactId>`: Name to be given to the project’s library artifact (for example, the name of its JAR or WAR file).
- `<version>`: Version of the project that is being built.
- `<packaging>`: How the project should be packaged (Optional tag). Defaults to "jar" for JAR file packaging. Use "war" for WAR file packaging.
- `<dependencies>`: Dependencies to be installed or loaded with the project
- `<build>``: Define what will be built and how.

### Work with Maven

First make sure maven is installed by running:

	mvn -v

Maven can now be used to build the project:

- `mvn compile` to run the test, compile the project, install the dependencies, create the library package.
- `mvn package` to create the library package (such as a JAR file for example)
- `mvn test` to use the maven "surefire" plugin to run unit test in the `src/test/jave` folder with a matching `*Test`name
- `mvn install` to add your project's JAR file to your local repository (like a `compile` but making it ready as a dependency to be referenced by another project

## IntelliJ

IntelliJ is an IDE developped by [JetBrain](https://www.jetbrains.com/idea/), the community version is free and comes with a lot of pro features (that might be overkill in some cases).

### Getting started with IntelliJ
First you have to create a Java project: File **>** New **>** Project.
When a screen pops up, you need to specify the link to your project SDK. 

- You should find the path to the SDK here : `C:\Program Files (x86)\Java` with a name such as `jdk1.8.1_02`
- Or you can use the installed JDK of IntelliJ (Clicking the down arrow and selecting it)

Then you can start your project, creating a class and doing some coding.
To compile the code, you will need to hit the `build` button (top right) or `ctrl + F9`. 

To Run it, will have to edit configurations (next to the build button). Click on the arrow and select `Edit Configurations`. </br>
A window appear, on the left side there's a dropdown menu (called `Defaults`). Click on it and select `Application`. On the right panel, add a name and the main class you've just created. Press ok to validate. 

Now that you have that set up you should see a green arrow next to that field (next to the build button). If you click on it, it will run your project and you'll see on the bottom a split screen with the output (like Netbeans, yeah!).

### Maven on IntelliJ

So to use [Maven](https://github.com/Sylhare/Java_hero#maven) with IntelliJ, you first need to right click on a project and select **Add framework support ...**.

A new page will show up and you can select *Maven*, it will automatically reformat your code structure to adapt to Maven. A **pom.xml** will be created.

:warning: Sometime IntelliJ push the compiler to v1.5 [#2](https://github.com/Sylhare/Java_hero/issues/2). There is two way to specify the right language for the compiler in the pom.xml file. Either add or modify the already existing `<build>` tag in the `<project>` tag : 

```html
    <build>
        <plugins>
            <plugin>
                <artifactId>maven-compiler-plugin</artifactId>
                <configuration>
                    <source>1.8</source>
                    <target>1.8</target>
                </configuration>
            </plugin>
        </plugins>
    </build>
```

The above solution worked great on IntelliJ. You can also can try this solution from [Apache Maven](http://maven.apache.org/plugins/maven-compiler-plugin/examples/set-compiler-source-and-target.html).


### Setting up dependencies, add external librairies

You can add external librairies to your Java project. Here are two ways of doing in with IntelliJ.

####  with JAR

You can download the JAR file of the external librairy and add it to your project. For that you can do go on **File** > **Project Structure** (or `[ALT] + [ctrl] + [shift] + [S]`).

Once there you can click on the green plus and add the .jar file. (Save the Jar in your place for librairies such as *lib/directory*).

Now you should be all set, you can now import the library:

```java
//Importing a librairy
import main.java.com.librairy;
```

#### with Maven

To add an external librairy to your project, just copy and past the `<dependency>` into `<dependencies>` inside `<project>` of your pom.xml

Here for example for the [Guava](https://github.com/google/guava) librairy from Google:

```html
<project>
	<!-- information about your project -->
	<dependencies>
	        <dependency>
	            <groupId>com.google.guava</groupId>
	            <artifactId>guava</artifactId>
	            <version>22.0</version>
	        </dependency>
	<dependencies>
</project>
```

----------------------------------------------------------------------------------------------------------------

## What's so special coding in JAVA

Here are some key features that are good to keep in mind. If one's want to learn, I would suggest going on these websites:

- [Open Classroom](https://openclassrooms.com/courses/apprenez-a-programmer-en-java) (French)
- [Sololearn](https://www.sololearn.com/Course/Java/) (English)

### I. Encapsulation

Encapsulation is made through keywords that define how the object (method, attribute, ...) can be accessed.
We call it encapsulation because it can isolate and control data access.

#### private

With private, you make the value or method unavailable outside the class it's in.
In order to get to private attribute, you'll need to use "getter" and "setter" that will get and return the value, or that will set the value correctly. 
That way you have more control and flexibility on the access and modifications of the attributes.

#### protected

A protected value or method will only be available inside the same package or child class (even in foreign package). 
Packages are Like the folders where the `.java` file is stored

#### public

It has no restrictions and can be available from anywhere and modified direclty. However the class which it's called from should be instanced before.

#### Other keywords that goes with encapsulation
##### 1. final

The final key word should be placed before the type.

- For a variable, it means it can't be reassigned.
- For a method, it means it can't be overrided in by a child class. (So an abstract method can't be final) 
- For a class, it means that a child class can't be created from the final one.

##### 2. static

A static field, method or class has a single instance for the whole class that defines it, even if there is no instance of this class in the program. It can so be called from anywhere. </br>
It should be placed before the final keyword.
</br></br>

### II. Polymorphism

Polymorphism refers to the idea of having multiple forms, it occurs with child class and parent class when you inherite or pass a method. Each class can have its own implementation of the same method.

#### Overriding

Overriding is *runtime polymorphism* when you change the inherited method (can't override final or static, can't narrow encapsulation). Overrinding is tagged in java thanks to the `@Overriding` keyword.

#### Overloading

Overloading is *compile-time polymorphism* when you declare multiple time the same method but with different input. There's no particular keyword for over loading, only multiple methods with same name but different arguments.
</br></br>

### III. Inheritance

Inheritance refers to the process that enables one class to acquire the methods and variable of a parent class thanks to the `extends` keyword:

- The class inheriting is the *subclass* (also called *child class* or *derived class*).
- The class whose properties are inherited is the *super class* (also called *parent class* or *base class*)

Inheritance can be regulated thanks to the encapsulation keywords seen above (public, private, ...). </br>
The parent constructor (which are called when the class is instanced) can't be inherited by the child class. However it is automatically called in the constructor of the child class.

The `super()` method can be used to call the parent constructor directly. You can also use the `super` keyword to call directly methods or variables from the parent class (for example `super.method()` or `super.value`)

### IV. Abstraction

The concept of abstraction is that we focus on essential qualities, rather than the specific characteristics of one particular example.

In Java, abstraction is achieved using abstract classes and interfaces.

#### abstract class

An abstract class is a class that have at least one abstract method marked with the `abstract` keyword (put in the definition instead of `public` for example). An abstract method is only a definition, it does not have a body. </br> 
The abstract element are to be implemented in the child class when inherited, it used to give a default behaviour and common characteristics.

#### Interfaces

There's no constructors in an Interface, there's only abstract methods and variables. The interface is set thanks to the `implement` keyword at the definition of the class.</br>
If you wish to store instanced variables however it is best practice to use an Enum instead.

## Java Libraries

### Collection framework

The collection framework is what is inside the `java.util`. And as its name refers to, it contains a lot :

| Interface | Hash Table | Resizable Array | Balanced Tree | Linked List | Hash Table + Linked List |
|-----------|------------|-----------------|---------------|-------------|--------------------------|
| Set       | HashSet    |                 | TreeSet       |             | LinkedHashSet            |
| List      |            | ArrayList       |               | LinkedList  |                          |
| Deque     |            | ArrayDeque      |               | LinkedList  |                          |
| Map       | HashMap    |                 | TreeMap       |             | LinkedHashMap            |

There are more graphical information available in [Java_here/resources](https://github.com/Sylhare/Java_hero/tree/master/resources) :

![Collection framework](https://github.com/Sylhare/Java_hero/blob/master/resources/Collection%20Framework.JPG)

## Automated testing

XUnit and JUnit is used for automated testing on JAVA.

- [junit](http://junit.org/junit4/)
- [xunit](http://xunit.github.io/)

