package com.ljy.kotlin.chapter3

import com.ljy.kotlin.getName2

class X
class A{
    var b=0
    lateinit var c:String //必须初始化，前面加 lateinit 用的时候必须先初始化

    lateinit var d:X
    val e:X by lazy { //val 不能用lateinit，用lazy延迟初始化 Lambda返回T就是X类
        println("初始化x")
        X()
    }

    fun sayHello(name:String)= println("Hello $name")

    val lambHello={name:String -> println("Hello $name")}
//    //getter setter默认实现 ，需要更改得复写
//
//    get() {
//        println("some one gets b")
//        return field
//    }
//    set(value) {
//        println("some one sets b")
//        field=value
//    }
}

fun main(args: Array<String>) {
    println("start")
    val a=A()
    println("init a")
    println(a.b)
    println(a.e)
    a.d= X()
    println(a.d)
    a.c="初始化c"
    println(a.c)
    a.sayHello("fun")
    a.lambHello("lambda fun")
}
/**
 *定义方法
 * 写法与普通函数一样 写在class里面
 * 定义属性 val/var
 * 内部类可以定义属性
 * 例子
 * //aField也是属性  但是notAField就是一个参数，不是类的属性
 * calss Hello(val aField:Int,notAField:Int){
 *
 * var anotherField:Float=3f //类内部的定义方法
 * }
 *
 * 属性访问控制
 * 举例
 * val a:Int =0
 * get()=field //不可以定义setter因为val不可变
 *
 * var b:Float=0f
 * set(value){
 * field=value
 * }
 *
 * 属性初始化
 * 尽量在构造方法中完成
 * 如果无法在构造方法中初始化 降级为局部变量
 * var 用lateinit延迟初始化  val用lazy
 * 可空类型谨慎使用null直接初始化（不建议使用null初始化）
 * */