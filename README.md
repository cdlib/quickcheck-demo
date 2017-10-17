# quickcheck-demo

## Motivation

What do "traditional" unit test look like? What are there limitations?

* [JUnit 5: Parameterized Tests](http://junit.org/junit5/docs/current/user-guide/#writing-tests-parameterized-tests)

## What is QuickCheck?

"QuickCheck" is a testing library originally written in Haskell (ca. 2000) and is based on Haskell's type system.
QuickCheck, a trademarked product, now commonly refers to any property based testing tool, though the term has stuck.
Many popular test frameworks have adopted the ideas suggested by QuickCheck, though not all rely on type classes / classical inheritance to generate test cases.

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

## Key Terms

* Invariants - properties of a method that do not change with changing object state, or properties that hold for any set of parameters to a stateless method.
* Generators - producers, typically randomized, of parameters or object state for test cases. Generators may produce more test cases than are actually run at verification. Randomness can typically be configured for determinism (repeatability) or non-determinism (serendipity).
* Shrinking / Reduction - taking a set of test parameters and attempting to find a simpler, or more general, set of test parameters that achieve the same result, typically a falsification. For example, if `("ABCDEX","YEDCBA")` fails a boolean `palindrome(a, b)` function, then either `("ABC","CBA")` or `("DEX", "YED")` ought to also fail and is a simpler test case.
