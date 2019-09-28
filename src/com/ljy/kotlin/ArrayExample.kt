package com.ljy.kotlin

import com.ljy.kotlin.pack01.Mayor

val arrayOfInt:IntArray= intArrayOf(1,2,3,5)
val arrayOfChar:CharArray= charArrayOf('H','e','l','l','o')
val arrayOfString:Array<String> = arrayOf("我","是","大人")
val arrayOfMayor:Array<Mayor> = arrayOf(Mayor("张"), Mayor("刘"))

fun main(args: Array<String>) {
    println(arrayOfInt.size)
    for (a in arrayOfString){
        println(a)
    }
    //和上面一样for循环
    arrayOfString.forEach {
        println(it)
    }
    println(arrayOfMayor[1])
    arrayOfMayor[0]= Mayor("王")
    println(arrayOfMayor[0])

    println(arrayOfChar.joinToString(""))
    println(String(arrayOfChar))//char 组成了String
    println(arrayOfInt.slice(0..2))
}
/**
 * 数组基本写法
 * val array:Array<T> =arrayOf(...)
 *
 * */