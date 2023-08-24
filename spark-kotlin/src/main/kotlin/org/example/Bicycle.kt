package org.example

open class Bicycle(var cadence: Int, var speed: Int, var gear: Int) {

    fun printDescription()  = println("Bike is in gear $gear with a cadence of $cadence traveling at speed of $speed")
}