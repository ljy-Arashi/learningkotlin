package com.ljy.kotlin.chapter3

class Complex(val x:Int,val y:Int){
    //操作符重载需要加关键字operator plus是加号+ 通过+可以调用plus方法  plus必须一个参数
    operator fun plus(other:Complex):Complex{
        return Complex(x+other.x,y+other.y)
    }

    //第二个plus
//    operator fun plus(other:Int):Complex{
//        return Complex(x+other,y+other)
//    }

    //第三个plus
    operator fun plus(other:Int):Int{
        return x+other
    }

    override fun toString(): String {
        return "$x+$y"
    }

}

class Books{
    //中缀表达式infix
    infix fun on(any:Any):Boolean{
        return true//随便写的
    }
}

class Desk{

}

fun main(args: Array<String>) {
    val c1=Complex(1,2)
    val c2=Complex(1,2)
    println(c1+c2) //+号就调用了plus方法  调用第一个plus方法 2+4
    //println(c1+5) //调用第二个plus方法  6+7
    println(c1+2) //第三个plus 3
    val arrayOfString:Array<String> = arrayOf("我","是","大人")
    //in 类似  contains 包含于
    if ("我" in arrayOfString){
        println("在数组中")
    }
    //本来没有on这个 但是可以自己写 中缀表达式 infix fun on
    if (Books() on Desk()){
        println("书在桌子上")
    }
}
/**
 * 基本运算符
 *
 * 任何类可以定义或者重载父类
 * 通过运算符对应的具名函数来定义 plus ...
 * 对参数个数作要求，对参数返回值类型不作要求
 * 不能像Scala一样定义任意运算符
 *
 * 中缀表达式
 * 只有一个参数，且用infix修饰的函数
 * 举例
 * class Book{
 * infix fun on(place:String){
 * .....
 * }
 * }
 *
 * Book() on "My Desk" //调用了on 函数
 * */