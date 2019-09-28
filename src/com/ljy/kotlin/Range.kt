package com.ljy.kotlin

val range:IntRange=0..1024 //整型区间 [0,1024]
val range2:IntRange=0 until 10 //[0,10)
val emptyRange:IntRange = 0..-1 //[0,-1]
fun main(args: Array<String>) {
    println(emptyRange.isEmpty())//返回true
    println(range.contains(500))//true 包含500
    println(500 in range)//同上
    println(10 in 0..10)//true

    for (i in range2){
        print(i) //0~9
    }
}