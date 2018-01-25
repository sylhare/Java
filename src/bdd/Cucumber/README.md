# Cucumber-Java Skeleton

[![Build Status](https://travis-ci.org/cucumber/cucumber-java-skeleton.svg?branch=master)](https://travis-ci.org/cucumber/cucumber-java-skeleton)

This is the simplest possible build script setup for Cucumber using Java.

## Getting started

To build and generate the files, try to run with gradle: 
```
bash gradlew test
```

Or the TestRunner class to run the cucumber test case.
Once run, it will generate information in `./cucumber` you can go in and run (having cucumber-html-reporter node package installed):

```
node index.js
```

To generate the nice looking report.

## Cucumber

Cucumber works with a `feature` file where you put the `Gherkin` syntax (Given, When, Then).
It is used by non technical team to understand the scenario, test case and steps.

Then there is the `Steps.java` class that is the interpreter of the text in the `feature` file.
It translate the words into actionable methods within the code. Can be linked to unit test and other class.
With intelliJ or by running the `feature` file you can generate with cucumber the skeleton of the function.
The `Steps.java` is called the `glue` and understand the `feature` file through Regex (regular exceptions).

Finally there is the `TestRunner` java file which is used to specify cucumber and test options.
Such as the creation of data on the cucumber tests or the unit test runner. 