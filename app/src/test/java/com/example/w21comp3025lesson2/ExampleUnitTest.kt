package com.example.w21comp3025lesson2

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun readOnly(){
        //val is immutable which means, once it has a value, it cannot change
        //this is equivalent to the "final" keyword in Java
        //Java version -> final String flavour =
        val flavour : String = "cookie dough"
//        flavour = "peanut butter"
        println(flavour)
    }

    @Test
    fun changeVar(){
        //Var is said to be "mutable" which means that you can change the value after it is defined
        var flavour = "Moose Tracks"
        flavour = "Salted Caramel"
        println("Flavour allowing a change is $flavour")
    }

    @Test
    fun allowForNull()
    {
        var flavour : String? = null

        if (flavour.equals("Banana Boat"))
            println("Banana boat rocks")
        else
            println(flavour)

        //Java equivalent is if (flavour != null) {....}
        flavour?.let {println("Banana boat") }
    }

    @Test
    fun elvisOperator(){
        var flavour: String? = null

        //elvis ?: if it's null, assign another value
        println(flavour ?: "something else")

        //now change the null to a flavour
        flavour = "Peanut Butter Chocolate"
        println(flavour ?: "something else")
    }

    @Test
    fun nullExperiment(){
        var myVariable : String? = null

        //the !! means that you are asserting it will not be null.  In this case, it will compile but then trigger
        //a  null pointer exception
        if (myVariable!!.length > 5)
            println("Length is greater than 5")
        else
            println("length is 5 or less")

    }

    //In Java public static int multiply(int left, int right){...}
    fun multiply(left:Int, right:Int = 10) : Int{
        return left * right
    }

    @Test
    fun testMultipl(){
        assertEquals(50, multiply(10,5))
        assertEquals(20, multiply(2))
        assertEquals(60, multiply(right=30, left=2))
    }
}

