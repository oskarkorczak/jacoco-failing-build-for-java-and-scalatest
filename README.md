README
======

Skeleton project for JaCoCo coverage analysis failing the build, when not meeting the threshold.
Production code in Java and tests written in ScalaTest.

Based on below GH repositories:

https://github.com/sebastianharko/gradle-sonar-scala-scalatest-junit-coverage
https://github.com/springfox/springfox/tree/fb780ee1f14627b239fba95730a69900b9b2313a

Running:
-------
Use proper limits map defined in build.gradle in order to run or fail the build.

./gradlew clean check
