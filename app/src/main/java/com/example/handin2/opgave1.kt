package com.example.handin2

class Employee(val firstname: String, val lastname: String, salary: Double) {
    var salary: Double = salary
        set(value) {
            field = if (value < 0) 0.0 else value // Prevents negative salary
        }
    init {
        if (salary < 0.0) this.salary = 0.0
    }

}

fun main() {
    val emp1 = Employee("Lukas", "Kansakar", 37.375)
    val emp2 = Employee("Bartholomæus", "Jensen", 20000.0)

    val emp1YearlySalary = emp1.salary * 12
    val emp2YearlySalary = emp2.salary * 12

    println("Employee 1s yearly salary: $emp1YearlySalary")
    println("Employee 2s yearly salary: $emp2YearlySalary")

    val emp1Raise = emp1YearlySalary * 1.1
    val emp2Raise = emp2YearlySalary * 1.1

    println("Employee 1 raise: $emp1Raise")
    println("Employee 2 raise: $emp2Raise")
}