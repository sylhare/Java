### Environment set up

OS: Windows 7+

I first learned with the NetBeans Bundle: [here](http://www.oracle.com/technetwork/java/javase/downloads/jdk-netbeans-jsp-142931.html) which had the Oracle Jave SDK and the IDE.

#### Get the SDK
You can get the Oracle Java SDK (also called JDK) [here](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html). Choose the one for your system, here for windows.
(For Linux, I think open jdk should be preferred)

#### Get an IDE
I'll be trying [IntelliJ: Community version](https://www.jetbrains.com/idea/#chooseYourEdition) by Jet Brain which has pro feature. 
IF you click on the link you should be able to download it (community version is free).

#### Getting started with IntelliJ
First you have to create a Java project: File **>** New **>** Project.
When a screen pops up, you need to specify the link to your project SDK. 

- You should find the path to the SDK here : `C:\Program Files (x86)\Java` with a name such as `jdk1.8.1_02`
- Or you can use the installed JDK of IntelliJ (Clicking the down arrow and selecting it)

Then you can start your project, creating a class and doing some coding.
To compile the code, you will need to hit the `build` button (top right) or `ctrl + F9`. 

To Run it, will have to edit configurations (next to the build button). Click on the arrow and select `Edit Configurations`. </br>
A window appear, on the left side there's a dropdown menu (called `Defaults`). Click on it and select `Application`. On the right panel, add a name and the main class you've just created. Press ok to validate. 

Now that you have that set up you should see a green arrow next to that field (next to the build button). If you click on it, it will run your project and you'll see on the botton a split screen with the output (like on Netbeans, yeah!).

