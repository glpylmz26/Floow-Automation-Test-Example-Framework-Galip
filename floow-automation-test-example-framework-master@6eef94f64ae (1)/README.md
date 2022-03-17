# The Floow Automation Test Base Project

This project serves as a base Java Selenium-Webdriver framework for use during the application process. 

It is designed to automate http://www.saucedemo.com

## Technology

* Test library: Junit5
* Browser automation driver: Selenium-Webdriver 4
* Build management: Maven

## Getting Started

Fork this project on GitHub into a public repository and clone it into a local repository on your computer.

From there, import it as a Maven project within your IDE of choice, e.g. IntelliJ Idea, or Eclipse.

## Contents

You will see that the project contains a lightweight framework that will reduce the amount of time the evaluation
process will take, by providing you with some necessary Page Objects, test suites, and methods.

`LoginPageTest.java` has an example testcase. This example test case gives you an idea of the kind of tests you are
to create, as well as allowing you to explore some framework code.

`ProductListPageTest.java` contains a single test definition, as well as an example of `@Before` behaviour that you 
will need while filling out this test suite.

## Assignment

### 1. Add login page tests
  * A page object already exists for this page
  * Its methods have already been populated for your use
  * You may add additional methods if you wish, but it is not expected

### 2. Add product list page tests
  * A page object already exists for this page
  * Its methods have already been populated for your use
  * You may add additional methods if you wish, but it is not expected

### 3. Add cart page tests
  * A page object already exists for this page
  * Its methods **exist, but are not implemented**
  * You should implement its methods and use them within your test cases
  * You may add additional methods if you wish, but it is not expected

### 4. Add product view tests
  * No page object exists for this page
  * Decide what tests you wish to carry out on this page
    * These tests do not need to be extensive, we suggest 2-4 tests
  * Decide what methods need to be created to carry out those tests
    * These methods do not need to be extensive, but enough to carry out some testing on the page
  * Implement your tests