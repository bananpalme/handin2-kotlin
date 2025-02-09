package com.example.handin2

open class Computer(val name: String, var powerOn: Boolean, val size: String) {
    open fun changePower() {
        powerOn = !powerOn
    }
    open fun checkSize() {
        println("YO! THIS COMPUTER IS $size!!! COOL")
    }
}

class Laptop(name: String, powerOn: Boolean, size: String, var isCool: Boolean) : Computer(name, powerOn, size) {
    fun checkMyStyle() {
        println("Let's see if your laptop is cool. we just got the answer in, and it seems that it is $isCool, thats crazy!")
    }
}

class SmartPhone(name: String, powerOn: Boolean, size: String, val cameraCount: Int) : Computer(name, powerOn, size) {
    fun countCameras() {
        println("Your smartphone has $cameraCount cameras. HOLY FUCKING SHIT!! sorry.")
    }
}

fun main() {
    val laptop1 = Laptop("ASUS1234", false, "Humongous", true)

    laptop1.checkMyStyle()
    laptop1.checkSize()

    val smartphone1 = SmartPhone("Lizzie", true, "tiny", 4000)

    smartphone1.countCameras()
    smartphone1.changePower()
    println("Device power: ${smartphone1.powerOn}")
}