package com.example.handin2

open class Product(val name: String, val price: Int, val quantity: Int) {
    open fun identifyProductCategory() {
        println("product")
    }
}

class Shoe(name: String, price: Int, quantity: Int): Product(name, price, quantity) {
    override fun identifyProductCategory() {
        println("I am a shoe")
    }
}

class Tshirt(name: String, price: Int, quantity: Int): Product(name, price, quantity) {
    override fun identifyProductCategory() {
        println("I am a T-shirt")
    }
}

class Book(name: String, price: Int, quantity: Int): Product(name, price, quantity) {
    override fun identifyProductCategory() {
        println("I am a Book")
    }
}

fun main() {
    val shoe1 = Shoe("John", 100, 2)
    shoe1.identifyProductCategory()

    val shirt1 = Tshirt("John", 100, 2)
    shirt1.identifyProductCategory()

    val book1 = Book("John", 100, 2)
    book1.identifyProductCategory()
}