package com.example.rahul1.kotlinexs

fun main() {
    println("hello world");
    var myStudent: Student = Student("rahul",123,"bangalore")
    println(myStudent.name)
    myStudent.name = "sagar"
    println(myStudent.name)

    var myEmployee: employee = employee("tanveer",222,"chennai")
    println(myEmployee.getName())
    println(myEmployee.name)

}