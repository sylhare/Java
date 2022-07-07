# Java 

[![Codacy Badge](https://api.codacy.com/project/badge/Grade/dec313da3c1a4b7997c2f638738d8f53)](https://www.codacy.com/app/sylhare/Java_hero?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=Sylhare/Java_hero&amp;utm_campaign=Badge_Grade)

[![forthebadge](http://forthebadge.com/images/badges/built-with-grammas-recipe.svg)](http://forthebadge.com) [![forthebadge](http://forthebadge.com/images/badges/you-didnt-ask-for-this.svg)](http://forthebadge.com)

Here is a little playground for Java development. 

## Some Java insight

The java language developed by Oracle is:

- Portable, robust and dynamic
- Platform independent
- Runs on the JVM (Java Virtual Machine) which is system dependant

With the JVM, you can write `.java` files, that get compiled into Java byte codes into `.class` file. The `.class` files can be executed on the Java Virtual Machine.

## Environment set up

### MacOS

Get the open JDK (open source) with brew
```sh
brew install java8
brew install java11
```

then switch between multiple version using an alias to the Home of your java:
```sh
java11='export JAVA_HOME=/Library/Java/JavaVirtualMachines/adoptopenjdk-11.jdk/Contents/Home'
java8='export JAVA_HOME=/Library/Java/JavaVirtualMachines/adoptopenjdk-8.jdk/Contents/Home'
```

### Windows
SDK for Software Development Kit also called JDK - Java Development Kit.
You can get the Oracle Java SDK [here](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html). Choose the one for your system, here for windows. </br>
There's the Oracle JDK (Commercial, Stable with proprietary code from Oracle) and the Open JDK (Open source, maintained by Oracle).

The JDK includes, it can be called inside a command prompt:

- The Java compiler javac - **javac**
- The Java Archiving Tool - **jar**
- the Java Debugging Tool  - **jdb**

When installing the JDK, don't forget to add the `JAVA_HOME` (path to the JDK and JRE - Java Runtime Environment) as an environment variable. 

> Environment variables in windows are accessed via the start up menu (windows key) then:
>
> - right click on computer > properties > advance system settings 
> - Click on the environment variable button

I have added `setPathJava.bat` script to update the `JAVA_HOME`. The path variable is only changed for the current cmd session. (Need to update the key registry to make it definitive).

### Get an IDE
IDE for Integrated Development Environments. </br>
I'll be trying [IntelliJ: Community version](https://www.jetbrains.com/idea/#chooseYourEdition) by Jet Brain which has pro feature. 
If you click on the link you should be able to download it (the community version is free).

## Maven

### What is maven

[Maven](http://maven.apache.org/what-is-maven.html) is a framework developped by Apache that add standards in Java projects. By having the same hierarchy it helps keep a consistent project, manage dependencies and falicitate the build. It is a good way to share information and JAR across multiple projects.

> "Maven, a Yiddish word meaning accumulator of knowledge"

### Installation

Here are the steps to install Maven on [Windows](https://www.mkyong.com/maven/how-to-install-maven-in-windows/):

- Make sure you've intalled java and set `JAVA_HOME`
- Download maven at [maven.apache.org](http://maven.apache.org/download.cgi)
- Unzip it in C:\Program Files\Apache\maven
- Add this location to the `M3_HOME` and `MAVEN_HOME` environment variable
- Add `%M3_HOME%\bin` to the `PATH` environment variable 
	- :warning: no space between the variable path separator `;` and `%M3_HOME%\bin`


#### Maven commands

First make sure maven is installed by running:

	mvn -version

Maven can now be used to build the project:

- `mvn compile` to run the test, compile the project, install the dependencies, create the library package.
- `mvn package` to create the library package (such as a JAR file for example)
- `mvn test` to use the maven "surefire" plugin to run unit test in the `src/test/jave` folder with a matching `*Test`name
- `mvn install` to add your project's JAR file to your local repository (like a `compile` but making it ready as a dependency to be referenced by another project
- `mvn clean install` to copy the libraries if the first one fails.

### Getting started

Here is a getting started from the Apache Maven website:

- [Maven getting started in 5 min](http://maven.apache.org/guides/getting-started/maven-in-five-minutes.html)
- [Maven getting started](http://maven.apache.org/guides/getting-started/index.html)

#### The pom.xml file

When using Maven a `pom.xml` file is created to manage the dependencies of the project. Here is a basic example of what it could look like:

```xml
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
- `<build>`: Define what will be built and how.

## Gradle

[Gradle](https://gradle.org/) is an open source build automation system that builds upon the concepts of Apache Ant and Apache Maven and introduces a Groovy-based domain-specific language (DSL) instead of the XML form used by Apache Maven for declaring the project configuration

### Installation

- [Installation](https://gradle.org/install/)
- [Install on Windows](http://bryanlor.com/blog/gradle-tutorial-how-install-gradle-windows)

### How to use

- [Gradle User guide](https://docs.gradle.org/4.4/userguide/userguide.html)
- [Guides](https://gradle.org/guides/)

## IntelliJ

IntelliJ is an IDE developed by [JetBrain](https://www.jetbrains.com/idea/), the community version is free and comes with a lot of pro features (that might be overkill in some cases).

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

```xml
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


### Setting up dependencies, add external libraries

You can add external libraries to your Java project. Here are two ways of doing in with IntelliJ.

####  with JAR

You can download the JAR file of the external library and add it to your project. For that you can do go on **File** > **Project Structure** (or `[ALT] + [ctrl] + [shift] + [S]`).

Once there you can click on the green plus and add the .jar file. (Save the Jar in your place for libraries such as *lib/directory*).

Now you should be all set, you can now import the library:

```java
//Importing a library
import main.java.com.library;
```

#### with Maven

To add an external library to your project, just copy and past the `<dependency>` into `<dependencies>` inside `<project>` of your pom.xml

Here for example for the [Guava](https://github.com/google/guava) library from Google:

```xml
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
