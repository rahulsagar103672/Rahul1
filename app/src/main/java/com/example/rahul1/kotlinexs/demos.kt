package com.example.rahul1.kotlinexs

fun main() {
    for (i in 1..5) print(i)


printHello("hello")
drive("slow")  //slow = argument

tempToday("mon",32)
add(10,20,'+')
add(operation = '*', secondNo = 20, firstNo = 10)
}

fun double(x: Int) = x * 2


fun add(firstNo:Int, secondNo:Int, operation:Char): Int {
    return firstNo + secondNo
}

fun printHello(name: String?) {
    println("Hi there!")
}

fun drive(speed: String = "fast") {   //speed = param
    println("driving $speed")
}

fun tempToday(day: String, temp: Int) {
    println("Today is $day and it's $temp degrees.")
}