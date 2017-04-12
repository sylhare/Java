# Java Hero
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

When installing the JDK, don't forget to add the JAVA_HOME (path to the JRE - Java Runtime Environment) as an environment variable. 

### Get an IDE
IDE for Integrated Development Environments. </br>
I'll be trying [IntelliJ: Community version](https://www.jetbrains.com/idea/#chooseYourEdition) by Jet Brain which has pro feature. 
IF you click on the link you should be able to download it (community version is free).

## Getting started with IntelliJ
First you have to create a Java project: File **>** New **>** Project.
When a screen pops up, you need to specify the link to your project SDK. 

- You should find the path to the SDK here : `C:\Program Files (x86)\Java` with a name such as `jdk1.8.1_02`
- Or you can use the installed JDK of IntelliJ (Clicking the down arrow and selecting it)

Then you can start your project, creating a class and doing some coding.
To compile the code, you will need to hit the `build` button (top right) or `ctrl + F9`. 

To Run it, will have to edit configurations (next to the build button). Click on the arrow and select `Edit Configurations`. </br>
A window appear, on the left side there's a dropdown menu (called `Defaults`). Click on it and select `Application`. On the right panel, add a name and the main class you've just created. Press ok to validate. 

Now that you have that set up you should see a green arrow next to that field (next to the build button). If you click on it, it will run your project and you'll see on the botton a split screen with the output (like on Netbeans, yeah!).


