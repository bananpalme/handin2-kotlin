package com.example.handin2

abstract class Shape(val color: String, val isTransparent: Boolean) {
    abstract fun calculatePerimeter(): Double
    abstract fun calculateArea(): Double
}

class Circle(color: String, isTransparent: Boolean, private val radius: Double) : Shape(color, isTransparent) {
    override fun calculatePerimeter(): Double {
        return 2 * Math.PI * radius
    }

    override fun calculateArea(): Double {
        return Math.PI * radius * radius
    }
}

class Triangle(color: String, isTransparent: Boolean, private val sideA: Double, private val sideB: Double, private val sideC: Double) : Shape(color, isTransparent) {
    override fun calculatePerimeter(): Double {
        return sideA + sideB + sideC
    }

    override fun calculateArea(): Double {
        val s = calculatePerimeter() / 2  // Semi-perimeter
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC)) // Heron's formula
    }
}

fun main() {
    val circle = Circle("Red", false, 5.0)
    println("Circle - Perimeter: ${circle.calculatePerimeter()}, Area: ${circle.calculateArea()}")

    val triangle = Triangle("Blue", true, 3.0, 4.0, 5.0)
    println("Triangle - Perimeter: ${triangle.calculatePerimeter()}, Area: ${triangle.calculateArea()}")

    println("\nbegge prompts giver næsten det samme resultat, dog bruger experten i opgave4b en interessant metode for at finde arealet af en trekant")
}