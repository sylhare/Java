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


## What's so special coding in JAVA

Here are some key features that are good to keep in mind. If one's want to learn, I would suggest going on these websites:

- [Open Classroom](https://openclassrooms.com/courses/apprenez-a-programmer-en-java) (FRENCH)
- [Sololearn](https://www.sololearn.com/Course/Java/) (ENGLISH)

### Encapsulation

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

##### final

The final key word should be placed before the type.

- For a variable, it means it can't be reassigned.
- For a method, it means it can't be overrided in by a child class. (So an abstract method can't be final) 
- For a class, it means that a child class can't be created from the final one.

##### static

A static field, method or class has a single instance for the whole class that defines it, even if there is no instance of this class in the program. It can so be called from anywhere. </br>
It should be placed before the final keyword.


### Polymorphism

Polymorphism refers to the idea of having multiple forms, it occurs with child class and parent class when you inherite or pass a method. Each class can have its own implementation of the same method.

#### Overriding

Overriding is *runtime polymorphism* when you change the inherited method (can't override final or static, can't narrow encapsulation). Overrinding is tagged in java thanks to the `@Overriding` keyword.

#### Overloading

Overloading is *compile-time polymorphism* when you declare multiple time the same method but with different input. There's no particular keyword for over loading, only multiple methods with same name but different arguments.

### Inheritance 

Inheritance refers to the process that enables one class to acquire the methods and variable of a parent class thanks to the `extends` keyword:

- The class inheriting is the *subclass* (also called *child class* or *derived class*).
- The class whose properties are inherited is the *super class* (also called *parent class* or *base class*)

Inheritance can be regulated thanks to the encapsulation keywords seen above (public, private, ...). </br>
The parent constructor (which are called when the class is instanced) can't be inherited by the child class. However it is automatically called in the constructor of the child class.

The `super()` method can be used to call the parent constructor directly. You can also use the `super` keyword to call directly methods or variables from the parent class (for example `super.method()` or `super.value`)

### abstraction

The concept of abstraction is that we focus on essential qualities, rather than the specific characteristics of one particular example.

In Java, abstraction is achieved using abstract classes and interfaces.

#### abstract class

An abstract class is a class that have at least one abstract method marked with the `abstract` keyword (put in the definition instead of `public` for example). An abstract method is only a definition, it does not have a body. </br> 
The abstract element are to be implemented in the child class when inherited, it used to give a default behaviour and common characteristics.

#### Interfaces

There's no constructors in an Interface, there's only abstract methods and variables. The interface is set thanks to the `implement` keyword at the definition of the class.</br>
If you wish to store instanced variables however it is best practice to use an Enum instead.


## Automated testing

XUnit and JUnit is used for automated testing on JAVA.

[http://junit.org/junit4/](http://junit.org/junit4/)
[http://xunit.github.io/](http://xunit.github.io/)