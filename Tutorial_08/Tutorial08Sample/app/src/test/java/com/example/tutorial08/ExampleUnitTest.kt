package com.example.tutorial08

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {

    private val calculations = Calculations(10,5)

    @Test
    fun addition_isCorrect() {
        assertEquals(15,calculations.addition())
    }

    @Test
    fun subtraction_isCorrect() {
        assertEquals(5,calculations.subtraction())
    }

    @Test
    fun division_isCorrect() {
        assertEquals(2,calculations.division())
    }

    @Test
    fun multiplication_isCorrect() {
        assertEquals(50,calculations.multiplication())
    }
}