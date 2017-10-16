# quickcheck-demo

## Motivation

What do "traditional" unit test look like? What are there limitations?

* [JUnit 5: Parameterized Tests](http://junit.org/junit5/docs/current/user-guide/#writing-tests-parameterized-tests)

## What is QuickCheck?

"QuickCheck" is a testing library originally written in Haskell (ca. 2000).
QuickCheck now more broadly means to any property based testing tool, though the term has stuck.
Many popular test frameworks have adopted the ideas suggested by QuickCheck.

* [Wikipedia: QuickCheck](https://en.wikipedia.org/wiki/QuickCheck)

## Examples in your language of choice

* [ScalaTest: Property Based Testing](http://www.scalatest.org/user_guide/property_based_testing)
* [The How and Why of Property-Based Testing in Ruby](https://www.sitepoint.com/the-how-and-why-of-property-based-testing-in-ruby/)
* [QuickCheck in Every Language](http://hypothesis.works/articles/quickcheck-in-every-language/)

## Demonstration code

This repository demonstrates tests in Java using [QuickTheories](https://github.com/ncredinburgh/QuickTheories).
The API is easier to work with than traditional JUnit (<=4) theories.
How does it compare to JUnit Jupiter and other test frameworks (e.g. [Spock: Data Driven Testing](http://spockframework.org/spock/docs/1.0/data_driven_testing.html))?
You can clone this repository and run the tests with Maven.
