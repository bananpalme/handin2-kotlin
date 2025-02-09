package com.example.handin2

// Parent class Shape
abstract class Shape2(val color: String, val isTransparent: Boolean) {
    // Abstract methods to be implemented by subclasses
    abstract fun calculatePerimeter(): Double
    abstract fun calculateArea(): Double
}

// Circle class, inheriting from Shape
class Circle2(val radius: Double, color: String, isTransparent: Boolean) : Shape2(color, isTransparent) {
    private val perimeter: Double = 2 * Math.PI * radius
    private val area: Double = Math.PI * radius * radius

    // Implementing calculatePerimeter
    override fun calculatePerimeter(): Double {
        return perimeter
    }

    // Implementing calculateArea
    override fun calculateArea(): Double {
        return area
    }
}

// Triangle class, inheriting from Shape
class Triangle2(val sideA: Double, val sideB: Double, val sideC: Double, color: String, isTransparent: Boolean) : Shape2(color, isTransparent) {
    private val perimeter: Double = sideA + sideB + sideC
    private val semiPerimeter: Double = perimeter / 2
    private val area: Double = Math.sqrt(semiPerimeter * (semiPerimeter - sideA) * (semiPerimeter - sideB) * (semiPerimeter - sideC))

    // Implementing calculatePerimeter
    override fun calculatePerimeter(): Double {
        return perimeter
    }

    // Implementing calculateArea
    override fun calculateArea(): Double {
        return area
    }
}

// Example usage
fun main() {
    val circle = Circle2(5.0, "Red", false)
    println("Circle - Color: ${circle.color}, Transparent: ${circle.isTransparent}")
    println("Perimeter: ${circle.calculatePerimeter()}")
    println("Area: ${circle.calculateArea()}")

    val triangle = Triangle2(3.0, 4.0, 5.0, "Blue", true)
    println("\nTriangle - Color: ${triangle.color}, Transparent: ${triangle.isTransparent}")
    println("Perimeter: ${triangle.calculatePerimeter()}")
    println("Area: ${triangle.calculateArea()}")
}
