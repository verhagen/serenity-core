[![Build Status](https://snap-ci.com/serenity-bdd/serenity-core/branch/master/build_image)](https://snap-ci.com/serenity-bdd/serenity-core/branch/master)


## Serenity - that feeling you get when you know you can trust your tests

Serenity (previously known as _Thucydides_) is a library designed to make writing automated acceptance tests easier, 
and more fun. 

## What does it do?

Serenity helps structure your automated acceptance tests in order to make them easier to understand and maintain, 
and provides great reporting capabilities on top of tools like JBehave, Cucumber or JUnit. It also provides tight integration 
with WebDriver, to make automated web testing easier and more efficient.

Serenity works in two ways:
  - It instruments your test code and reports on the steps that your tests execute to achieve their goals, and stores the test
  results in a standardized format;
  - It aggregates these test results into clear and meaningful reports, that reflect not only the outcomes of your tests,
  but also the status of your project. For example, you can get Serenity to report on what requirements, features or stories
  you have implemented, and how well (or not) they were tested.
  
## History - Serenity and Thucydides

Serenity was originally called [Thucydides](https://github.com/thucydides-webtests), and the package structure still reflects this history. 
Thucydides is discussed at length in the [BDD in Action](http://www.amazon.com/BDD-Action-Behavior-driven-development-lifecycle/dp/161729165X) 
under the name *Thucydides* - everything discussed in "BDD in Action" is directly applicable for Serenity except for the artifact names.

*Thucydides* was renamed *Serenity* in November 2014, and moving forward, all new work will be done on Serenity. The artifact names reflect this change, e.g.
  - *net.thucydides:thucydides-core* becomes *net.serenity-bdd:serenity-core*
  - *net.thucydides:thucydides-junit* becomes *net.serenity-bdd:serenity-junit*
  - *net.thucydides:thucydides-jbehave* becomes *net.serenity-bdd:serenity-jbehave*
  - *net.thucydides:thucydides-cucumber* becomes *net.serenity-bdd:serenity-cucumber*

and so on.

## Serenity artifacts current releases

| Group Id | Artifact Id | Version |
| -------- | ----------- | ------- |
| `net.serenity-bdd` | `serenity-core`     | [![net.serenity-bdd/serenity-core](https://maven-badges.herokuapp.com/maven-central/net.serenity-bdd/serenity-core/badge.svg)](https://maven-badges.herokuapp.com/maven-central/net.serenity-bdd/serenity-core)             |
| `net.serenity-bdd` | `serenity-journey`  | [![net.serenity-bdd/serenity-core](https://maven-badges.herokuapp.com/maven-central/net.serenity-bdd/serenity-journey/badge.svg)](https://maven-badges.herokuapp.com/maven-central/net.serenity-bdd/serenity-core)     |
| `net.serenity-bdd` | `serenity-junit`    | [![net.serenity-bdd/serenity-core](https://maven-badges.herokuapp.com/maven-central/net.serenity-bdd/serenity-junit/badge.svg)](https://maven-badges.herokuapp.com/maven-central/net.serenity-bdd/serenity-junit)    |
| `net.serenity-bdd` | `serenity-jbehave`  | [![net.serenity-bdd/serenity-core](https://maven-badges.herokuapp.com/maven-central/net.serenity-bdd/serenity-jbehave/badge.svg)](https://maven-badges.herokuapp.com/maven-central/net.serenity-bdd/serenity-jbehave)  |
| `net.serenity-bdd` | `serenity-cucumber` | [![net.serenity-bdd/serenity-core](https://maven-badges.herokuapp.com/maven-central/net.serenity-bdd/serenity-cucumber/badge.svg)](https://maven-badges.herokuapp.com/maven-central/net.serenity-bdd/serenity-cucumber) |
| `net.serenity-bdd` | `serenity-spring`   | [![net.serenity-bdd/serenity-core](https://maven-badges.herokuapp.com/maven-central/net.serenity-bdd/serenity-spring/badge.svg)](https://maven-badges.herokuapp.com/maven-central/net.serenity-bdd/serenity-spring)   |


| Group Id | Artifact Id | Version |
| -------- | ----------- | ------- |
| `net.serenity-bdd` | `serenity-jira-plugin`   | [![net.serenity-bdd/serenity-core](https://maven-badges.herokuapp.com/maven-central/net.serenity-bdd/serenity-jira-plugin/badge.svg)](https://maven-badges.herokuapp.com/maven-central/net.serenity-bdd/serenity-jira-plugin)   |

__@@@TODO__ Where are these artifacts used for?

| Group Id | Artifact Id | Version | Description |
| -------- | ----------- | ------- | ----------- |
| `net.serenity-bdd` | `browse-the-web`   | [![net.serenity-bdd/serenity-core](https://maven-badges.herokuapp.com/maven-central/net.serenity-bdd/browse-the-web/badge.svg)](https://maven-badges.herokuapp.com/maven-central/net.serenity-bdd/browse-the-web)   | |
| `net.serenity-bdd` | `serenity-rest-assured`   | [![net.serenity-bdd/serenity-core](https://maven-badges.herokuapp.com/maven-central/net.serenity-bdd/serenity-rest-assured/badge.svg)](https://maven-badges.herokuapp.com/maven-central/net.serenity-bdd/serenity-rest-assured)   | |
| `net.serenity-bdd` | `serenity-sample-alternative-resources`   | [![net.serenity-bdd/serenity-core](https://maven-badges.herokuapp.com/maven-central/net.serenity-bdd/serenity-sample-alternative-resources/badge.svg)](https://maven-badges.herokuapp.com/maven-central/net.serenity-bdd/serenity-sample-alternative-resources)   | |
| `net.serenity-bdd` | `serenity-test-utils`   | [![net.serenity-bdd/serenity-core](https://maven-badges.herokuapp.com/maven-central/net.serenity-bdd/serenity-test-utils/badge.svg)](https://maven-badges.herokuapp.com/maven-central/net.serenity-bdd/serenity-test-utils)   | Used by Serenity libraries, not intended for external use. |

[ ![Download](https://api.bintray.com/packages/serenity/maven/serenity-core/images/download.svg) ](https://bintray.com/serenity/maven/serenity-core/_latestVersion)


### Serenity archetypes

| Group Id | Artifact Id | Version |
| -------- | ----------- | ------- |
| `net.serenity-bdd` | `serenity-archetypes`     | [![net.serenity-bdd/serenity-archetypes](https://maven-badges.herokuapp.com/maven-central/net.serenity-bdd/serenity-archetypes/badge.svg)](https://maven-badges.herokuapp.com/maven-central/net.serenity-bdd/serenity-archetypes)             |
| `net.serenity-bdd` | `serenity-cucumber-archetype`     | [![net.serenity-bdd/serenity-cucumber-archetype](https://maven-badges.herokuapp.com/maven-central/net.serenity-bdd/serenity-cucumber-archetype/badge.svg)](https://maven-badges.herokuapp.com/maven-central/net.serenity-bdd/serenity-cucumber-archetype)             |
| `net.serenity-bdd` | `serenity-jbehave-archetype`     | [![net.serenity-bdd/serenity-jbehave-archetype](https://maven-badges.herokuapp.com/maven-central/net.serenity-bdd/serenity-jbehave-archetype/badge.svg)](https://maven-badges.herokuapp.com/maven-central/net.serenity-bdd/serenity-jbehave-archetype)             |
| `net.serenity-bdd` | `serenity-junit-archetype`     | [![net.serenity-bdd/serenity-junit-archetype](https://maven-badges.herokuapp.com/maven-central/net.serenity-bdd/serenity-junit-archetype/badge.svg)](https://maven-badges.herokuapp.com/maven-central/net.serenity-bdd/serenity-junit-archetype)             |


### Serenity tools for build integration

| Build Tool | Group Id | Artifact Id | Version |
| ---------- | -------- | ----------- | ------- |
| Ant    | `net.serenity-bdd` | `serenity-ant-task`  | [![net.serenity-bdd/serenity-core](https://maven-badges.herokuapp.com/maven-central/net.serenity-bdd/serenity-ant-task/badge.svg)](https://maven-badges.herokuapp.com/maven-central/net.serenity-bdd/serenity-ant-task)  |
| Maven  | `net.serenity-bdd.maven.plugins` | `serenity-maven-plugin`  | [![net.serenity-bdd/serenity-core](https://maven-badges.herokuapp.com/maven-central/net.serenity-bdd.maven.plugins/serenity-maven-plugin/badge.svg)](https://maven-badges.herokuapp.com/maven-central/net.serenity-bdd.maven.plugins/serenity-maven-plugin)  |
| Gradle | `net.serenity-bdd` | `serenity-gradle-plugin`  | [![net.serenity-bdd/serenity-core](https://maven-badges.herokuapp.com/maven-central/net.serenity-bdd/serenity-gradle-plugin/badge.svg)](https://maven-badges.herokuapp.com/maven-central/net.serenity-bdd/serenity-gradle-plugin)  |


## Version number format

Serenity uses a three-digit version number notation, with the following meaning:
```
 <major>.<minor>.<build>
```
The first and second digits are for more significant updates, including new features or important bug fixes. The third is 
updated automatically for every new release, and is generated by the build process.

## Commit message conventions
Commit messages are used to generate the release notes for each release. To do this, we loosely follow the AngularJS commit conventions: for commit messages to appear in the release notes, the title line needs to respect the following format:
```
  <type>: <message>
```

where `<type>` is one of the following:
  - feat: A new feature
  - fix: A bug fix
  - docs: Documentation only changes
  - style: Changes that do not affect the meaning of the code (white-space, formatting, missing semi-colons, etc)
  - refactor: A code change that neither fixes a bug or adds a feature
  - perf: A code change that improves performance
  - test: Adding missing tests
  - chore: Changes to the build process or auxiliary tools and libraries such as documentation generation

Starting from version 1.0.24, any commits without one of these prefixes will not appear in the release notes.

## Licensing

This distribution, as a whole, is licensed under the terms of the Apache License, Version 2.0
