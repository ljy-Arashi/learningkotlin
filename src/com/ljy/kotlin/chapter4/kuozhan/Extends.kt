package com.ljy.kotlin.chapter4.kuozhan

import java.lang.StringBuilder

//string循环几次
fun String.multi(time: Int):String{
    val stringBuilder =StringBuilder()
    for (i in 0 until time){
        stringBuilder.append(this)//this指代调用者 指”abc“
    }
    return stringBuilder.toString()
}
//operator运算符方法 times 就是*
operator fun String.times(int: Int):String{
    val stringBuilder =StringBuilder()
    for (i in 0 until int){
        stringBuilder.append(this)//this指代调用者 指”abc“
    }
    return stringBuilder.toString()
}
//扩展成员属性
val String.a:Int
    get() = 6
fun main(args: Array<String>) {
    println("abc".multi(3))
    println("bca" * 2)
    println("asfb".a)//扩展了任意string的属性a，属性默认是6
}
/**
 * 扩展成员
 * 为现有类添加方法，属性
 * fun X.y():Z{...}
 * val X m 注意扩展属性不能初始化，类似接口属性 getter setter
 *Java 调用扩展成员类似调用静态方法
 * */