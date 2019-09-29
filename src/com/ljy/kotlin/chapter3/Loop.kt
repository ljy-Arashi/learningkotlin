package com.ljy.kotlin.chapter3

fun main(args: Array<String>) {
    val arrayOfString: Array<String> = arrayOf("我", "是", "大人")
    for (str in arrayOfString) {
        println(str)
    }

    //(index,value)的值是withIndex()返回的值
    for ((index, value) in arrayOfString.withIndex()) {
        println("$index , $value")
    }

    for (indexValue in arrayOfString.withIndex()) {
        println("$indexValue")
        //println("${indexValue.index},${indexValue.value}")
    }

    val list = MyIntList()
    list.add(1)
    list.add(2)
    list.add(3)

    for (i in list) {
        print(i)
    }

    //while循环
    var x = 5
    while (x > 0) {
        print(x)
        x--
    }

    //do while
    do {
        print(x)
        x--
    } while (x > 0)
}

class MyIterator(val iterator: Iterator<Int>) {
    operator fun next(): Int {
        return iterator.next()
    }

    operator fun hasNext(): Boolean {
        return iterator.hasNext()
    }
}

class MyIntList {
    private val list = ArrayList<Int>()
    fun add(int: Int) {
        list.add(int)
    }

    fun remove(int: Int) {
        list.remove(int)
    }

    operator fun iterator(): MyIterator {
        return MyIterator(list.iterator())
    }
}