# Cucumber-Java Skeleton

[![Build Status](https://travis-ci.org/cucumber/cucumber-java-skeleton.svg?branch=master)](https://travis-ci.org/cucumber/cucumber-java-skeleton)

This is the simplest possible build script setup for Cucumber using Java.

## BDD (behaviour driven development)

[Cucumber and TDD](https://cucumber.io/blog/2017/05/15/intro-to-bdd-and-tdd)


## Getting started

To build and generate the files, try to run with gradle: 
```
bash gradlew test
```

Or the TestRunner class to run the cucumber test case.
Once run, it will generate information in `./cucumber` you can go in and run (having [cucumber-html-reporter](https://github.com/gkushang/cucumber-html-reporter) node package installed):

```
node index.js
```

To generate the nice looking report!


## Cucumber Introduction

Cucumber works with a `feature` file where you put the `Gherkin` syntax (Given, When, Then).
It is used by non technical team to understand the scenario, test case and steps.

Then there is the `Steps.java` class that is the interpreter of the text in the `feature` file.
It translate the words into actionable methods within the code. Can be linked to unit test and other class.
With intelliJ or by running the `feature` file you can generate with cucumber the skeleton of the function.
The `Steps.java` is called the `glue` and understand the `feature` file through Regex (regular exceptions).

Finally there is the `TestRunner` java file which is used to specify cucumber and test options.
Such as the creation of data on the cucumber tests or the unit test runner. 

## RegEx quick help

Here is the table with some of the Regex basic expression.
You can find more in the `veggieshop.feature` and the implementation in `Steps`

| Expression | Meaning                   |
|------------|---------------------------|
| (.*)       | Match any string          |
| (\\d+)     | Match any number          |
| ^          | Any beginning of a string |
| $          | Any end of a string       |


## Get Technical with Cucumber

Usage of Regex with Cucumber: [Writing Cucumber JVM step definitions](http://blog.czeczotka.com/2014/08/17/writing-cucumber-jvm-step-definitions/)
How to use Cucumber glues, annotation and keywords:

- [Advanced tests with Cucumber](http://www.waitingforcode.com/testing/advanced-tests-with-cucumber/read)
- [Gherkin Keywords](http://toolsqa.com/cucumber/gherkin-keywords/)    
- [Project: Cucumber](https://relishapp.com/cucumber/cucumber/docs/gherkin/scenario-outlines#run-scenario-outline-steps-only)