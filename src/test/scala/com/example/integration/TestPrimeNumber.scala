package com.example.integration

import org.scalatest._
import org.scalatest.junit.JUnitRunner
import org.junit.runner.RunWith

@RunWith(classOf[JUnitRunner])
class TestPrimeNumber extends FunSuite {

  test("isPrime should throw an Exception for 'big' numbers") {
    intercept[Exception] {
      PrimeNumberHelper.isPrime(2048);
    }
  }

  test("7 should be reported as a prime number") {
    assert(PrimeNumberHelper.isPrime(7) == true)
  }

  test("4 should be reported as non-prime number") {
    assert(PrimeNumberHelper.isPrime(4) == false)
  }
}
